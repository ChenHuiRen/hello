package com.ch.innerclassDemo.use;

/*
 * 1.��A������B���У�AΪ�ڲ��࣬BΪ�ⲿ��
 * 
 * 2.���ࣺ
 * 		��Ա�ڲ��ࣨ��̬���Ǿ�̬��
 * 				
 * 
 * 		�ֲ��ڲ��ࣨ�����ڡ������ڡ��������ڣ�
 * 
 * 3.��Ա�ڲ���
 * 		��Ϊ�ⲿ��ĳ�Ա
 * 
 * 		��Ϊһ����
 * 
 */
public class InnerclassTest {

}

class Zoom {
	// ��Ա�ڲ���
	class Dog {

	}

	// ��̬��Ա�ڲ���
	static class Cat {

	}

	// �ֲ��ڲ���
	class AA {

	}

	{
		// �ֲ��ڲ���
		class BB {
		}
	}

	// �ֲ��ڲ���
	public Zoom() {
		class CC {

		}
	}
}
