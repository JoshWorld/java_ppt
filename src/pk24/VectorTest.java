package pk24;

import java.util.Vector;
public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj;
				
		//ũ��1�� �迭 ����
		Vector<Object> vec =new Vector<Object>(2);
		obj=10;
		vec.addElement(obj);//������Ʈ �߰�
		//vector�� �뷮 ��
		System.out.println("�뷮��#1 : "+vec.capacity());
		//vector �ȿ� ����� ������Ʈ�� ��
		System.out.println("ũ���#1 : "+vec.size());
		obj="hi";
		vec.addElement(obj);//������Ʈ �߰�
		System.out.println("�뷮��#2 : "+vec.capacity());
		System.out.println("ũ���#2 : "+vec.size());
		obj="Nice Day";//������Ʈ �߰�
		vec.addElement(obj);
		System.out.println("�뷮��#3 : "+vec.capacity());
		System.out.println("ũ���#3 : "+vec.size());	
	}
}
