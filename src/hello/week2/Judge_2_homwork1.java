package hello.week2;

import java.util.Scanner;
/*
 * 
 * ��1124��ʾ11��24�֣���905��ʾ9��5�֣�36��ʾ0��36�֣�7��ʾ0��7�֡�
��Ч�����뷶Χ��0��2359������ĳ��򲻿��ܴӲ��Է���������0��2359������������ݡ�
��ĳ���Ҫ������ʱ���Ӧ��UTCʱ�䣬����ĸ�ʽ���������ͬ�������һ����������ʾUTC��ʱ�ͷ֡�
�����ĸ�λ��ʮλ��ʾ�֣���λ��ǧλ��ʾСʱ��
���СʱС��10����û��ǧλ���֣�
���Сʱ��0����û�а�λ���֣�
�����С��10�֣���Ҫ����ʮλ�ϵ�0��
���ѣ�ҪС�Ŀ��յĻ��㡣

˼·��
1.��ȡ������BJT
2.����UTC
���BJT>=800,˵�������գ�UTC=BJT-800
���BJT<800,˵�����գ�UTC=2359-(800-BJT)
3.���UTC
 * */
public class Judge_2_homwork1 {
	public static void main(String[] args) {
		int BJT,UTC;
//		��ȡBJT
		Scanner in = new Scanner(System.in);
		BJT = in.nextInt();
//		����UTC
		if (BJT >=800) {
			UTC=BJT-800;
		}else {
			UTC=2400-(800-BJT);
		}
// 		���UTC
		System.out.print(UTC);
	}
}