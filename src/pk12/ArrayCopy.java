package pk12;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array01 = {1,2,3,4,5};
		int [] array02;
		array02 = array01;
		
		array01[0] = 5;
		array01[1] = 4;
		
		for(int i=0; i<array01.length ; i++){
			System.out.format("array01[%d]= %d \t", i, array01[i]);
		}
		System.out.println();
		for(int j=0; j<array02.length; j++){
			System.out.format("array02[%d]= %d \t", j, array02[j]);
		}
	}
}
