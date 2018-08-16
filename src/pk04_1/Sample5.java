package pk04_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample5 {
	public static void main(String[] args) {
		System.out.println("문자열을 입력 하세요");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int number = Integer.parseInt(str);
		
		System.out.println(number + " (이)가 입력 되었습니다.");
	}
}
