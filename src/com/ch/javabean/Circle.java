package com.ch.javabean;

/*
 * ����Circle�࣬�ṩ˽�е�radius����
 * �ṩ��Ӧ��get set�������ṩ��Բ����ķ���
 */
public class Circle {
	private double radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// ��Բ�������
	public double getArea() {
		return 3.14 * radius * radius;
	}
}
