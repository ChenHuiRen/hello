package hello.week1;

import java.util.Scanner;

public class Calculate_1_2 {

	public static void main(String[] args) {
		System.out.println("���");
		Scanner in = new Scanner(System.in);
		// System.out.println("echo:" + in.nextLine());
		int amount = 100;
		int price = 0;
		System.out.print("������Ʊ�棺");
		amount = in.nextInt();
		System.out.print("�������");
		price = in.nextInt();
		System.out.println(amount + "-" + price + "=" + (amount - price));
	}

}