package week;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class WriteTo {

	public static void writeto(ArrayList<Product> product) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/sale?useUnicode=true&characterEncoding=utf-8","root","123456");
		
		String sql1="insert into tproduct(id,name,price,comment) values(?,?,?,?)";
		PreparedStatement ps1=con1.prepareStatement(sql1);
		for(int i=0;i<product.size();i++) {
			ps1.setString(1,product.get(i).getId());
			ps1.setString(2,product.get(i).getName());
			ps1.setString(3,product.get(i).getPrice());
			ps1.setString(4,product.get(i).getComment());
		}
		ps1.close();
		con1.close();
	}
	
}