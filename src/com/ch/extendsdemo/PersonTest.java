package com.ch.extendsdemo;

public class PersonTest {

	public static void main(String[] args) {
		// ��̬
		// ������󸳸����������
		// ���룬����ߡ����������Ƿ��д˷���
		// ���У��ұߡ�ʵ�����е�����������д����ķ���
		Person p1 = new Man();
		p1.eat();
		p1.walk();
		// ���ܵ����������еķ������ԣ�����ʱ��p1��Person����
//		p1.smoking();�������޴˷��������벻ͨ��

		System.out.println(p1.id);// ��̬�����������ԣ�ֻ�����ڷ���
		System.out.println(p1.getId());

		System.out.println("*********************************");

		// ���˶�̬�Ժ��ڴ���ʵ�����Ǽ������������е����Ժͷ�����
		// �������ڱ�������Ϊ���࣬���±���ʱ��ֻ�ܵ��ø��������������Ժͷ������������еĲ��ܵ���

		// ��β��ܵ����������е����Ժͷ�����
		// ����ת��,ǿ������ת��
//		Man m1 = (Man) p1;
//		m1.smoking();

		// ����ת��ʧ�ܷ��� ClassCastException
//		Woman w1 = (Woman) p1;
//		w1.shopping();

		// Ϊ�˱���ת���쳣��������ת��֮ǰ��ʹ��instanceof�ж�
		/*
		 * a instanceof A :�ж϶���a�Ƿ�����A��ʵ��������ǣ�����true
		 */
		if (p1 instanceof Woman) {
			System.out.println("*********Woman********");
			Woman w1 = (Woman) p1;
			w1.shopping();
		}
		if (p1 instanceof Man) {
			System.out.println("*********Man********");
			Man m1 = (Man) p1;
			m1.smoking();
		}
		if (p1 instanceof Person) {
			System.out.println("*********Person********");
		}
		if (p1 instanceof Object) {
			System.out.println("*********Object********");
		}

		Object obj = new Woman();
		Person p2 = (Person) obj;

	}

}
