package pk10;

public class BreakContinueTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;

		System.out.println("1에서 5까지의 수입니다.");
		for( i=1 ; i<=5 ; i++ ){
//			if(i==3) break;
			if(i==3) continue;
			System.out.print(i+ "   ");

		}			
	}
}
