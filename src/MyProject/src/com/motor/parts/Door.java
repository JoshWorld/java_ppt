package com.motor.parts;

public class Door {
	boolean 	isOpen;	//	���� �ִ��� ����
	int 		where;	//	����� ������
	
	public Door(){}
	public Door(int where){
		this.where = where;
	}
	
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public int getWhere() {
		return where;
	}
	public void setWhere(int where) {
		this.where = where;
	}
	
	
}
