package hello.week6;

import java.util.Scanner;

public class Object_6_4 {
	/*�ַ�������
	 * ���������һ�����ǹ����ߣ�����������
	 * String a;
	 * String b;
	 * a=b ��˼Ϊa b��ͬ����ͬһ���ַ���
	 * 
	 * �Ƚ�����String
	 * a.equals(b) 	�Ƚ������Ƿ���ͬ 
	 * a==b 		�Ƚ��ǲ��ǹ���ͬһ���ַ���
	 * */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s= new String("Hello");
		System.out.println(s+12); 		//��12���1 2 �����ַ�
		System.out.println(s+12+24);	//Hello1224���ӺŴ�����������s+12��������string���ٸ�24���㣬����������ַ���
		System.out.println(s+(12+24));	//Hello36
		
		String s2;
		s2= in.next();		//��һ���ʣ��ָ����ǿո����tab \t �س�
		s2= in.nextLine();	//��һ��
		
	}
}