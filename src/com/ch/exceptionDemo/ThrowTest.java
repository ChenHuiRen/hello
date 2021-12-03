package com.ch.exceptionDemo;

public class ThrowTest {

	public static void main(String[] args) {
		Student s = new Student();
		try {
			s.regit(-1001);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(s);
	}

}

class Student {
	private int id;

	public void regit(int id) throws Exception {
		if (id > 0) {
			this.id = id;
		} else {
			// System.out.println("����id����");
			// �ֶ��׳��쳣
			// throw new RuntimeException("����id����");
			throw new Exception("����id����");
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

}