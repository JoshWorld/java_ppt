package ezen.java.poly;

public class PolyDemo1 {
	public static void main(String[] args) {
		A obj = new B();
		
		// 01. A �༼�� �ϴ� Ŭ���� B
		obj.x();
//		obj.y();
		
		
		// 02. B ���� �������̵� �ߴٸ�
//		System.out.println(obj.x());
		
		
		// 03. 
		A obj1 = new B();
		A obj2 = new B2();
		
		System.out.println(obj1.x());
		System.out.println(obj2.x());
	}
}
