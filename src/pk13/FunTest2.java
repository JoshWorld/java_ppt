package pk13;

import javax.swing.JOptionPane;

public class FunTest2 {
	public  void sum(int a, int b){
		System.out.println("���� "+(a+b)+"�Դϴ�.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("��1"));

		FunTest2 Obj=new FunTest2();
		Obj.sum(num1,num2);
	}
}
