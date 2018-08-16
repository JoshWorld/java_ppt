package lesson08;

public class Car {

	int num;
	double gas;
	
	void setNum(int n){
		this.num = n;
		System.out.println("차량 번호를 " + num + "으로 바꾸었습니다.");
	}
	
	void setGas(double g){
		this.gas = g;
		System.out.println("연료 양을 " + gas + "으로 바꾸었습니다.");
	}
	void show(){
		System.out.println("차량 번호는 " + num +"입니다.");
		System.out.println("연료 양은 " + gas + "입니다.");
	}
	
	void setNumGas(int n, double g){
		this.num = n;
		this.gas = g;
		System.out.println("차량 번호를 " + num + "으로, 연료 양을 " +
							gas + "로 바꾸었습니다.");
	}
	int getNum(){
		System.out.println("차량 번호를 조사했습니다.");
		return this.num;
	}
	double getGas(){
		System.out.println("연료 양을 조사했습니다.");
		return this.gas;
	}
	class Sample4{
		
		/**
		 * 인수를 전달하여 메소드 호출하기
		 * 
		public static void main(String[] args) {
			Car car1 = new Car();
			car1.setNum(1234);
			car1.setGas(20.5);
			
		}
		*/
		
		/**
		 * 변수 값을 전달해서 호출하기
		 
		public void main(String[] args) {
			Car car2 = new Car();
			
			int number = 1234;
			double gasoline = 20.5;
			
			car2.setNum(number);
			car2.setGas(gasoline);
			
		}
		*/
		
		/**
		 * 1. 둘 이상의 인수를 가지는 메소드 정의하기
		 * 2. 인수가 없는 메소드 사용하기
		 
		public void main(String[] args){
			Car car3 = new Car();
			int number = 1234;
			double gasoline = 20.5;
			
			car3.setNumGas(number, gasoline);
			
			car3.show();
		}
		*/
		
		/**
		 * 리턴 값의 원리 이해하기
		 * 
		 * @param args
		
		public void main(String[] args) {
			Car car4 = new Car();
			car4.setNumGas(1234, 20.5);
			
			int number = car4.getNum();
			double gasoline = car4.getGas();
			
			System.out.println("샘플 자동차를 조사한 결과");
			System.out.println("차량 번호는 " + number +"연료 양은" +
							gasoline + "이었습니다.");
		}
		 */
		
	}
}
