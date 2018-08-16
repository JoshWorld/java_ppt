package com.motor.parts;

public class Wheel {
	private	int 	where;		// 어느 쪽 바퀴인지
	final 	int 	size;		// 바퀴의 크기
	
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