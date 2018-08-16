package com.motor.parts;

public class Door {
	boolean 	isOpen;	//	열려 있는지 여부
	int 		where;	//	어느쪽 문인지
	
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
