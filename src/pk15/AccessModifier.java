package pk15;

public class AccessModifier {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessEx obj= new AccessEx();
//		obj.aa=10;
		obj.SetA(10);
		obj.bb=20;				
		obj.cc=50;	
//		obj.SetC(30);
		obj.Disp();
	}
}
