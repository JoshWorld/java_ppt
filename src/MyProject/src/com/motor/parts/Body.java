package com.motor.parts;

import java.util.ArrayList;

public class Body {
	protected String 				color;			//	차량 색상
	protected int 					numOfDoors;		//	문 갯수
	protected int 					numOfWheels;	//	바퀴 갯수
	protected ArrayList<Door> 		doors;			//	문 저장 객체
	protected ArrayList<Wheel> 		wheels;			//	바퀴 저장 객체
	protected Engine				engine;			//	엔진
	public static final	int			CC		=2000;	//	배기량
	protected int					state	=0;		//	차량 상태	{0: 정지, 1: 전진, 2: 후진}
	
	/**
	 * 생성자
	 * @param color
	 * @param doors
	 * @param wheels
	 */
	public Body(String color, int doors, int wheels){
		this.color = color;
		this.numOfDoors = doors;
		this.numOfWheels= wheels;
		
		assembleBody();
		
		System.out.println(getNumOfDoors() + " 개의 문을 가지고 있으며, " +
							getNumOfWheels() + " 개의 바퀴를 가진 "+
							color + " 자동차가 만들어 졌습니다.");
	}
	
	/**
	 *  차체를 조립한다.
	 */
	private void assembleBody(){
		//	정해진 문 갯수 만큼 만든다.
		ArrayList<Door> doorList = new ArrayList<>();
		for(int i=0; i<this.numOfDoors; i++){
			Door door = new Door(i);
			doorList.add(door);
		}
		setDoors(doorList);	//Setter
		
		
		//	정해진 바퀴 갯수 만큼 만든다.
		ArrayList<Wheel> wheelList = new ArrayList<>();
		for(int i=0; i<this.numOfWheels; i++){
			Wheel wheel = new Wheel(17);
			wheelList.add(wheel);
		}
		setWheels(wheelList);	//Setter
		
		//	엔진을 만들어 장착한다.
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
