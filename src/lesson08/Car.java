package lesson08;

public class Car {

	int num;
	double gas;
	
	void setNum(int n){
		this.num = n;
		System.out.println("���� ��ȣ�� " + num + "���� �ٲپ����ϴ�.");
	}
	
	void setGas(double g){
		this.gas = g;
		System.out.println("���� ���� " + gas + "���� �ٲپ����ϴ�.");
	}
	void show(){
		System.out.println("���� ��ȣ�� " + num +"�Դϴ�.");
		System.out.println("���� ���� " + gas + "�Դϴ�.");
	}
	
	void setNumGas(int n, double g){
		this.num = n;
		this.gas = g;
		System.out.println("���� ��ȣ�� " + num + "����, ���� ���� " +
							gas + "�� �ٲپ����ϴ�.");
	}
	int getNum(){
		System.out.println("���� ��ȣ�� �����߽��ϴ�.");
		return this.num;
	}
	double getGas(){
		System.out.println("���� ���� �����߽��ϴ�.");
		return this.gas;
	}
	class Sample4{
		
		/**
		 * �μ��� �����Ͽ� �޼ҵ� ȣ���ϱ�
		 * 
		public static void main(String[] args) {
			Car car1 = new Car();
			car1.setNum(1234);
			car1.setGas(20.5);
			
		}
		*/
		
		/**
		 * ���� ���� �����ؼ� ȣ���ϱ�
		 
		public void main(String[] args) {
			Car car2 = new Car();
			
			int number = 1234;
			double gasoline = 20.5;
			
			car2.setNum(number);
			car2.setGas(gasoline);
			
		}
		*/
		
		/**
		 * 1. �� �̻��� �μ��� ������ �޼ҵ� �����ϱ�
		 * 2. �μ��� ���� �޼ҵ� ����ϱ�
		 
		public void main(String[] args){
			Car car3 = new Car();
			int number = 1234;
			double gasoline = 20.5;
			
			car3.setNumGas(number, gasoline);
			
			car3.show();
		}
		*/
		
		/**
		 * ���� ���� ���� �����ϱ�
		 * 
		 * @param args
		
		public void main(String[] args) {
			Car car4 = new Car();
			car4.setNumGas(1234, 20.5);
			
			int number = car4.getNum();
			double gasoline = car4.getGas();
			
			System.out.println("���� �ڵ����� ������ ���");
			System.out.println("���� ��ȣ�� " + number +"���� ����" +
							gasoline + "�̾����ϴ�.");
		}
		 */
		
	}
}
