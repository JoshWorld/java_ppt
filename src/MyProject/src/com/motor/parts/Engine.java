package com.motor.parts;

public class Engine {
	final int	cc;			// ��ⷮ
	boolean 	isOn;		// �õ� �ɷȴ��� ��������
	int 		gasoline;	// ���� ���� �����ִ� ��
	
	/**
	 * ������ : ��ⷮ�� ������ �������� ���´�.
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
