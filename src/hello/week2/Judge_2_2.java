package hello.week2;

import java.util.Scanner;

public class Judge_2_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MINOR=35;
		System.out.println("������������䣺");
		Scanner in =new Scanner(System.in);
		
		int age = in.nextInt();
		System.out.println("������䣺"+age);
		if(age<MINOR) {
			System.out.println("���������õ�");
		}
		System.out.println("�����������ľ������磬�ú���ϧ�ɡ�");
	}
}