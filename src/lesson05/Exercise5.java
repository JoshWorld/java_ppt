package lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {

	public static void main(String[] args) {
		Exercise5 exr = new Exercise5();
		exr.practice04();
	}
	public void practice04(){
		System.out.println("0 ���� 10������ ���� �Է��Ͻʽÿ�.");
		String inputData = getInputData();
		int input = Integer.parseInt(inputData);
		if(input>0 && input<=10){
			System.out.println("�����Դϴ�.");
		}else{
			System.out.println("�����Դϴ�.");
		}
	}
	public void practice03(){
		System.out.println("2���� ������ �Է��Ͻʽÿ�.");
		String inputData01 = getInputData();
		String inputData02 = getInputData();
		
		int input01 = Integer.parseInt(inputData01);
		int input02 = Integer.parseInt(inputData02);
		
		if(input01 == input02){
			System.out.println("�� ���ڴ� �����ϴ�.");
		}else if(input01 > input02){
			System.out.println(input02 + "���� " + input01 + "�� Ů�ϴ�.");
		}else if(input02 > input01){
			System.out.println(input01 + "���� " + input02 + "�� Ů�ϴ�.");
		}
	}
	public void practice02(){
		System.out.println("������ �Է��Ͻʽÿ�.");
		String inputData = getInputData();
		int input = Integer.parseInt(inputData);
		
		if(input % 2 == 0){
			// 2�� ������ �������� 0 �̴�.
			System.out.println(input + "(��)�� ¦���Դϴ�.");
		}else{
			// 2�� ������ �������� 0 �� �ƴϴ�.
			System.out.println(input + "(��)�� Ȧ���Դϴ�.");
		}
	}
	
	private String getInputData(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		try{
			input = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		return input;
	}
}
