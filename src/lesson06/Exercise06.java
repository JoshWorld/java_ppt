package lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise06 {
	public static void main(String[] args) {
		Exercise06 exr = new Exercise06();
		exr.practice02();
	}
	public void practice02(){
		System.out.println("시험 점수를 입력하십시오.(0으로 종료)");
		
		int input = 0;
		int sum = 0;
		do{
			input = Integer.parseInt(getInputData());
			sum += input;
		}while(input != 0);
		
		System.out.println("시험 점수의 합계는 " + sum +"점 입니다.");
	}
	public void practice04(){
		for(int i=1; i<=5; i++){
			for(int j=0; j<i; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public void practice03(){
		
		for(int i=1; i<10; i++){
			for(int j=1;j<10;j++){
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
	}
	public void practice01(){
		System.out.println("1 ~ 10까지의 짝수를 출력합니다.");
		for(int i=1; i<=10; i++){
			if(i%2 == 0){
				System.out.println(i);
			}
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
