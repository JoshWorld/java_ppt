package pk11;

public class DoWhileTest {

	public static void main(String[] args) {
		int n = 1;            				/*인덱스 변수를 초기회*/
		do{                   				/* do~while의 헤더 */
			System.out.println(n); 			/*n값을 출력*/
			n++;              				/* 인덱스 변수 n을 증가 */
		}while(n <= 5); 					/* do~while문을 닫아줌,조건비교 */
		System.out.println("수행 끝");   		/* do~while문 다음 수행문 */
	}                        				/* main()을 닫아줌 */ 

}
