package com.motor.parts;

public class Wheel {
	private	int 	where;		// ��� �� ��������
	final 	int 	size;		// ������ ũ��
	
	public Wheel(int size){
		this.size = size;
	}
	public int getWhere() {
		return where;
	}
	public void setWhere(int where) {
		this.where = where;
	}
	public int getSize() {
		return size;
	}
}