package hello.week5;

import java.util.Scanner;

public class List_5_2_Query {
	/*
	 * �����в���ĳһԪ��
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] data = { 3, 2, 5, 7, 4, 9, 11, 34, 12, 28 };
		int x = in.nextInt();
		int loc = -1;

		// forѭ��
		for (int i = 0; i < data.length; i++) {
			if (x == data[i]) {
				loc = i;
				break;
			}
		}
		if (loc > -1) {
			System.out.println(x + "�ǵ�" + (loc + 1) + "��");
		} else {
			System.out.println("û�ҵ�" + x);
		}

		/*
		 * for-eachѭ���� �ŵ㣺������� ȱ�㣺��֪��ÿ��Ԫ�ص�λ��
		 */
		boolean found = false;
		for (int k : data) { // ��������data�е�ÿһ��Ԫ�أ�ѭ��ÿһ�У��ó�����ֵ��k
			if (k == x) {
				found = true;
				break;
			}
		}
	}
}