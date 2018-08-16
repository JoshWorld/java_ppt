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
		System.out.println("0 에서 10까지의 수를 입력하십시오.");
		String inputData = getInputData();
		int input = Integer.parseInt(inputData);
		if(input>0 && input<=10){
			System.out.println("정답입니다.");
		}else{
			System.out.println("오답입니다.");
		}
	}
	public void practice03(){
		System.out.println("2개의 정수를 입력하십시오.");
		String inputData01 = getInputData();
		String inputData02 = getInputData();
		
		int input01 = Integer.parseInt(inputData01);
		int input02 = Integer.parseInt(inputData02);
		
		if(input01 == input02){
			System.out.println("두 숫자는 같습니다.");
		}else if(input01 > input02){
			System.out.println(input02 + "보다 " + input01 + "이 큽니다.");
		}else if(input02 > input01){
			System.out.println(input01 + "보다 " + input02 + "이 큽니다.");
		}
	}
	public void practice02(){
		System.out.println("정수를 입력하십시오.");
		String inputData = getInputData();
		int input = Integer.parseInt(inputData);
		
		if(input % 2 == 0){
			// 2로 나누어 나머지가 0 이다.
			System.out.println(input + "(은)는 짝수입니다.");
		}else{
			// 2로 나누어 나머지가 0 이 아니다.
			System.out.println(input + "(은)는 홀수입니다.");
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
