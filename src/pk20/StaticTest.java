package pk20;

public class StaticTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StVal obj1=new StVal();
		StVal obj2=new StVal();
		
		obj1.a=10;
		obj1.b=20;
		
		System.out.println("obj1�Դϴ� : a�� "+obj1.a+" b�� "+obj1.b);
		
		obj2.a=100;
		obj2.b=200;
		System.out.println("obj2�Դϴ� : a�� "+obj2.a+" b�� "+obj2.b);
		System.out.println("obj1�Դϴ� : a�� "+obj1.a+" b�� "+obj1.b);	
	}
}
