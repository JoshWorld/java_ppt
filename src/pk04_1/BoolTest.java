package pk04_1;

public class BoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean aVar=true;
		System.out.println(aVar);
		
		boolean bVar = false;
		System.out.println("bVar : " + bVar);
		
//		���� NOT
		System.out.println("!bVar : " + !bVar);
//		���� AND
		boolean cVar = aVar&&bVar;
		System.out.println("aVar & bVar : " + cVar);
//		���� OR
		boolean dVar = aVar||bVar;
		System.out.println("aVar | bVar : " + dVar);
		
		
	}

}
