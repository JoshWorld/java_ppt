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
		System.out.println("�з�  : "+ sort);
		System.out.println("����  : "+ season);
		System.out.println("�̸�  : "+ super.name);
	}
	public void Disp3(){
		System.out.println("----- Disp3 -------");
	    System.out.println("����  : "+ color);
	    System.out.println("����  : "+ price);
	    System.out.println("�̸�  : "+ name);
	}
}
