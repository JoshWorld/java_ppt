package lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {

	public static void main(String[] args) {
		Exercise3 exercise = new Exercise3();
		exercise.practice03();
	}

	private void practice03(){
		System.out.println("����� �� ���Դϱ�?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int age = 0;
		
		String input = "";
		try{
			input = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		age = Integer.parseInt(input);
		System.out.println("����� " + age + "�� �Դϴ�.");
	}
	private void practice04(){
		System.out.println("�������� ���� ���Դϱ�?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float pi = 0;
		
		String input = "";
		try{
			input = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		pi = Float.parseFloat(input);
		System.out.println("�������� ���� " + pi + "�Դϴ�.");
		
	}
	private void practice05(){
		System.out.println("Ű�� �����Ը� �Է��Ͻʽÿ�.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float length = 0;
		float weight = 0;
		
		String inputLength = "";
		String inputWeight = "";
		
		try{
			inputLength = br.readLine();
			inputWeight = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		length = Float.parseFloat(inputLength);
		weight= Float.parseFloat(inputWeight);
		System.out.println("Ű�� " + length + "��Ƽ���� �Դϴ�.");
		System.out.println("�����Դ� " + weight + "ų�α׷� �Դϴ�.");
	}
}
