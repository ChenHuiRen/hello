package hello.week3;

import java.util.Scanner;

public class Loop_3_homework2 {
	/*
	 * ������ż����ֵ ����һ���������Ӹ�λ��ʼ��ÿһλ���ֱ�ţ���λ��1�ţ�ʮλ��2�ţ��Դ����ơ�
	 * ��������ڵ�nλ�ϵ����ּ���x�����x��n����ż����ͬ�������һ��1���������һ��0��
	 * ����������˳��Ѷ�Ӧλ�ı�ʾ��ż�Ե�0��1����¼���������γ���һ�����������֡� ���磬����342315��������������־���001101
	 * ���ն�����λֵ��1��λ��λֵ�������͵õ��˽��13
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number; // ���������
		int x; // ÿһλ������
		int count = 0; // ��λ
		int result = 0; // ���ֵ
		number = in.nextInt();
		while (number > 0) {
			x = number % 10;
			count++;
			if ((x + count) % 2 == 0) { // ���ָ���λ����ż��������������£���ӵ���ż��
				result = result + (int) (Math.pow(2, count - 1));
			}
			number = number / 10;
		}
		System.out.print(result);
	}
}
