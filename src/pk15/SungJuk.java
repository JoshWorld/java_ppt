package pk15;

import javax.swing.JOptionPane;

public class SungJuk {
	private String Std_num;
	private String Std_name;
	private int kor;
	private int eng;
	private int mat;
	public void Sum(){
		System.out.println("�հ��  "+(kor+ eng+ mat)+"�Դϴ�");
	}

	public void Ave(){
		System.out.println("�����  "+(kor+ eng+ mat)/3 +"�Դϴ�");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungJuk rec = new SungJuk();
		rec.Std_num =  JOptionPane.showInputDialog("�й�");
		rec.Std_name =  JOptionPane.showInputDialog("�̸�");
		rec.kor =  Integer.parseInt(JOptionPane.showInputDialog("����"));
		rec.eng =  Integer.parseInt(JOptionPane.showInputDialog("����"));
		rec.mat =  Integer.parseInt(JOptionPane.showInputDialog("����"));
		System.out.println(rec.Std_num+rec.Std_name+"�� �����Դϴ�" );
		rec.Sum();
		rec.Ave();
	}
}
