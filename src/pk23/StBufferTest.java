package pk23;
public class StBufferTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		// StringBuffer 객체생성
		StringBuffer  buf = new StringBuffer("Nice Day!");
		
		// StringBuffer 문자열을 String로 전환
		System.out.println(buf.toString());
		// StringBuffer 문자열의 크기
		System.out.println(buf.length());
		// StringBuffer 용량의 크기
		System.out.println(buf.capacity());
		// StringBuffer 용량크기증가
		buf.ensureCapacity(30);
		System.out.println(buf.capacity());
		// StringBuffer 문자열에 새로운 문자열 추가
		buf.insert(0, "Hi! ");
		buf.insert(13, "Everybody~");
		System.out.println(buf);
		// StringBuffer 문자열의 일부내용제거
		buf.delete(0, 4);
		System.out.println(buf);		
	}
}
