package com.ch.interfaceDemo;

/*
 * ����ComparableCircle�࣬�̳�Circle��ʵ��CompareObject�ӿ�
 * ʵ��compartTo�����壬�����Ƚ�����Բ�İ뾶��С
 */
public class ComparableCircle extends Circle implements CompareObject {

	@Override
	public int compartTo(Object o) {
		if (this == o) {
			return 0;
		}

		if (o instanceof ComparableCircle) {
			ComparableCircle c = (ComparableCircle) o;
//			������ʧ���������� 2.3-2.1 = 0
//			return (int) (this.getRadius() - c.getRadius());

			if (this.getRadius() > c.getRadius()) {
				return 1;
			} else if (this.getRadius() < c.getRadius()) {
				return -1;
			} else {
				return 0;
			}

		} else {
			throw new RuntimeException("�������������");
		}

	}

	public ComparableCircle(double radius) {
		super(radius);
	}

	public ComparableCircle() {
		super();
	}

}
