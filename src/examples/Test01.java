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
	 * ���� 25 
	 * �迭�� �̿��Ͽ� ��¥�� ����Ų��
	 * �Է� �� ���� ��¥ ���� ����ϱ�
	 */
	public void test08(){
		int [] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int myMonth = Integer.parseInt(getInputData("���ϴ� �� : "));
		System.out.println(myMonth + "���� " + month[myMonth-1] +"���Դϴ�.");
	}
	
	/**
	 * ���� 20 
	 * test07(10,'#')�Լ��� ȣ���Ͽ� ������ ���� ����Ͻÿ�
     *	 	����)��¹����� for���� �̿��Ͻÿ�
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
	 * for���� �̿��Ͽ� ���� �Ʒ� ������� ����ϼ���.
	 * (���α׷��ֿ� �ڰ� ���� �ѹ��� ��� �˴ϴ�.)
	 */
	
	/**
	  	�ڡڡڡڡ�
		�١ڡڡڡ�
		�١١ڡڡ�
		�١١١ڡ�
		�١١١١�
	 */
	public void test06_5(){
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(j<i)System.out.print("��");
				else System.out.print("��");
			}
			System.out.println();
		}
	}
	
	/**
	 	�١١١١�
		�١١١ڡ�
		�١١ڡ١�
		�١ڡ١١�
		�ڡ١١١�
	 */
	public void test06_4(){
		for(int i=5; i>0; i--){
			for(int j=1; j<=5; j++){
				if(i == j){
					System.out.print("��");
				}else{
					System.out.print("��");
				}
			}
			System.out.println();
		}
	}
	
	/**
		�ڡڡڡڡ�
		�ڡڡڡ�
		�ڡڡ�
		�ڡ�
		��
	 */
	public void test06_3(){
		for(int i=5; i>0; i--){
			for(int j=0; j<i; j++){
				System.out.print("��");
			}
			System.out.println();
		}
	}
	/**
		��
		�ڡ�
		�ڡڡ�
		�ڡڡڡ�
		�ڡڡڡڡ�
	 */
	public void test06_2(){
		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				System.out.print("��");
			}
			System.out.println();
		}
	}
	/**
		�ڡڡڡڡ�
		�ڡڡڡڡ�
		�ڡڡڡڡ�
		�ڡڡڡڡ�
		�ڡڡڡڡ�
	 */
	public void test06_1(){
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.print("��");
			}
			System.out.println();
		}
	}
	
	/**
	 * [����18]����for�̿��ؼ� ����� ����ÿ�
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
	 * [����17]
	 * for���� �̿��Ͽ� �������� ���Ͻÿ�
	 */
	public void test04(){
		String [] messages = {"x �� ���� �Է��Ͻÿ�.", "y �� ���� �Է��Ͻÿ�."};
		int xValue = 0;
		int yValue = 0;

		xValue = Integer.parseInt(getInputData(messages[0]));
		yValue = Integer.parseInt(getInputData(messages[1]));
		int result = 1;
		for(int i=0; i<yValue; i++){
			result = result * xValue;
		}
		System.out.println(xValue + "�� " + yValue +"���� " +result);
	}
	
	/**
	 * [����16]
	 * 1~100�����Ǽ� �߿���  3�� ����̸鼭 7�� ��� ���ϱ� 
	 */
	public void test03(){
		for(int i=3; i<=100; i++){
			if(i%3==0 && i%7==0){
				System.out.print("\t"+i);
			}
		}
	}
	
	/**
	 * [����5] ������ �Է¹޾� ����Ͻÿ�
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
		System.out.println("�հ����� : " + (int)summary +"��");

		float average = summary / 3;

		System.out.format("������� : %.1f ��", average);
	}
	
	/**
	 * [����2]65430���� ����� ���� ȭ���� ������ ���Ͻÿ�.
	 * @param input
	 */
	public void test01(int input){
		int ten = 10;
		int hundred = 100;
		int thousand = 1000;
		int tenThousand = 10000;

		int number = 0;
		number = input / tenThousand;
		System.out.println("���� = " + number);

		input -= (number*tenThousand);
		number = input / thousand;
		System.out.println("õ�� = "+ number);

		input -= (number*thousand);
		number = input / hundred;
		System.out.println("��� = " + number);

		input -= (number*hundred);
		number = input / ten;
		System.out.println("�ʿ� = " + number);
	}

	/**
	 * Ű����� ���� �Է� �޴� �Լ�
	 * 
	 * @param message 	: ���� �� �Է��Ͻÿ�. ���� Alert Message
	 * @return			: Ű����� �Է� �� �޽��� ����
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
