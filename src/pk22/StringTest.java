package pk22;
public class StringTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="";
		String str1="Hi everybody!";
		String str2="Have a nice day!";
		
		str=str1+str2;
		System.out.println(str);
		
		System.out.println("str1 ���ڼ� : "+str1.length());
		System.out.println("str2 ���ڼ� : "+str2.length());
		
		System.out.println("str1 d������ġ : "+str1.indexOf('d'));
		System.out.println("str2 d������ġ : "+str2.indexOf('d'));
		
		System.out.println("str1 ��μҹ��ڷ� : "+str1.toLowerCase());
		System.out.println("str2 ��μҹ��ڷ� : "+str2.toLowerCase());
		
		System.out.println("str1 ��δ빮�ڷ� : "+str1.toUpperCase());
		System.out.println("str2 ��δ빮�ڷ� : "+str2.toUpperCase());		
	}
}
