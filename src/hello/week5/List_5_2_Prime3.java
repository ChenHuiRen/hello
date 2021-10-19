package hello.week5;


public class List_5_2_Prime3 {
	/*
	 * ���ӣ�����n���ڣ���������������
	 * 
	 * 1.��x=2 2.��2x��3x��4xֱ��ax<n���������Ϊ������ 3.��xΪ��һ��û�б����Ϊ�������������ظ�2��ֱ�����е������Ѿ��������
	 * 
	 * �㷨ʵ�֣� 1.����primeΪboolean[n],��ʼ��������Ԫ��Ϊtrue,prime[x]Ϊtrue��ʾx������ 2.��x=2
	 * 3.���x������������ڣ�i=2;x*i<n;i++�� �����е�prime[x*i]�ĳ�false 4.��x++�����x<n,�ظ�3���������
	 */
	public static void main(String[] args) {
		// ����100���ڵ�������
		boolean[] primes = new boolean[100];
		for (int i = 2; i < primes.length; i++) {
			primes[i] = true;
		}
		for (int i = 2; i < primes.length; i++) {
			if (primes[i]) {
				for (int k = 2; k * i < primes.length; k++) {
					primes[k * i] = false;
				}
			}
		}

		for (int i = 2; i < primes.length; i++) {
			if (primes[i]) {
				System.out.print(i + " ");
			}
		}
	}
}