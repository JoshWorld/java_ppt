package pk23;
public class StBufferTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		// StringBuffer ��ü����
		StringBuffer  buf = new StringBuffer("Nice Day!");
		
		// StringBuffer ���ڿ��� String�� ��ȯ
		System.out.println(buf.toString());
		// StringBuffer ���ڿ��� ũ��
		System.out.println(buf.length());
		// StringBuffer �뷮�� ũ��
		System.out.println(buf.capacity());
		// StringBuffer �뷮ũ������
		buf.ensureCapacity(30);
		System.out.println(buf.capacity());
		// StringBuffer ���ڿ��� ���ο� ���ڿ� �߰�
		buf.insert(0, "Hi! ");
		buf.insert(13, "Everybody~");
		System.out.println(buf);
		// StringBuffer ���ڿ��� �Ϻγ�������
		buf.delete(0, 4);
		System.out.println(buf);		
	}
}
