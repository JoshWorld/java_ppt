package example01;

public class StringExample {
	public static void main(String[] args) {
		// String �ʱ�ȭ
		String myString = "java programming";
		
		// String ���� ����
		System.out.println("myString.length(); --> " + myString.length());
		
		// String Ư�� ���� ���� 
		String replaceString = myString.replace('a', 'b');
		System.out.println("myString.replace('a', 'b'); --> " + replaceString);
		
		// ���� �빮�ڷ� ����
		String upperCaseString = myString.toUpperCase();
		System.out.println("myString.toUpperCase() -- " +upperCaseString);
		
		// ���� �ҹ��ڷ� ����
		String lowerCaseString = myString.toLowerCase();
		System.out.println("myString.toLowerCase() -- " + lowerCaseString);
		
		// ���ڿ� �ڸ���
		String subString = myString.substring(5, 12);
		System.out.println("myString.substring(5, 12) -- " + subString);
	}
}
