package hello.week7;

import java.util.Scanner;
	/* ��������
	 * ��Ŀ���ݣ�
	 * һ�������������������п�������������������
	 * ��һ�������ǡ�õ��ڳ��������������֮�ͣ�������ͳ�Ϊ������
	 * ����6=1��2��3(6��������1,2,3)��
	 * 
	 * ���ڣ���Ҫдһ�����򣬶�������������n��m��1<=n<m<1000�������[n,m]��Χ�����е�������
	 * ��ʾ������дһ���������ж�ĳ�����Ƿ���������
	 * 
	 * �����ʽ:
	 * �������������Կո�ָ���
	 * �����ʽ��
	 * ������е��������Կո�ָ������һ�����ֺ���û�пո�
	 * ���û�У������һ�����С�
	 * 
	 * ����������
	 * 1 10
	 * ���������
	 * 6
	 * */
public class Function_7_homework2 {
	//	�ж�����
	public static boolean isPerfect(int n) {
		int sum=0;
		for (int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if (sum==n) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int startNumber =in.nextInt();	//��ʼ
		int endNumber =in.nextInt();	//����
		int count=0;					//�����ļ���
		
		for(int i=startNumber;i<=endNumber;i++) {
			if (isPerfect(i)) {
				count++;
				if(count==1) {
					System.out.print(i);
				}else if(count>1) {
					System.out.print(" "+i);
				}
			}
		}
		
		if(count==0) {
			System.out.println("");
		}
	}
}