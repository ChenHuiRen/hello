package com.ch.interfaceDemo;

public class USBTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
		// 1.�����ӿڵķ�����ʵ����ķ���������
		Flash flash = new Flash();
		computer.trancsferData(flash);

		// 2.�����ӿڵķ�����ʵ�������������
		computer.trancsferData(new Printer());

		// 3.�����ӿڵ�����ʵ����ķ���������
		USB phone = new USB() {

			@Override
			public void start() {
				System.out.println("�ֻ���������");

			}

			@Override
			public void stop() {
				System.out.println("�ֻ���������");

			}

		};
		computer.trancsferData(phone);

		// 4.�����ӿڵ�����ʵ�������������
		computer.trancsferData(new USB() {

			@Override
			public void start() {
				System.out.println("MP4��������");

			}

			@Override
			public void stop() {
				System.out.println("MP4��������");

			}

		});

	}

}

class Computer {

	public void trancsferData(USB usb) {// ��������USB�������Ǿ���ʵ����
										// USB usb = new Flash();
										// ���ֽӿڵĶ�̬��
		usb.start();
		System.out.println("��ʼ��������");
		usb.stop();
	}
}

interface USB {
	void start();

	void stop();
}

class Flash implements USB {

	@Override
	public void start() {
		System.out.println("U�̿�������");
	}

	@Override
	public void stop() {
		System.out.println("U��ֹͣ����");
	}

}

class Printer implements USB {

	@Override
	public void start() {
		System.out.println("��ӡ����������");
	}

	@Override
	public void stop() {
		System.out.println("��ӡ��ֹͣ����");
	}

}
