package pk24;

import java.util.Vector;
public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj;
				
		//크기1의 배열 선언
		Vector<Object> vec =new Vector<Object>(2);
		obj=10;
		vec.addElement(obj);//엘리먼트 추가
		//vector의 용량 수
		System.out.println("용량은#1 : "+vec.capacity());
		//vector 안에 저장된 엘리먼트의 수
		System.out.println("크기는#1 : "+vec.size());
		obj="hi";
		vec.addElement(obj);//엘리먼트 추가
		System.out.println("용량은#2 : "+vec.capacity());
		System.out.println("크기는#2 : "+vec.size());
		obj="Nice Day";//엘리먼트 추가
		vec.addElement(obj);
		System.out.println("용량은#3 : "+vec.capacity());
		System.out.println("크기는#3 : "+vec.size());	
	}
}
