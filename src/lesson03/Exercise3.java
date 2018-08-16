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
		System.out.println("당신은 몇 살입니까?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int age = 0;
		
		String input = "";
		try{
			input = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		age = Integer.parseInt(input);
		System.out.println("당신은 " + age + "살 입니다.");
	}
	private void practice04(){
		System.out.println("원주율의 값은 얼마입니까?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float pi = 0;
		
		String input = "";
		try{
			input = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		pi = Float.parseFloat(input);
		System.out.println("원주율의 값은 " + pi + "입니다.");
		
	}
	private void practice05(){
		System.out.println("키와 몸무게를 입력하십시오.");
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
		System.out.println("키는 " + length + "센티미터 입니다.");
		System.out.println("몸무게는 " + weight + "킬로그램 입니다.");
	}
}
