package com.ch.innerclassDemo.use2;

public class InnerclassTest {
	// ������-�ֲ��ڲ���
	// �����к��ټ�
	public void method() {
		class AA {

		}
	}

	// ��������һ��Comparable�ӿڵ�ʵ����Ķ���
	public Comparable getComparable() {
		// ����һ��ʵ��Comparable�ӿڵ���
		// ��ʽһ�� �ӿ�����ʵ�������������
		class MyComparable implements Comparable {

			@Override
			public int compareTo(Object o) {
				return 0;
			}

		}
		return new MyComparable();

	}

	public Comparable getComparable2() {
		// ��ʽ���� �ӿڵ�����ʵ�������������
		return new Comparable() {

			@Override
			public int compareTo(Object o) {
				return 0;
			}
		};
	}
}
