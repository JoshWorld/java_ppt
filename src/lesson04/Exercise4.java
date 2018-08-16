package lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
	public static void main(String[] args) {
		Exercise4 exr = new Exercise4();
		exr.practice05();
	}
	
	private void practice03(){
		System.out.println("���簢���� �� ���� ���̸� �Է��ϼ���.");
		String inputData = getInputData();
		int length = Integer.parseInt(inputData);
		int rectangleDimension = length * length;
		
		System.out.println("���簢���� ���̴� " + rectangleDimension +"�Դϴ�.");		
	}
	private void practice04(){
		System.out.println("�ﰢ���� �غ��� ���̸� �Է��Ͻʽÿ�.");
		String lengthString = getInputData();
		int length = Integer.parseInt(lengthString);
		String heightString = getInputData();
		int height = Integer.parseInt(heightString);
		
		System.out.println("�ﰢ���� ���̴� " + (0.5 * length * height) + "�Դϴ�.");
	}
	private void practice05(){
		System.out.println("���� 1~5�� ������ ������ �Է��Ͻʽÿ�.");
		String scoreStr01 = getInputData();
		String scoreStr02 = getInputData();
		String scoreStr03 = getInputData();
		String scoreStr04 = getInputData();
		String scoreStr05 = getInputData();
		int score01 = Integer.parseInt(scoreStr01);
		int score02 = Integer.parseInt(scoreStr02);
		int score03 = Integer.parseInt(scoreStr03);
		int score04 = Integer.parseInt(scoreStr04);
		int score05 = Integer.parseInt(scoreStr05);
		
		int sum = score01 + score02 + score03 + score04 + score05;
		System.out.println("5������ �հ�� " + sum + "���Դϴ�.");
		System.out.println("5������ ����� " + (sum / (double)5) + "���Դϴ�.");
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
