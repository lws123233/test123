package week;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class sqlselect {


	public static void select1() throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/sale?useUnicode=true&characterEncoding=utf-8","root","123456");
	    String sql1="select * from tproduct where id=?"; 	
	    System.out.println("输入手机编号");
	    String idnum=scan.nextLine();
	    PreparedStatement ps1=con1.prepareStatement(sql1);
	    ps1.setString(1, idnum);
	    ResultSet rs1=ps1.executeQuery();
	    while(rs1.next()) {
	    	String id=rs1.getString("id");
	    	String name=rs1.getString("name");
	    	String price=rs1.getString("price");
	    	String comment=rs1.getString("comment");
	    	System.out.println(id+","+name+","+price+","+comment);
	    }
	   rs1.close();
	   ps1.close();
	   con1.close();
	}
	public static void select2() throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/sale?useUnicode=true&characterEncoding=utf-8","root","123456");
	    String sql1="select * from tproduct where name=?"; 	
	    System.out.println("输入手机名");
	    String namenum=scan.nextLine();
	    PreparedStatement ps1=con1.prepareStatement(sql1);
	    ps1.setString(1, namenum);
	    ResultSet rs1=ps1.executeQuery();
	    while(rs1.next()) {
	    	String id=rs1.getString("id");
	    	String name=rs1.getString("name");
	    	String price=rs1.getString("price");
	    	String comment=rs1.getString("comment");
	    	System.out.println(id+","+name+","+price+","+comment);
	    }
	   rs1.close();
	   ps1.close();
	   con1.close();
	}
	public static void select3() throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/sale?useUnicode=true&characterEncoding=utf-8","root","123456");
	    String sql1="select * from tproduct where price between ? and ?"; 	
	    System.out.println("输入最低手机价格 ");
	    String pricenum1=scan.nextLine();
	    System.out.println("输入最高手机价格 ");
	    String pricenum2=scan.nextLine();
	    PreparedStatement ps1=con1.prepareStatement(sql1);
	    ps1.setString(1, pricenum1);
	    ps1.setString(2, pricenum2);
	    ResultSet rs1=ps1.executeQuery();
	    while(rs1.next()) {
	    	String id=rs1.getString("id");
	    	String name=rs1.getString("name");
	    	String price=rs1.getString("price");
	    	String comment=rs1.getString("comment");
	    	System.out.println(id+","+name+","+price+","+comment);
	    }
	   rs1.close();
	   ps1.close();
	   con1.close();
	}
	public static void select4() throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/sale?useUnicode=true&characterEncoding=utf-8","root","123456");
	    String sql1="select * from tproduct where comment between ? and ?"; 	
	    System.out.println("输入最低手机评论数 ");
	    String commentnum1=scan.nextLine();
	    System.out.println("输入最高手机评论数 ");
	    String commentnum2=scan.nextLine();
	    PreparedStatement ps1=con1.prepareStatement(sql1);
	    ps1.setString(1, commentnum1);
	    ps1.setString(1, commentnum2);
	    ResultSet rs1=ps1.executeQuery();
	    while(rs1.next()) {
	    	String id=rs1.getString("id");
	    	String name=rs1.getString("name");
	    	String price=rs1.getString("price");
	    	String comment=rs1.getString("comment");
	    	System.out.println(id+","+name+","+price+","+comment);
	    }
	   rs1.close();
	   ps1.close();
	   con1.close();
	}
	
}
