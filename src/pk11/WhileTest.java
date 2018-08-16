package pk11;

public class WhileTest {

	public static void main(String[] args) {
		int cnt = 1;           				/*인덱스 변수를 초기회*/
		while(cnt <= 5){       				/* while의 헤더 */
			System.out.println("Nice !");   /*Nice ! 를 출력*/
			cnt++;        					/* 인덱스 변수 cnt를 증가 */
		}                      				/* while문을 닫아줌 */
		System.out.println("Day !");    	/* while문 다음 수행문 */
	}                         				/* main()을 닫아줌 */ 

}
