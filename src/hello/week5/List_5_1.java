package hello.week5;

import java.util.Scanner;

public class List_5_1 {
	/*����
	 * ��������ǹ����ߣ�����������
	 * ���������ֵ�Ǹ������Ȩ
	 * 
	 * */
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b =a;
		b[0]=6;
		
		System.out.println(a==b);
		System.out.println(a[0]);
	}
}