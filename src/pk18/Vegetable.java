package pk18;

public class Vegetable {
	String sort;
	String season;
	String name;
	
	public void Set1(String a, String b, String c){
		sort=a; season=b; name=c;
	}
	
	public void Disp1(){
		System.out.println("----- Disp1 -------");
		System.out.println("�з�  : "+ sort);
		System.out.println("����  : "+ season);
		System.out.println("�̸�  : "+ name);
	}
}
