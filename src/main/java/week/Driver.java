package week;



import java.io.IOException;
import java.util.Scanner;

import org.apache.http.client.ClientProtocolException;

public class Driver {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        String urll = "https://search.jd.com/Search?keyword=%E6%89%8B%E6%9C%BA&enc="
        		               + "utf-8&qrst=1&rt=1&stop=1&vt=2&cid2=653&cid3=655&page=";
        String url2 = "https://category.vip.com/suggest.php?keyword=%E6%89%8B%E6%9C%BA&ff=235%7C12%7C1%7C1&page=";
        Scanner scan=new Scanner(System.in);
        System.out.println("选择爬取网站：1、京东  2、唯品会");
        int choose1=scan.nextInt();
        System.out.println("输入爬取页数");
        int page = scan.nextInt();//设置爬取页数
        if(choose1==1) {
        getHTML.urlControl(urll, page,choose1);
        }
        else if(choose1==2) {
        getHTML.urlControl(url2, page,choose1);
        }
        int choose=menu();
	
		while(choose!=6) {
			switch(choose) {
			case 1:sqlselect.select1();break;
			case 2:sqlselect.select2();break;
			case 3:sqlselect.select3();break;
			case 4:sqlselect.select4();break;
			default:
				System.out.println("bye");
				break;
			}
			choose=menu();
		}	
        
    }

	private static int menu() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("=====数据库查询=====");
		System.out.println("1. 按id查询");
		System.out.println("2. 按名字查询  ");
		System.out.println("3. 按价格查询 ");
		System.out.println("4. 按评论查询");
		System.out.println("5. 退出 ");
		System.out.println("请输入选项： ");
		int choose=scan.nextInt();
		while(choose<1||choose>5)
			{System.out.println("请重新输入选项： ");
		    choose=scan.nextInt();}
		return choose;	
		
	}
}

