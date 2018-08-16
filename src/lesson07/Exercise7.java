package lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise7 exr = new Exercise7();
		exr.practice04();
	}

	public void practice04(){
		System.out.println("5 명의 시험 점수를 입력하십시오.");
		int[] scoreArray = new int[5];
		for(int i=0; i<scoreArray.length; i++){
			scoreArray[i] = Integer.parseInt(getInputData());
		}
		
		for(int j=0; j<scoreArray.length; j++){
			System.out.println((j+1)+"번째 사람의 점수는 " + scoreArray[j] +"입니다.");
		}
		
		int maxScore=0;
		for(int k=0; k<scoreArray.length; k++){
			if(maxScore < scoreArray[k]){
				maxScore = scoreArray[k];
			}
		}
		System.out.println("가장 높은 점수는 " + maxScore +"점입니다.");
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
