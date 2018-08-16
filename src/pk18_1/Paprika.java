package pk18_1;

public class Paprika extends Vegetable{
	private String color;
	private int price;
	private String name;
    
	public void Set3(String a, int b,String c){
		color=a; price=b;name=c;
	}
	public void Disp(){
		System.out.println("----- Paprika Disp -------");
		System.out.println("색상  : "+ color);
	    System.out.println("가격  : "+ price);
	    System.out.println("이름  : "+ name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paprika obj = new Paprika();

		obj.Set1("피망류","여름","노란파프리카");
		obj.Set3("빨강",2000,"빨간파프리카");
		obj.Disp();
		obj.Disp();
		
	}
}
