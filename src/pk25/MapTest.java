package pk25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
//		1. �ʱ�ȭ �ϱ�
//		Map<String, String> myMap = new HashMap<String, String>();
		Map<String, String> myMap = new HashMap<>();
//		2. �� �ֱ�
		myMap.put("name", "legend");
		myMap.put("age", "25");
		myMap.put("job", "student");
//		3. Ű�� �̿��� ��� �˾Ƴ���
		System.out.println(myMap.get("name"));
		System.out.println(myMap.get("age"));
		System.out.println(myMap.get("job"));
//		4. �ش� Ű�� ���� �Ǿ� �ִ��� Ȯ��
		boolean isContainsKey = myMap.containsKey("name");
		if(isContainsKey){
			System.out.println("isContainsKey: " + isContainsKey);
		}
//		5. �ش� ����� ���� �Ǿ� �ִ��� Ȯ��
		boolean isContainsValue = myMap.containsValue("student");
		if(isContainsValue){
			System.out.println("isContainsValue: " + isContainsValue);
		}
//		6. HashMap �� ������(����) �˾Ƴ���
		int mapSize = myMap.size();
		System.out.println("mapSize : " +  mapSize);
//		7. while ��ȯ������ HashMap �� ��� ���� Ȯ���ϱ�
		showHashMap(myMap);
//		8. remove �Լ��� ���� ���� �ϱ�
		boolean removeResult = myMap.remove("name", "legend");
//		boolean removeResult = myMap.remove("name");
		System.out.println("removeResult: " + removeResult);
//		������ �� �Ǿ����� Ȯ�� ����.
		showHashMap(myMap);
	} 
	public static void showHashMap(Map<String, String> input){
		Iterator<String> keys = input.keySet().iterator();
		while(keys.hasNext()){
			String key = keys.next();
			System.out.println("myMap.get(\"" + key +"\") = " + input.get(key));
		}
	}
}
