package week;


import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

public class getHTML {
    //建立日志
    private static Logger log = Logger.getLogger(getHTML.class);
    private static String getH(String url) throws Exception {
        //控制台输出日志，这样每条访问的URL都可以在控制台上看到访问情况
        log.info("正在解析" + url); 
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        CloseableHttpResponse response = client.execute(get);

       
        HttpEntity entity = response.getEntity();
        String content;
        if (entity != null) {
            content = EntityUtils.toString(entity, "utf-8");
            client.close();
            response.close();
            return content;
        } else
            return null;
    }
    public static void urlControl(String baseurl, int page,int choose) throws Exception {
        int count = 1;
        ArrayList<Product> product=new ArrayList<Product>();
        if(choose==1)
        {
        while (count < page) {
        	 String u = baseurl + (2 * count - 1) + "&click=1";
        	 product = ParseHTML.parse1(getH(u));
             WriteTo.writeto(product);
            count++;
        }
        }
        else if(choose==2) {
        	 while (count < page) {           
             	 String u = baseurl +count;             
             	 product = ParseHTML.parse1(getH(u));      
                 WriteTo.writeto(product);
                 count++;
             }
        }
        
    }
}