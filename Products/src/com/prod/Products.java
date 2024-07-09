package com.prod;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Products {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Products","root","Sanika@07");
		
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=4; i++) {
			System.out.println("Enter id : ");
			int id = sc.nextInt();
			
			System.out.println("Enter Product Name : ");
			String n = sc.next();
			
			System.out.println("Enter brandname : ");
			String b = sc.next();
			
			PreparedStatement ps = con.prepareStatement("insert into Card values(?, ?, ?);");
			
			ps.setInt(1, id);
			ps.setString(2, n);
			ps.setString(3, b);
			
			ps.executeUpdate();
			ps.close();
			
		}
		con.close();
		
		

	}

}
