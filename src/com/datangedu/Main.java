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
		// �������
//		System.out.println("123");
//		System.out.println("1234");
		// ���������
//		System.out.print("123");
//		System.out.print("1234");
		
		System.out.println("��ӭʹ��**ϵͳ!");
		Login login = new Login();
		login.Login();
//		UserRegister userRegister = new UserRegister();
//		userRegister.userRegister();
		
		
		// ʹ��jdbc�������ݿ�,ִ��sql���
		try {
			// preparedStatement
			//1������jar��
			//2��ע������
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			//3����ȡ���ݿ�����
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xinda?serverTimezone=GMT%2B8","root","sibada");
//			// 4������sql
//			String sql = "INSERT INTO USER(username, phone, email, PASSWORD) VALUE( ?, ?, ?, ?)";
//			// 5����ȡִ��sql�Ķ���
//			PreparedStatement ps = con.prepareStatement(sql);
//			// 6����������
//			ps.setString(1,user.getUsername());
//			ps.setString(2,user.getPhone());
//			ps.setString(3,user.getEmail());
//			ps.setString(4,user.getPassword());
			// 7��ִ��sql���
//			int res = ps.executeUpdate();
			// 8�������ؽ��
//			if(res != 0) {
//				System.out.println("�ɹ�");
//			} else {				
//				System.out.println("ʧ��");
//			}
//			while(res.next()) {
//				System.out.println(res.getInt(1));
//				System.out.println(res.getString(2));
//				System.out.println(res.getString(3));
//				System.out.println(res.getString(4));
//				System.out.println("�û�����"+res.getString(2)+"\t\t�ֻ���"+res.getString(3)+"\t\t����"+res.getString(4));
//			}
			// 8���ͷ���Դ
//			con.close();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//1������jar��
			//2��ע������
				// 8.0�汾ע����������Ҫ����cj (com.mysql.cj.jdbc.Driver)
				// 5.0 ����Ҫ��cj (com.mysql.jdbc.Driver)
//			Class.forName("com.mysql.cj.jdbc.Driver");
			//3����ȡ���ݿ�����
				// 8.0 ���ʱ�� ?serverTimezone=GMT%2B8
				// 5.0 ����Ҫ
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xinda?serverTimezone=GMT%2B8","root","sibada");
			// 4�� ����sql���
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
			// 5����ȡִ��sql���Ķ���
//			Statement st = con.createStatement();
			
			
			// sqlע��
//			String password = "123";
//			String password = "1';DELETE FROM USER;";
			// UPDATE USER SET PASSWORD='123'
			//UPDATE USER SET PASSWORD='1';DELETE FROM USER;
//			String sql1 = "UPDATE USER SET PASSWORD='"+password+"'";
			
			
			// 6��ִ��sql���
			
			//execute  ��ɾ�Ĳ鶼��ʹ��  ����ֵֻ��true��false; �з��صĽ����Ϊtrue(select),����ȫΪfalse
			
			// executeUpdate   ��ɾ��  ����ֵΪ��ֵ�͡�  ʧ�ܷ���0, �ɹ�����ִ������
			
			// executeQuery    ��ѯ   ����Ϊ�����
			
//			int res = st.executeUpdate(sql);
//			System.out.println(res);
			// 7���鿴���ؽ��
//			if(res != 0) {
//				System.out.println("�ɹ�");
//			} else {				
//				System.out.println("ʧ��");
//			}
//			while(res.next()) {
//				System.out.println(res.getInt(1));
//				System.out.println(res.getString(2));
//				System.out.println(res.getString(3));
//				System.out.println(res.getString(4));
//				System.out.println("�û�����"+res.getString(2)+"\t\t�ֻ���"+res.getString(3)+"\t\t����"+res.getString(4));
//			}
			
			// 8���ͷ���Դ
//			con.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
