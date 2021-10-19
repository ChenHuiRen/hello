package hello.week6;

import java.util.Scanner;

public class Object_6_3 {
	/*
	 * �ַ������� �ַ����Ƕ��󣬶��������в�������ͨ��. ���е� �ַ���.���� ����ʾ��.��ߵ�����ַ������ұߵĲ���
	 * ������ַ��������Ǳ�����Ҳ�����ǳ���
	 * 
	 * 1.String��С�ıȽ�(Unicode) comparteTo() �����ַ������ԱȽϴ�С s1.comparteTo(s2)
	 * s1<s2С������Ǹ��� s1=s2�������0 s1>s2����������� compareToIgnoreCase �����ִ�Сд���Ƚϴ�С
	 * 
	 * 2.���String�ĳ��� length() s1="hello" s1.length()=5 s1="" s1.length()=0
	 * String s1; s1.length() ����
	 * 
	 * 3.����String����ַ� s.charAt(index) ������index�ϵĵ����ַ� index��Χ��0-(length()-1)
	 * ��һ���ַ���index��0��������һ�� ���ǲ�����for-each��ѭ�������ַ���
	 * 
	 * 4.�õ��Ӵ� s.substring(n); �õ���n��λ�õ�ĩβ��ȫ������ s.substring(b,e) �õ���b��λ�õ�e��λ��֮ǰ������
	 * 
	 * 5.Ѱ���ַ� s.indexOf(c) �õ�c�ַ����ڵ�λ�ã������ڷ���-1 s.indexOf(c,n) ��n��λ�ÿ�ʼѰ��c�ַ�
	 * s.indexOf(t) �ҵ��ַ���t���ڵ�λ��
	 * 
	 * ���ұ߿�ʼ�� s.lastIndexOf(c) s.lastIndexOf(c,n) s.lastIndexOf(t) 6.��������
	 * s.startsWith(t) �Ƿ���ĳ�ַ�����ͷ s.endsWith(t) �Ƿ���ĳ�ַ�����β s.trim() ���ַ������˿ո�ȥ��
	 * s.replace(c1,c2) ��c1����c2 s.toLowerCase() ����ĸ������Сд s.toUpperCase()
	 * ����ĸ�����ɴ�д
	 * 
	 * ע�⣺���еĲ�������ı��ַ������������½�һ���ַ����������Ľ��������
	 * 
	 * 7.������switch-case��ʹ���ַ��� switch(s){ case"this":...break;
	 * case"that":...break; }
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = "abc";
		String s2 = "ab";
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i) + " ");
		}

		System.out.println("======================");

		String s3 = "01234567839����";
		System.out.println(s3.substring(2));
		System.out.println(s3.substring(2, 4)); // ���ص�2��3λ��
		System.out.println(s3.indexOf('4')); // ����'4'�ַ�����λ��
		System.out.println(s3.indexOf("9����")); // �ַ���"9����"�ڵ�9��λ��
		// �ҵڶ���3
		int loc = s3.indexOf('3');
		System.out.println(s3.indexOf('3', loc + 1));

		System.out.println("======================");

		String s4 = " abcDEF ";
		System.out.println(s4.startsWith(" ab"));
		System.out.println(s4.endsWith("EF "));
		System.out.println(s4.trim());
		System.out.println(s4.replace('D', '��'));
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());

		System.out.println("======================");

		String s5 = "hello";
		switch (s5) {
		case "hello":
			System.out.println("yes");
			break;
		case "world":
			System.out.println("no");
			break;
		default:
			break;
		}
	}
}