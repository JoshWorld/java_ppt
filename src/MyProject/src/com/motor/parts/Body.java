package com.motor.parts;

import java.util.ArrayList;

public class Body {
	protected String 				color;			//	���� ����
	protected int 					numOfDoors;		//	�� ����
	protected int 					numOfWheels;	//	���� ����
	protected ArrayList<Door> 		doors;			//	�� ���� ��ü
	protected ArrayList<Wheel> 		wheels;			//	���� ���� ��ü
	protected Engine				engine;			//	����
	public static final	int			CC		=2000;	//	��ⷮ
	protected int					state	=0;		//	���� ����	{0: ����, 1: ����, 2: ����}
	
	/**
	 * ������
	 * @param color
	 * @param doors
	 * @param wheels
	 */
	public Body(String color, int doors, int wheels){
		this.color = color;
		this.numOfDoors = doors;
		this.numOfWheels= wheels;
		
		assembleBody();
		
		System.out.println(getNumOfDoors() + " ���� ���� ������ ������, " +
							getNumOfWheels() + " ���� ������ ���� "+
							color + " �ڵ����� ����� �����ϴ�.");
	}
	
	/**
	 *  ��ü�� �����Ѵ�.
	 */
	private void assembleBody(){
		//	������ �� ���� ��ŭ �����.
		ArrayList<Door> doorList = new ArrayList<>();
		for(int i=0; i<this.numOfDoors; i++){
			Door door = new Door(i);
			doorList.add(door);
		}
		setDoors(doorList);	//Setter
		
		
		//	������ ���� ���� ��ŭ �����.
		ArrayList<Wheel> wheelList = new ArrayList<>();
		for(int i=0; i<this.numOfWheels; i++){
			Wheel wheel = new Wheel(17);
			wheelList.add(wheel);
		}
		setWheels(wheelList);	//Setter
		
		//	������ ����� �����Ѵ�.
		setEngine(new Engine(CC));	//Setter
	}
	
	/**
	 * Getters & Setters
	 * @return
	 */
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumOfDoors() {
		return numOfDoors;
	}
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	public ArrayList<Door> getDoors() {
		return doors;
	}
	public void setDoors(ArrayList<Door> doors) {
		this.doors = doors;
	}
	public ArrayList<Wheel> getWheels() {
		return wheels;
	}
	public void setWheels(ArrayList<Wheel> wheels) {
		this.wheels = wheels;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
