package pk09;

import javax.swing.JOptionPane;

public class SwitchTest {
	public static void main(String[] args) {
		int In_Num; 
		In_Num=Integer.parseInt(JOptionPane.showInputDialog("번호입력 : "));

		switch(In_Num){
		case 1 :
			System.out.println("예금조회를 선택하셨습니다." ); 
			break;
		case 2 :
			System.out.println("예금출금을 선택하셨습니다." ); 
			break;
		case 3 :
			System.out.println("예금입금을 선택하셨습니다." ); 
			break;
		case 4 :
			System.out.println("예금이체를 선택하셨습니다." ); 
			break;
		default : 
			System.out.println("번호를 잘못 누르셨습니다." ); 
		} /* switch문을 닫아줌 */
	}
}
