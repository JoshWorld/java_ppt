package com.motor.model;

import com.motor.parts.Body;

import com.motor.impl.CarController;

public class Sedan extends Body implements CarController{

	
	public Sedan(String color, int doors, int wheels) {
		super(color, doors, wheels);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void goAhead() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void offEngine() {
		// TODO Auto-generated method stub
		
	}

	
}
