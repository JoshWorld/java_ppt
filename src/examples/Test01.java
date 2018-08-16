package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	
	public static void main(String[] args) {

		Test01 test = new Test01();
		test.test02();
	}
	/**
	 * 문제 25 
	 * 배열을 이용하여 날짜를 기억시킨후
	 * 입력 한 달의 날짜 수를 출력하기
	 */
	public void test08(){
		int [] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int myMonth = Integer.parseInt(getInputData("원하는 달 : "));
		System.out.println(myMonth + "월은 " + month[myMonth-1] +"일입니다.");
	}
	
	/**
	 * 문제 20 
	 * test07(10,'#')함수를 호출하여 다음과 같이 출력하시오
     *	 	조건)출력문에서 for문을 이용하시오
     *
	 * @param num
	 * @param ch
	 */
	public void test07(int num, char ch){
		for(int i=0; i<num; i++){
			System.out.print(ch + " \t");
		}
	}
	
	/**
	 * for문을 이용하여 다음 아래 별모양을 출력하세요.
	 * (프로그래밍에 ★과 ☆은 한번만 써야 됩니다.)
	 */
	
	/**
	  	★★★★★
		☆★★★★
		☆☆★★★
		☆☆☆★★
		☆☆☆☆★
	 */
	public void test06_5(){
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(j<i)System.out.print("☆");
				else System.out.print("★");
			}
			System.out.println();
		}
	}
	
	/**
	 	☆☆☆☆★
		☆☆☆★★
		☆☆★☆☆
		☆★☆☆☆
		★☆☆☆☆
	 */
	public void test06_4(){
		for(int i=5; i>0; i--){
			for(int j=1; j<=5; j++){
				if(i == j){
					System.out.print("★");
				}else{
					System.out.print("☆");
				}
			}
			System.out.println();
		}
	}
	
	/**
		★★★★★
		★★★★
		★★★
		★★
		★
	 */
	public void test06_3(){
		for(int i=5; i>0; i--){
			for(int j=0; j<i; j++){
				System.out.print("★");
			}
			System.out.println();
		}
	}
	/**
		★
		★★
		★★★
		★★★★
		★★★★★
	 */
	public void test06_2(){
		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				System.out.print("★");
			}
			System.out.println();
		}
	}
	/**
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		★★★★★
	 */
	public void test06_1(){
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.print("★");
			}
			System.out.println();
		}
	}
	
	/**
	 * [문제18]다중for이용해서 모양을 만드시오
	 */
	/**
	 	 **********
         *        *
         *        *
         *        *
         **********    
	 */
	public void test05_3(){
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if(i==1 || i==5)
					System.out.print("*");
				else {
					if(j==1 || j==10)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/**
	 		*
           * *
          *   *
           * *
            *  
	 */
	public void test05_2(){
		int k = 0;
		for(int i=-2; i<=2; i++) {
			k=i<0 ? -i : i;
			for(int j=k; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=5-2*k; j++) {
				if(j==1 || j==5-2*k)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	/**
	      1
         123
        12345
       1234567
      123456789
       1234567
        12345
         123
          1
	 */
	public void test05_1(){
		int k = 0;
		for(int i=-4; i<=4; i++) {
			k=i<0 ? -i : i;
			for(int j=k; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=9-2*k; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * [문제17]
	 * for문을 이용하여 제곱승을 구하시오
	 */
	public void test04(){
		String [] messages = {"x 의 값을 입력하시오.", "y 의 값을 입력하시오."};
		int xValue = 0;
		int yValue = 0;

		xValue = Integer.parseInt(getInputData(messages[0]));
		yValue = Integer.parseInt(getInputData(messages[1]));
		int result = 1;
		for(int i=0; i<yValue; i++){
			result = result * xValue;
		}
		System.out.println(xValue + "의 " + yValue +"승은 " +result);
	}
	
	/**
	 * [문제16]
	 * 1~100사이의수 중에서  3의 배수이면서 7의 배수 구하기 
	 */
	public void test03(){
		for(int i=3; i<=100; i++){
			if(i%3==0 && i%7==0){
				System.out.print("\t"+i);
			}
		}
	}
	
	/**
	 * [문제5] 다음을 입력받아 계산하시오
	 * Input 
		kor : 90 
		eng : 70 
		mat : 75
	 */
	public void test02(){

		String[] subjectNames = {"kor", "eng", "mat"};
		float[] subjectScore = new float[3];

		for(int i=0; i<subjectNames.length; i++){
			subjectScore[i] = Float.parseFloat(getInputData(subjectNames[i]));
		}
		float summary =0;

		for(float a: subjectScore){
			summary += a;
		}
		System.out.println("합계점수 : " + (int)summary +"점");

		float average = summary / 3;

		System.out.format("평균점수 : %.1f 점", average);
	}
	
	/**
	 * [문제2]65430원을 만들기 위한 화폐의 갯수를 구하시오.
	 * @param input
	 */
	public void test01(int input){
		int ten = 10;
		int hundred = 100;
		int thousand = 1000;
		int tenThousand = 10000;

		int number = 0;
		number = input / tenThousand;
		System.out.println("만원 = " + number);

		input -= (number*tenThousand);
		number = input / thousand;
		System.out.println("천원 = "+ number);

		input -= (number*thousand);
		number = input / hundred;
		System.out.println("백원 = " + number);

		input -= (number*hundred);
		number = input / ten;
		System.out.println("십원 = " + number);
	}

	/**
	 * 키보드로 값을 입력 받는 함수
	 * 
	 * @param message 	: ㅁㅁ 를 입력하시오. 같은 Alert Message
	 * @return			: 키보드로 입력 된 메시지 리턴
	 */
	private String getInputData(String message){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(message +" : ");
		String input = "";
		try{
			input = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		return input;
	}
}
