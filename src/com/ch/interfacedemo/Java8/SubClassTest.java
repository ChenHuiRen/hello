package com.ch.interfaceDemo.Java8;

public class SubClassTest {
	public static void main(String[] args) {
		SubClass s = new SubClass();
//		�ӿڵľ�̬����ֻ���ýӿڵ���
//		s.method1();
		CompareA.method1();

		s.method2();

		// �������/ʵ���࣬�̳еĸ����ʵ�ֵĽӿ���������ͬ��ͬ�����ķ�����������û����д�˷���������£�Ĭ�ϵ��õ��Ǹ���ķ���
		s.method3();
	}
}

class SubClass extends SuperClass implements CompareA, CompareB {

	@Override
	public void method2() {
		System.out.println("SubClass:�Ϻ�");
	}

	@Override
	public void method3() {
		System.out.println("SubClass:����");
	}

	public void mymethod() {
		// �����Լ���method3
		this.method3();
		// ���ø�����������
		super.method3();
		// ���ýӿ��е�Ĭ�Ϸ���
		CompareA.super.method3();
		CompareB.super.method3();
	}

}