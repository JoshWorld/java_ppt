package example01;

public class StringExample {
	public static void main(String[] args) {
		// String 초기화
		String myString = "java programming";
		
		// String 길이 측정
		System.out.println("myString.length(); --> " + myString.length());
		
		// String 특정 문자 변경 
		String replaceString = myString.replace('a', 'b');
		System.out.println("myString.replace('a', 'b'); --> " + replaceString);
		
		// 전부 대문자료 변경
		String upperCaseString = myString.toUpperCase();
		System.out.println("myString.toUpperCase() -- " +upperCaseString);
		
		// 전부 소문자로 변경
		String lowerCaseString = myString.toLowerCase();
		System.out.println("myString.toLowerCase() -- " + lowerCaseString);
		
		// 문자열 자르기
		String subString = myString.substring(5, 12);
		System.out.println("myString.substring(5, 12) -- " + subString);
	}
}
