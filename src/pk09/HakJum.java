package pk09;

import javax.swing.JOptionPane;

public class HakJum {

	public static void main(String[] args) {
		int JumSu ;
		char HakJum;
		String score = JOptionPane.showInputDialog("���� �Է� : ");
		
		JumSu=Integer.parseInt(score);

		if (JumSu >= 90){
			HakJum = 'A';
		}else if(JumSu >= 80){
			HakJum = 'B';
		}else if(JumSu >= 70){
			HakJum = 'C';
		}else if(JumSu >= 60){
			HakJum = 'D';
		}else{
			HakJum = 'F';
		}

		System.out.println("����� ������ "+ HakJum  +" �Դϴ�."  );
	}

}
