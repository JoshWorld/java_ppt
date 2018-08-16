package pk12;

public class ArrayTest3 {

	private void mai() {
		int A[][] = {{10,20,30},{40,50,60}};

		for(int i=0; i < A.length; i++){//행의 수
			for(int j=0; j < A[1].length; j++){//열의 수
				System.out.println(A[i][j]);
			}
		}
	}
}
