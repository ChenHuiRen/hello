package com.ch.innerclassDemo.use;

/*
 * 1.��A������B���У�AΪ�ڲ��࣬BΪ�ⲿ��
 * 
 * 2.���ࣺ
 * 		��Ա�ڲ��ࣨ��̬���Ǿ�̬��
 * 		�ֲ��ڲ��ࣨ�����ڡ������ڡ��������ڣ�
 * 
 * 3.��Ա�ڲ���
 * 		��Ϊ�ⲿ��ĳ�Ա
 * 			>�����ⲿ��Ľṹ
 * 			>���Ա�static
 * 			>���Ա�4��Ȩ�����η�����
 * 
 * 		��Ϊһ����
 * 			>���Զ������ԡ���������������
 * 			>���Ա�final���Σ���ʾ���಻�ܱ��̳С�
 * 			>���Ա�abstract����
 * 
 * 4.��ע����3������
 * 	1.���ʵ������Ա�ڲ���Ķ���
 * 	2.����ڳ�Ա�ڲ��������ֵ����ⲿ��Ľṹ
 * 	3.�����оֲ��ڲ����ʹ��
 */
public class InnerclassTest {
	public static void main(String[] args) {
		// ����Dogʵ������̬��Ա�ڲ��ࣩ
		Person.Dog dog = new Person.Dog();
		dog.show();
		// ����Birdʵ�����Ǿ�̬��Ա�ڲ��ࣩ
		Person p = new Person();
		Person.Bird bird = p.new Bird();
		bird.Sing();

		// �����ڲ��෽��
		bird.display("���");
	}

}

class Person {
	String name = "С��";
	int age;

	public void eat() {
		System.out.println("�ˣ��Է�");
	}

	// ��̬��Ա�ڲ���
	static class Dog {
		String name;
		int age;

		public void show() {
			System.out.println("����������");
		}

	}

	// �Ǿ�̬��Ա�ڲ���
	class Bird {
		String name = "�ž�";

		public void Sing() {
			System.out.println("С���ڳ���");
			Person.this.eat();// �����ⲿ��ķǾ�̬����
		}

		public void display(String name) {
			// �������β�
			System.out.println(name);
			// �ڲ���Bird������
			System.out.println(this.name);
			// �ⲿ��Person������
			System.out.println(Person.this.name);
		}
	}

	// ��������-�ֲ��ڲ���
	public Person() {
		class AA {

		}
	}

	// �������-�ֲ��ڲ���
	{
		class BB {
		}
	}

	// ������-�ֲ��ڲ���
	public void method() {

		class CC {

		}
	}

}
