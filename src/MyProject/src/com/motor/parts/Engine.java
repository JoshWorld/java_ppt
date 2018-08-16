package com.motor.parts;

public class Engine {
	final int	cc;			// 배기량
	boolean 	isOn;		// 시동 걸렸는지 꺼졌는지
	int 		gasoline;	// 현재 연료 남아있는 양
	
	/**
	 * 생성자 : 배기량은 언제나 정해져서 나온다.
	 * @param cc
	 */
	public Engine(int cc){
		this.cc = cc;
	}
	public int getCc() {
		return cc;
	}
//	public void setCc(int cc) {
//		this.cc = cc;
//	}
	public boolean isOn() {
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	public int getGasoline() {
		return gasoline;
	}
	public void setGasoline(int gasoline) {
		this.gasoline = gasoline;
	}
	
	
}
