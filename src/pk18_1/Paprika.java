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
		System.out.println("����  : "+ color);
	    System.out.println("����  : "+ price);
	    System.out.println("�̸�  : "+ name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paprika obj = new Paprika();

		obj.Set1("�Ǹ���","����","���������ī");
		obj.Set3("����",2000,"����������ī");
		obj.Disp();
		obj.Disp();
		
	}
}
