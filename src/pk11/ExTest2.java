package pk11;

import javax.swing.JOptionPane;

public class ExTest2 {
	public static void main(String[] args) {
		int Num1,Num2;

		Num1=Integer.parseInt(JOptionPane.showInputDialog("��1 "));
		Num2=Integer.parseInt(JOptionPane.showInputDialog("��2 "));
		if(Num1>Num2)
			System.out.println(Num1+"(��)�� �� Ů�ϴ�.");
		else if(Num1<Num2)
			System.out.println(Num2+"(��)�� �� Ů�ϴ�.");
		else
			System.out.println("�� ������ �����ϴ�.");
	}
}
