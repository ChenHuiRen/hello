package com.ch.javabean;

/*
 * JavaBean��һ��Java����д�ɵĿ������齨
 * �������±�׼��Java��
 * 1.���ǹ��õ�
 * 2.�и��޲ι���������
 * 3.�����ԣ����ж�Ӧ��get set����
 * 
 */
public class Customer {
	private int id;
	private String name;

	public Customer() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
