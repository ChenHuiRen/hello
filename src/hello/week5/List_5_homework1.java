package hello.week5;

import java.util.Scanner;

public class List_5_homework1 {
	/*��������ʽ֮��
	 * */
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int[] a =new int[101];
		int power; 	//�ݴ�
		int co;		//ϵ��
		int count=0;
		
		//д�����飬��������power��ʾ�ݣ�Ԫ��co��ʾϵ����
		//��co�ӵ�a[power]
		//ֱ�������ڶ���0��
		do{
			power=in.nextInt();
			co=in.nextInt();
			a[power]+=co;
			if(power==0){
				count++;
			}
		}while(count!=2);
		
		for(int i=(a.length-1);i>-1;i--){
			//���Ԫ�ز�Ϊ0�����
			if(a[i]!=0){
				//����������1�����Ԫ��+x+����
				if(i>1){
					System.out.print(a[i]+"x"+i);
					//��������һ������0��Ԫ�ش���0�����+
					for(int k = i-1;k>0;k--){
						if(a[k]!=0){
							if(a[0]>0){
								System.out.print("+");
							}
							break;
						}
					}
				//����������1�����Ԫ��+x
				}else if(i==1){
					System.out.print(a[i]+"x");
				//����������0�����Ԫ��
				}else if(i==0){
					if(a[i]>0){
						System.out.print("+");
					}
					System.out.print(a[i]);
				}
			}
		}
	}
}


