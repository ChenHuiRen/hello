package hello.week3;

import java.util.Scanner;

public class Loop_3_homework1 {
/*��ż����
 * 
 * �����ʽ:
 * һϵ���������������ķ�Χ�ǣ�0,100000�����������-1���ʾ���������
 * �����ʽ��
 * ������������һ��������ʾ���������е������ĸ������ڶ���������ʾ���������е�ż���ĸ�����
 * ��������֮���Կո�ָ���
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int number;		//�������
		int oddcount=0;	//�����ĸ���
		int evencount=0; //ż���ĸ���
		number=in.nextInt();
		while(number!=-1){
			if(number%2==0){
				evencount++;
			}else if (number%2==1) {
				oddcount++;
			}
			number=in.nextInt();
		}
		System.out.println(oddcount+" "+evencount);
	}
}
