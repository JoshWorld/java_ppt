package pk23;
import java.util.StringTokenizer;
public class StTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Have a Nice Day";

		
		//StringTokenizer 클래스 객체 생성
		StringTokenizer obj =new StringTokenizer(str," ",false);

		
		while(obj.hasMoreTokens()){
			String t=obj.nextToken();
			System.out.println(t);
		}

	}

}
