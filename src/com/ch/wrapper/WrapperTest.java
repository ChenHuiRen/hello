package com.ch.wrapper;

import org.junit.Test;

public class WrapperTest {
	@Test
	public void test1() {
		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1);
	}

	@Test
	public void test2() {
		Object o2;
		if (true) {
			o2 = new Integer(1);
		} else {
			o2 = new Double(2.0);
		}
		System.out.println(o2);
	}

	@Test
	public void test3() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j); // false �Ƚϵ�ַ

		Integer m = 127;// �Զ�װ��,�ײ���һ��
						// Integer�ڲ������˸� Integer cache[]
						// ����[-128,127]�����ⷶΧ�ڵ������Զ��������ȡ

		Integer n = 127;
		System.out.println(m == n);// true

		Integer x = 128;// ����[-128,127]֮��new һ������
		Integer y = 128;
		System.out.println(x == y);// false

	}
}
