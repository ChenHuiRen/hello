package com.ch.exceptionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

public class ExceptionTest {
	// ***********************����ʱ�쳣**************************
	@Test
	public void test7() {
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);

		int data = fis.read();
		while (data != -1) {
			System.out.print((char) data);
			data = fis.read();
		}
		fis.close();

	}

	// ***********************����ʱ�쳣**************************
	// NullPointerException ��ָ���쳣
	@Test
	public void test1() {
		String str = "abc";
		str = null;
		System.out.println(str.charAt(0));

	}

	// ArrayIndexOutOfBoundsException �����±�Խ��
	@Test
	public void test2() {
		int[] arr = new int[3];
		System.out.println(arr[3]);

	}

	// ClassCastException ����ת���쳣
	@Test
	public void test3() {
		Object obj = new Date();
		String str = (String) obj;
	}

	// NumberFormatException ���ָ�ʽ���쳣
	@Test
	public void test4() {
		String str = "123";
		str = "abc";
		Integer.parseInt(str);
	}

	// InputMismatchException ���벻ƥ���쳣
	@Test
	public void test5() {
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		// �����ַ���
		System.out.println(score);

	}

	// Arithmeticexception �����쳣
	@Test
	public void test6() {
		int a = 4;
		int b = 0;
		// �����ַ���
		System.out.println(a / b);

	}
}
