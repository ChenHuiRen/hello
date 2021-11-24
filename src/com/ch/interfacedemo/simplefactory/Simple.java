package com.ch.interfaceDemo.simplefactory;

/*
 * �򵥹���ģʽ
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

//������
class CarFactory {
	// ��ʽһ
	public static Car getCar(String type) {
		if ("�µ�".equals(type)) {
			return new Audi();
		} else if ("���ǵ�".equals(type)) {
			return new BYD();
		} else {
			return null;
		}
	}

	// ��ʽ��
	public static Car getAudi() {
		return new Audi();
	}

	public static Car getBYD() {
		return new BYD();
	}

}

//������
public class Simple {
	public static void main(String[] args) {
		Car a = CarFactory.getCar("�µ�");
		a.run();
		Car b = CarFactory.getCar("���ǵ�");
		b.run();
	}

}
