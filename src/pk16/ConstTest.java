package pk16;

public class ConstTest {

	private int aa;
	private int bb;	
		
	public  ConstTest(int a, int b){
		aa=a;
		bb=b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstTest obj = new ConstTest(10,20);
		System.out.println(obj.aa);
		System.out.println(obj.bb);
	}

}
