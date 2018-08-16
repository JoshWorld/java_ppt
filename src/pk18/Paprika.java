package pk18;

public class Paprika extends Vegetable{
	private String color;
	private int price;
	private String name;
    
	public void Set3(String a, int b,String c){
		color=a; price=b;name=c;
	}
	public void Disp2(){
		System.out.println("----- Disp2 -------");
		System.out.println("분류  : "+ sort);
		System.out.println("계절  : "+ season);
		System.out.println("이름  : "+ super.name);
	}
	public void Disp3(){
		System.out.println("----- Disp3 -------");
	    System.out.println("색상  : "+ color);
	    System.out.println("가격  : "+ price);
	    System.out.println("이름  : "+ name);
	}
}
