package week;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParseHTML {

    public static ArrayList<Product> parse1(String content)
    {
        
        Document doc = Jsoup.parse(content);
        
        Elements ele = doc.select("ul[class = gl-warp clearfix]").select("li[class=gl-item]");
       
        ArrayList<Product> product=new ArrayList<Product>();
        
        for (Element e : ele) {
            
            String id = e.attr("data-pid");
            String name = e.select("div[class = p-name p-name-type-2]").select("a").select("em").text();
            String price = e.select("div[class=p-price]").select("strong").select("i").text();
            String comment  = e.select("div[class=p-commit]").select("strong").select("a").text();
            
            Product pro=new Product(id,name,price,comment); 
            product.add(pro);
        }
        return product;
    }
    public static ArrayList<Product> parse2(String content)
    {
    	ArrayList<Product> product=new ArrayList<Product>();
        return product;
    }
}
