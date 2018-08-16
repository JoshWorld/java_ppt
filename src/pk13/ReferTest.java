package pk13;

import javax.swing.JOptionPane;

public class ReferTest {
	public static void Disp(String A[]){
		String res="";
		int i;
		for(i=0; i<A.length; i++){
			res=res+A[i]+"\n";}

		System.out.println(res);

		JOptionPane.showMessageDialog(null,"배열원소의 값\n" +res);	
	}//of Disp

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]={"ab111","cd222","ef333","gh444","ij555"};
		Disp(str);		
	}//of main
}//of class