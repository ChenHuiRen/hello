package hello.week2;

import java.util.Scanner;

public class ch_2_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		��ʼ��
		Scanner in = new Scanner(System.in);
//		����Ͷ�ҽ��
		System.out.print("��Ͷ�ң�");
		int amount;
		amount=in.nextInt();
		System.out.println("Ʊ�ۣ�10Ԫ");
//		���㲢����
		if(amount>=10) {
			System.out.println("���㣺"+(amount-10));
		}else {
			System.out.println("Ǯ����");
		}
		
	}
}