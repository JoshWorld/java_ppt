package pk24;
import java.util.Stack;
public class StackTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj;		
		//empty ���û���
		Stack<Object> st = new Stack<Object>();
		
		if(st.empty()){//������ ��� ������
			for(int i=1; i<=3; i++){//���ÿ� ����Ÿ�� 3�� �߰�
				st.push(new String("Hi!"+i));
				System.out.println(st.peek());
			}
		}//of if		
		st.pop();
		System.out.println(st.peek());		
		st.pop();
		System.out.println(st.peek());		
		st.push(new String("everybody!"));
		System.out.println(st.peek());		
		st.push(new String("Nice Day!"));
		System.out.println(st.peek());
	}
}
