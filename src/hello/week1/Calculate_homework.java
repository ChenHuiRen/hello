package hello.week1;

import java.util.Scanner;

public class Calculate_homework {
	/*
	 * дһ���������¶�ת���������¶ȵĳ���ת���Ĺ�ʽ�ǣ���F = *��C + 32 ����C��ʾ�����¶ȣ�F��ʾ�����¶ȡ�C=(F-32)/(9/5)
	 * �����������һ����������ʾ�����¶ȡ������Ӧ�������¶ȣ�Ҳ��һ�������� ��ʾ��Ϊ�˰Ѽ������ĸ�����ת������������Ҫʹ������ı��ʽ��
	 * (int)x; ����x��Ҫת�����Ǹ���������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Cdegree; // �����¶�
		int Fdegree; // �����¶�
		Scanner in = new Scanner(System.in);
		Fdegree = in.nextInt();
		Cdegree = (int) ((Fdegree - 32) / (9 / 5.0));
		System.out.print(Cdegree);
	}

}