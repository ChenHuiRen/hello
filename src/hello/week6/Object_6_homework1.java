package hello.week6;

import java.util.Scanner;
/* �����ʳ��ȡ�
��Ŀ���ݣ�
��ĳ���Ҫ����һ���ı��������Կո�ָ�Ϊ���ɸ����ʣ��ԡ�.����������Ҫ��������ı���ÿ�����ʵĳ��ȡ�����ĵ����������޹أ����԰������ַ��ţ����硰it's����һ�����ʣ�����Ϊ4��ע�⣬���п��ܳ��������Ŀո�

�����ʽ:
������һ���и���һ���ı����ԡ�.����������β�ľ�Ų��ܼ��������һ�����ʵĳ����ڡ�

�����ʽ��
��һ������������ı���Ӧ�ĵ��ʵĳ��ȣ�ÿ������֮���Կո��������ĩû�����Ŀո�

����������
It's great to see you here.

���������
4 5 2 3 3 4

����˼·��
1.��ʼ���ַ�������
2.��ȡ�����ַ��� in.next(),���������
3.ѭ��2һֱ������.
*/
public class Object_6_homework1 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String s ;
		s=in.next();
		while(!(s.contains("."))){
			System.out.print(s.length()+" ");
			s=in.next();
		}
		System.out.print((s.length()-1));
	}
}