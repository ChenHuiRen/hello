package com.ch.interfaceDemo.factorys.method;

/*
 * ��������ģʽ
 * 
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

// �����ӿ�
interface Factory {
	Car getCar();
}

// ����������
class AudiFactory implements Factory {

	@Override
	public Car getCar() {

		return new Audi();
	}

}

class BYDFactory implements Factory {

	@Override
	public Car getCar() {
		return new BYD();
	}

}

// ������
public class FactoryMethod {

	public static void main(String[] args) {
		Car a = new AudiFactory().getCar();
		Car b = new BYDFactory().getCar();
		a.run();
		b.run();
	}

}
