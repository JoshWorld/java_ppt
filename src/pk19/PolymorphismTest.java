package pk19;

public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Arr[];
		Arr= new Car[3];
		Arr[0]= new Bus();
		Arr[1]= new Van();
		Arr[2]= new Suv();	
		System.out.println(Arr[0].run());
		System.out.println(Arr[1].run());
		System.out.println(Arr[2].run());
	}

}
