package com.datangedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.datangedu.model.User;

public class UserRegister {
	public void userRegister() {
		// nextLine()�����û��������ַ�����ʽ���أ�
		// nextInt()�����û���������ֵ��ʽ����
//		int phone = userInput.nextInt();
//		Long phone = userInput.nextLong();
		
		Scanner userInput = new Scanner(System.in);
		User user = new User();
		
		System.out.println("��ӭ����ע��");
		System.out.println("�������û�����");
		
//		String str = "     ";
//		System.out.println(str);
//		System.out.println(str.trim());
		
		
		user.setUsername(userInput.nextLine().trim());
		int num = 0;
		while(user.getUsername().equals("")) {
			if(num >=3) {
				// ��ת����ҳ
				System.err.println("�û�������������࣬�����Ż��û�ϵͳ��ҳ��");
				UserSystem userSystem = new UserSystem();
				userSystem.userSystem();
			}
			System.err.println("�������û���Ϊ�����������룡");
			user.setUsername(userInput.nextLine().trim());
			num++;
		}
		
		
		System.out.println("�������ֻ��ţ�");
		user.setPhone(userInput.nextLine().trim());
		VerifyPhone verifyPhone = new VerifyPhone();
		int verifyPhoneNum = verifyPhone.verifyPhone(user.getPhone());
		System.out.println(verifyPhoneNum);
		while(verifyPhoneNum == 0 || verifyPhoneNum == 1 || verifyPhoneNum == 2) {			
			if(verifyPhoneNum == 0){
				System.err.println("��������ֻ���Ϊ�գ�");
				user.setPhone(userInput.nextLine().trim());
				verifyPhoneNum = verifyPhone.verifyPhone(user.getPhone());
			} else if(verifyPhoneNum == 1) {
				System.err.println("�������ֻ��Ų����Ϲ���11λ��");
				user.setPhone(userInput.nextLine().trim());
				verifyPhoneNum = verifyPhone.verifyPhone(user.getPhone());
			} else if(verifyPhoneNum == 2) {
				System.err.println("�������ֻ��Ų���ȷ��");
				user.setPhone(userInput.nextLine().trim());
				verifyPhoneNum = verifyPhone.verifyPhone(user.getPhone());
			} else if(verifyPhoneNum == 3){
				
			}
		}
		
		
		System.out.println("���������䣺");
		user.setEmail(userInput.nextLine());
		
		System.out.println("���������룺��6-16λ��");
		user.setPassword(userInput.nextLine().trim());
		VerifyPassword verifyPassword = new VerifyPassword();
		int verifyPasswordNum = verifyPassword.verifyPassword(user.getPassword());
		while(verifyPasswordNum == 0 || verifyPasswordNum == 1) {
			if(verifyPasswordNum == 0) {				
				System.err.println("�����������Ϊ�գ������������룡");
				user.setPassword(userInput.nextLine().trim());
				verifyPasswordNum = verifyPassword.verifyPassword(user.getPassword());
			} 
			if(verifyPasswordNum == 1) {
				System.err.println("����������볤�Ȳ�����6-16λ��");
				user.setPassword(userInput.nextLine().trim());
				verifyPasswordNum = verifyPassword.verifyPassword(user.getPassword());
			}
		}
		
		System.out.println("�����ȷ�����룺");
		String verifyConfirm = userInput.nextLine().trim();
		while(!user.getPassword().equals(verifyConfirm)) {
			System.err.println("�����������벻һ�£�������������!");
			user.setPassword(userInput.nextLine().trim());
			verifyPassword = new VerifyPassword();
			verifyPasswordNum = verifyPassword.verifyPassword(user.getPassword());
			while(verifyPasswordNum == 0 || verifyPasswordNum == 1) {
				if(verifyPasswordNum == 0) {				
					System.err.println("�����������Ϊ�գ����������������룡");
					user.setPassword(userInput.nextLine().trim());
				} if(verifyPasswordNum == 1) {
					System.err.println("����������볤�Ȳ�����6-16λ��");
					user.setPassword(userInput.nextLine().trim());
				}
			}
			System.out.println("�����ȷ�����룺");
			verifyConfirm = userInput.nextLine();
		}
		
		System.out.println("���Դ����ݿ�");
		// λ�����ƣ�6-16��
		// ���������Ƿ�һ��
		
		
		try {
//		 preparedStatement
//					1������jar��
//					2��ע������
					Class.forName("com.mysql.cj.jdbc.Driver");
					//3����ȡ���ݿ�����
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xinda?serverTimezone=GMT%2B8","root","sibada");
					// 4������sql
					String sql = "INSERT INTO USER(username, phone, email, PASSWORD) VALUE( ?, ?, ?, ?)";
					// 5����ȡִ��sql�Ķ���
					PreparedStatement ps = con.prepareStatement(sql);
					// 6����������
					ps.setString(1,user.getUsername());
					ps.setString(2,user.getPhone());
					ps.setString(3,user.getEmail());
					ps.setString(4,user.getPassword());
//					 7��ִ��sql���
					int res = ps.executeUpdate();
//					 8�������ؽ��
					if(res != 0) {
						System.out.println("ע��ɹ�,��ת����¼���棡");
					} else {				
						System.err.println("ע��ʧ�ܣ�������һ����");
						UserSystem userSystem = new UserSystem();
						userSystem.userSystem();
					}
//					while(res.next()) {
//						System.out.println(res.getInt(1));
//						System.out.println(res.getString(2));
//						System.out.println(res.getString(3));
//						System.out.println(res.getString(4));
//						System.out.println("�û�����"+res.getString(2)+"\t\t�ֻ���"+res.getString(3)+"\t\t����"+res.getString(4));
//					}
//					 9���ͷ���Դ
					con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
