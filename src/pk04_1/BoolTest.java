package pk04_1;

public class BoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean aVar=true;
		System.out.println(aVar);
		
		boolean bVar = false;
		System.out.println("bVar : " + bVar);
		
//		논리식 NOT
		System.out.println("!bVar : " + !bVar);
//		논리식 AND
		boolean cVar = aVar&&bVar;
		System.out.println("aVar & bVar : " + cVar);
//		논리식 OR
		boolean dVar = aVar||bVar;
		System.out.println("aVar | bVar : " + dVar);
		
		
	}

}
