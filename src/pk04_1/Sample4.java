package pk04_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample4 {

	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է� �ϼ���");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(str + " (��)�� �Է� �Ǿ����ϴ�.");
	}
}
