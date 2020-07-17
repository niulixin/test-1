package com.datangedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.datangedu.model.User;

public class UserRegister {
	public void userRegister() {
		// nextLine()，将用户输入以字符串形式返回；
		// nextInt()，讲用户输入以数值形式返回
//		int phone = userInput.nextInt();
//		Long phone = userInput.nextLong();
		
		Scanner userInput = new Scanner(System.in);
		User user = new User();
		
		System.out.println("欢迎进入注册");
		System.out.println("请输入用户名：");
		
//		String str = "     ";
//		System.out.println(str);
//		System.out.println(str.trim());
		
		
		user.setUsername(userInput.nextLine().trim());
		int num = 0;
		while(user.getUsername().equals("")) {
			if(num >=3) {
				// 跳转回首页
				System.err.println("用户名输入次数过多，即将放回用户系统首页！");
				UserSystem userSystem = new UserSystem();
				userSystem.userSystem();
			}
			System.err.println("您输入用户名为空请重新输入！");
			user.setUsername(userInput.nextLine().trim());
			num++;
		}
		
		
		System.out.println("请输入手机号：");
		user.setPhone(userInput.nextLine().trim());
		VerifyPhone verifyPhone = new VerifyPhone();
		int verifyPhoneNum = verifyPhone.verifyPhone(user.getPhone());
		System.out.println(verifyPhoneNum);
		while(verifyPhoneNum == 0 || verifyPhoneNum == 1 || verifyPhoneNum == 2) {			
			if(verifyPhoneNum == 0){
				System.err.println("您输入的手机号为空！");
				user.setPhone(userInput.nextLine().trim());
				verifyPhoneNum = verifyPhone.verifyPhone(user.getPhone());
			} else if(verifyPhoneNum == 1) {
				System.err.println("您输入手机号不符合规则（11位）");
				user.setPhone(userInput.nextLine().trim());
				verifyPhoneNum = verifyPhone.verifyPhone(user.getPhone());
			} else if(verifyPhoneNum == 2) {
				System.err.println("您输入手机号不正确！");
				user.setPhone(userInput.nextLine().trim());
				verifyPhoneNum = verifyPhone.verifyPhone(user.getPhone());
			} else if(verifyPhoneNum == 3){
				
			}
		}
		
		
		System.out.println("请输入邮箱：");
		user.setEmail(userInput.nextLine());
		
		System.out.println("请输入密码：（6-16位）");
		user.setPassword(userInput.nextLine().trim());
		VerifyPassword verifyPassword = new VerifyPassword();
		int verifyPasswordNum = verifyPassword.verifyPassword(user.getPassword());
		while(verifyPasswordNum == 0 || verifyPasswordNum == 1) {
			if(verifyPasswordNum == 0) {				
				System.err.println("您输入的密码为空！，请重新输入！");
				user.setPassword(userInput.nextLine().trim());
				verifyPasswordNum = verifyPassword.verifyPassword(user.getPassword());
			} 
			if(verifyPasswordNum == 1) {
				System.err.println("您输入的密码长度不满足6-16位！");
				user.setPassword(userInput.nextLine().trim());
				verifyPasswordNum = verifyPassword.verifyPassword(user.getPassword());
			}
		}
		
		System.out.println("请二次确认密码：");
		String verifyConfirm = userInput.nextLine().trim();
		while(!user.getPassword().equals(verifyConfirm)) {
			System.err.println("两次输入密码不一致！，请重新输入!");
			user.setPassword(userInput.nextLine().trim());
			verifyPassword = new VerifyPassword();
			verifyPasswordNum = verifyPassword.verifyPassword(user.getPassword());
			while(verifyPasswordNum == 0 || verifyPasswordNum == 1) {
				if(verifyPasswordNum == 0) {				
					System.err.println("您输入的密码为空！，请重新输入密码！");
					user.setPassword(userInput.nextLine().trim());
				} if(verifyPasswordNum == 1) {
					System.err.println("您输入的密码长度不满足6-16位！");
					user.setPassword(userInput.nextLine().trim());
				}
			}
			System.out.println("请二次确认密码：");
			verifyConfirm = userInput.nextLine();
		}
		
		System.out.println("可以传数据库");
		// 位数限制（6-16）
		// 两次输入是否一致
		
		
		try {
//		 preparedStatement
//					1、导入jar包
//					2、注册驱动
					Class.forName("com.mysql.cj.jdbc.Driver");
					//3、获取数据库连接
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xinda?serverTimezone=GMT%2B8","root","sibada");
					// 4、定义sql
					String sql = "INSERT INTO USER(username, phone, email, PASSWORD) VALUE( ?, ?, ?, ?)";
					// 5、获取执行sql的对象
					PreparedStatement ps = con.prepareStatement(sql);
					// 6、插入数据
					ps.setString(1,user.getUsername());
					ps.setString(2,user.getPhone());
					ps.setString(3,user.getEmail());
					ps.setString(4,user.getPassword());
//					 7、执行sql语句
					int res = ps.executeUpdate();
//					 8、处理返回结果
					if(res != 0) {
						System.out.println("注册成功,跳转到登录界面！");
					} else {				
						System.err.println("注册失败，返回上一级！");
						UserSystem userSystem = new UserSystem();
						userSystem.userSystem();
					}
//					while(res.next()) {
//						System.out.println(res.getInt(1));
//						System.out.println(res.getString(2));
//						System.out.println(res.getString(3));
//						System.out.println(res.getString(4));
//						System.out.println("用户名："+res.getString(2)+"\t\t手机号"+res.getString(3)+"\t\t邮箱"+res.getString(4));
//					}
//					 9、释放资源
					con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
