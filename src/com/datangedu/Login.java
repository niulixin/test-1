package com.datangedu;

import java.util.Scanner;

import com.datangedu.model.User;

public class Login {
	public void Login() {
		// �������
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("�������Աϵͳ������1");
		System.out.println("�����û�ϵͳ������2");
		int loginChange = userInput.nextInt();
		if(loginChange == 1) {
			//����Աϵͳ
			AdminSystem adminSystem = new AdminSystem();
			adminSystem.adminSystem();
		} else if(loginChange == 2) {
			// �û�ϵͳ
			System.out.println("��ӭ�û���");
			UserSystem userSystem = new UserSystem();
			userSystem.userSystem();
		} else {
			System.err.println("��������ȷ�����루1��2��!");
			Login();
		}
	}
}
