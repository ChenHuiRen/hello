package hello.week3;

import java.util.Scanner;

public class ch_3_2 {
	public static void main(String[] args) {
//		������
		Scanner in = new Scanner(System.in);
		int number = (int)(Math.random()*100+1);//[0,1)
		int a;
		int count=0;
		do{
			a=in.nextInt();
			count++;
			if(a>number) {
				System.out.println("����");
			}else if(a<number) {
				System.out.println("С��");
			}
		}while(a!=number);
		System.out.println("�¶��ˣ�����"+count+"��");
	}
}