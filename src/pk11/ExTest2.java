package pk11;

import javax.swing.JOptionPane;

public class ExTest2 {
	public static void main(String[] args) {
		int Num1,Num2;

		Num1=Integer.parseInt(JOptionPane.showInputDialog("값1 "));
		Num2=Integer.parseInt(JOptionPane.showInputDialog("값2 "));
		if(Num1>Num2)
			System.out.println(Num1+"(가)이 더 큽니다.");
		else if(Num1<Num2)
			System.out.println(Num2+"(가)이 더 큽니다.");
		else
			System.out.println("두 개값이 같습니다.");
	}
}
