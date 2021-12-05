package com.ch.exceptionDemo.practice;

/*
 * ��дӦ�ó���EcmDef.java,���������е�����������Ҫ�������븺�����������������
 * �������쳣���д���
 * �������Ͳ�һ��(NumberFormatException)
 * ȱ�������в���(ArrayIndexOutOfBoundsException)
 * ��0(ArithmeticException)
 * ���븺��(EcDef �Զ�����쳣)
 * 
 * ��ʾ��
 *	(1)������(EcmDef)�ж����쳣����(ecm)�������������ܡ�
 *	(2)��main������ʹ���쳣�����������쳣����
 * 	(3)�ڳ����У��Զ����Ӧ���븺�����쳣��
 * 	(4)����ʱ���ܲ��� java EcmDef 20 10 //args[0] = "20"  args[0] = "10" 
 * 	(5)Interger���static����parseInt(String s) ��sת���ɶ�Ӧ��intֵ
 * 		�� int a =Integer.parseInt("314"); //a=314;
 * 
 * 
 */
public class EcmDef {
	public static void main(String[] args) {

		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			int result = ecm(i, j);

			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("�������Ͳ�һ��");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ȱ�������в���");
		} catch (ArithmeticException e) {
			System.out.println("��0");
		} catch (EcDef e) {
			System.out.println(e.getMessage());
		}

	}

	public static int ecm(int i, int j) throws EcDef {
		if (i < 0 || j < 0) {
			throw new EcDef("���ӻ��ĸΪ����");
		}
		return i / j;
	}
}
