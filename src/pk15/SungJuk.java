package pk15;

import javax.swing.JOptionPane;

public class SungJuk {
	private String Std_num;
	private String Std_name;
	private int kor;
	private int eng;
	private int mat;
	public void Sum(){
		System.out.println("합계는  "+(kor+ eng+ mat)+"입니다");
	}

	public void Ave(){
		System.out.println("평균은  "+(kor+ eng+ mat)/3 +"입니다");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungJuk rec = new SungJuk();
		rec.Std_num =  JOptionPane.showInputDialog("학번");
		rec.Std_name =  JOptionPane.showInputDialog("이름");
		rec.kor =  Integer.parseInt(JOptionPane.showInputDialog("국어"));
		rec.eng =  Integer.parseInt(JOptionPane.showInputDialog("영어"));
		rec.mat =  Integer.parseInt(JOptionPane.showInputDialog("수학"));
		System.out.println(rec.Std_num+rec.Std_name+"의 성적입니다" );
		rec.Sum();
		rec.Ave();
	}
}
