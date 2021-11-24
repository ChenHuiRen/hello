package com.ch.interfaceDemo.factorys.nofactory;

/*
 * �޹���ģʽ
 */

interface Car {
	void run();
}

class Audi implements Car {

	@Override
	public void run() {
		System.out.println("�µ�����");

	}

}

class BYD implements Car {

	@Override
	public void run() {
		System.out.println("���ǵ�����");

	}

}

public class NoFactoryDemo {

	public static void main(String[] args) {
		Car a = new Audi();
		Car b = new Audi();
		a.run();
		b.run();

	}

}
