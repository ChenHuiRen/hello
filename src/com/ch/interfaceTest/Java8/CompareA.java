package com.ch.interfaceTest.Java8;

/*
 * JDK8,���˶���ȫ�ֳ����ͳ��󷽷��⣬�����Զ��徲̬������Ĭ�Ϸ���
 */

public interface CompareA {

	// ��̬����
	public static void method1() {
		System.out.println("CompareA:����");
	}

	// Ĭ�Ϸ���
	public default void method2() {
		System.out.println("CompareA:�Ϻ�");
	}

	default void method3() {
		System.out.println("CompareA:����");
	}

}
