package hello.week5;

import java.util.Scanner;

public class List_5_2_Prime4 {
	/*
	 * ���ӣ�����ǰ50������ �ж��Ƿ��ܱ���֪����<x����������
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] primes = new int[50];
		primes[0] = 2;
		int cnt = 1; // ͬʱĿǰֻ��1��������primes[]��
						// �´��ٷ����������ŵ�primes[cnt]��;
		MAIN_LOOP: for (int x = 3; cnt < 50; x++) {
			// ��3��ʼ��50�����ٸ�����
			// �����е�������x�ܲ���������
			for (int i = 0; i < cnt; i++) {
				if (x % primes[i] == 0) { // ����ܱ����е�����������˵����������������һ��x
					continue MAIN_LOOP;
				}
			}
			// ������е�primes[cnt]������û�з��֣�˵�����������ӵ�primes[cnt]��,Ȼ��cntָ����һ��
			primes[cnt++] = x;
			// primes[cnt]=x;
			// cnt++;
		}
		for (int k : primes) {
			System.out.print(k + " ");
		}
	}
}