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
		System.out.println("분류  : "+ sort);
		System.out.println("계절  : "+ season);
		System.out.println("이름  : "+ name);
	}
}
