package hello.week7;

import java.util.Scanner;
	/* ���ֽ���������
	 * ��Ŀ���ݣ�
	 * ÿ����������������������д�ɼ���������Ҳ�ɳ�Ϊ��������˵���ʽ���⼸�������Ͷ����������������������
	 * ���磬6���Ա��ֽ�Ϊ2x3��
	 * ��24���Ա��ֽ�Ϊ2x2x2x3��
	 * ���ڣ���ĳ���Ҫ����һ��[2,100000]��Χ�ڵ�������Ȼ����������������ֽ�ʽ���������ľ�������ʱ�����������
	 * 
	 * �����ʽ:
	 * һ����������Χ��[2,100000]�ڡ�
	 * 
	 * �����ʽ��
	 * ���磺
	 * n=axbxcxd
	 * ��
	 * n=n
	 * ���еķ���֮�䶼û�пո�x��Сд��ĸx��
	 * 
	 * ����������
	 * 18
	 * ���������
	 * 18=2x3x3
	 * 
	 * ����˼·��
	 * 1.����һ������
	 * boonlean isPrime �����Ƿ�������
	 * 
	 * 2.����һ����n���ж��Ƿ�������
	 * �����������ر���;
	 * ������������2��ʼ������2ѭ��
	 * 	��i��������n%i==0
	 * 	��ӡix;
	 * 	n=n/i;
	 *	break;
	 * */
public class Function_7_homework1 {
	
	// �ж�����
	public static boolean isPrime(int n){
		boolean isPrime=true;
		if(n==2){
			return isPrime;
		}
		for(int i=2;i<Math.sqrt(n)+1;i++){
			if(n%i==0){
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number =in.nextInt();
		System.out.print(number+"=");
		while(!isPrime(number)){
			for(int i=2;i<number;i++){
				// ���i���������ܱ�number����
				if((isPrime(i)) && ((number%i)==0)){
					System.out.print(i+"x");
					number=number/i;
					break;
				}
			}
		}
		System.out.print(number);
	}
}