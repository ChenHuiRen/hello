package hello.week4;

import java.util.Scanner;

public class CycleControl_4_homework1 {
	/*������
	 * ������������n��m��0<n<=m<=200
	 * ��ĳ���Ҫ�����n����������m������֮�����е������ĺͣ�������n�������͵�m��������
	 * ע�⣬�ǵ�n����������m������֮������е�������������n��m֮������е�������
	 * */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt(); 
		int m=in.nextInt();
		int number = 1; //�ж��Ƿ�Ϊ����������
		int sum = 0 ; 	//������
		int count = 0; 	//��count������
		
		while(count<m){
			number++;
			//�ж�number�ǲ�������
			boolean flag=true;
			for(int i=2;i<number;i++)
			{
				if(number%i==0)
				{
					flag=false;
					break;
				}
			}
			//Ϊ����������£�������1��ֵ���
			if(flag)
			{
				count++;
				if(count >=n&&count<=m)
				{
					sum+=number;
				}
			}
		}
		System.out.println(sum);

	}

}
