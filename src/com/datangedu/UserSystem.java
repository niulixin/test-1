package com.datangedu;

import java.util.Scanner;

public class UserSystem {
	public void userSystem() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("��¼������1");
		System.out.println("ע��������2");
		System.out.println("�һ�����������3");
		System.out.println("������һ��������quit");
		String adminChange = userInput.nextLine();
		System.out.println(adminChange);
		if(adminChange.equals("1")) {
			// �û���¼
			UserLogin userLogin = new UserLogin();
			userLogin.userLogin();
		} else if(adminChange.equals("2")){
			// �û�ע��
			UserRegister userRegister = new UserRegister();
			userRegister.userRegister();
		} else if(adminChange.equals("3")){
			// �һ�����
			UserRetrievePassword userRetrievePassword = new UserRetrievePassword();
			userRetrievePassword.userRetrievePassword();
		}  else if(adminChange.equals("quit")){
			// �����ʼ���棨�ս���ϵͳ�Ľ��棩
			Login login = new Login();
			login.Login();
		} else {
			System.err.println("��������ȷ�����룡����");
			userSystem();
		}
	}
}
