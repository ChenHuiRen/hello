package com.ch.interfacedemo;

public class InterfaceTest {

	public static void main(String[] args) {
		System.out.println(Flyablle.MAX_SPEED);
		System.out.println(Flyablle.MIN_SPEED);
		// Flyablle.MIN_SPEED = 2;

	}

}

interface Flyablle {
	// ȫ�ֳ������Զ�ʡ��public static final
	public static final int MAX_SPEED = 7900;
	int MIN_SPEED = 1;

	// ���󷽷����Զ�ʡ��public abstract
	public abstract void fly();

	void stop();

}

class Plane implements Flyablle {

	@Override
	public void fly() {
		System.out.println("ͨ���������");

	}

	@Override
	public void stop() {
		System.out.println("��ʻԱ����ֹͣ");

	}

}
