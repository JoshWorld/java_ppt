package pk18;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrawBerry obj = new StrawBerry();

		obj.Set1("Berry��","����"); // Fruit
		obj.Set2("��", "����"); // Berry
		obj.Set3("����",5000); // StrawBerry
		
		obj.Disp1(); // Fruit
		obj.Disp2(); // Berry
		obj.Disp3(); // StrawBerry
	}

}
