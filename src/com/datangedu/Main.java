package com.datangedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.datangedu.model.User;



public class Main {

	public static void main(String[] args) {
		// 换行输出
//		System.out.println("123");
//		System.out.println("1234");
		// 不换行输出
//		System.out.print("123");
//		System.out.print("1234");
		
		System.out.println("欢迎使用**系统!");
		Login login = new Login();
		login.Login();
//		UserRegister userRegister = new UserRegister();
//		userRegister.userRegister();
		
		
		// 使用jdbc连接数据库,执行sql语句
		try {
			// preparedStatement
			//1、导入jar包
			//2、注册驱动
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			//3、获取数据库连接
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xinda?serverTimezone=GMT%2B8","root","sibada");
//			// 4、定义sql
//			String sql = "INSERT INTO USER(username, phone, email, PASSWORD) VALUE( ?, ?, ?, ?)";
//			// 5、获取执行sql的对象
//			PreparedStatement ps = con.prepareStatement(sql);
//			// 6、插入数据
//			ps.setString(1,user.getUsername());
//			ps.setString(2,user.getPhone());
//			ps.setString(3,user.getEmail());
//			ps.setString(4,user.getPassword());
			// 7、执行sql语句
//			int res = ps.executeUpdate();
			// 8、处理返回结果
//			if(res != 0) {
//				System.out.println("成功");
//			} else {				
//				System.out.println("失败");
//			}
//			while(res.next()) {
//				System.out.println(res.getInt(1));
//				System.out.println(res.getString(2));
//				System.out.println(res.getString(3));
//				System.out.println(res.getString(4));
//				System.out.println("用户名："+res.getString(2)+"\t\t手机号"+res.getString(3)+"\t\t邮箱"+res.getString(4));
//			}
			// 8、释放资源
//			con.close();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//1、导入jar包
			//2、注册驱动
				// 8.0版本注册驱动是需要加上cj (com.mysql.cj.jdbc.Driver)
				// 5.0 不需要加cj (com.mysql.jdbc.Driver)
//			Class.forName("com.mysql.cj.jdbc.Driver");
			//3、获取数据库连接
				// 8.0 添加时区 ?serverTimezone=GMT%2B8
				// 5.0 不需要
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xinda?serverTimezone=GMT%2B8","root","sibada");
			// 4、 定义sql语句
//			String sql = "INSERT INTO USER(username,phone,email,PASSWORD) VALUE('"+username+"','"+phone+"','"+email+"','"+password+"')";
			
//			String sql = "INSERT INTO USER(username,phone,email,PASSWORD)VALUE(\"niulixin8\",\"13345678900\",\"123@163.com\",\"123456\")";
			
//			String sql = "DELETE FROM USER WHERE username='niu'";
			
//			String sql = "UPDATE USER SET PASSWORD='123' WHERE username='niulixin' AND phone='13345678900'";
			
//			String sql = "SELECT * FROM USER";
			
			
			
//			String username = "zhagnsan";
//			
//			// 123zhagnsan
//			String sql1 = "123"+username;
//			
//			// VALUE('zhangsan')
//			String sql2 = "VALUE('"+username+"')";
			
			
//			System.out.println(sql);
			// 5、获取执行sql语句的对象
//			Statement st = con.createStatement();
			
			
			// sql注入
//			String password = "123";
//			String password = "1';DELETE FROM USER;";
			// UPDATE USER SET PASSWORD='123'
			//UPDATE USER SET PASSWORD='1';DELETE FROM USER;
//			String sql1 = "UPDATE USER SET PASSWORD='"+password+"'";
			
			
			// 6、执行sql语句
			
			//execute  增删改查都能使用  返回值只有true、false; 有返回的结果集为true(select),否则全为false
			
			// executeUpdate   增删改  返回值为数值型。  失败返回0, 成功返回执行条数
			
			// executeQuery    查询   返回为结果集
			
//			int res = st.executeUpdate(sql);
//			System.out.println(res);
			// 7、查看返回结果
//			if(res != 0) {
//				System.out.println("成功");
//			} else {				
//				System.out.println("失败");
//			}
//			while(res.next()) {
//				System.out.println(res.getInt(1));
//				System.out.println(res.getString(2));
//				System.out.println(res.getString(3));
//				System.out.println(res.getString(4));
//				System.out.println("用户名："+res.getString(2)+"\t\t手机号"+res.getString(3)+"\t\t邮箱"+res.getString(4));
//			}
			
			// 8、释放资源
//			con.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
