package com.datangedu;

import java.util.Scanner;

import com.datangedu.model.User;

public class Login {
	public void Login() {
		// 输入的类
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("进入管理员系统请输入1");
		System.out.println("进入用户系统请输入2");
		int loginChange = userInput.nextInt();
		if(loginChange == 1) {
			//管理员系统
			AdminSystem adminSystem = new AdminSystem();
			adminSystem.adminSystem();
		} else if(loginChange == 2) {
			// 用户系统
			System.out.println("欢迎用户！");
			UserSystem userSystem = new UserSystem();
			userSystem.userSystem();
		} else {
			System.err.println("请做出正确的输入（1、2）!");
			Login();
		}
	}
}
