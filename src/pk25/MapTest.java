package pk25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
//		1. 초기화 하기
//		Map<String, String> myMap = new HashMap<String, String>();
		Map<String, String> myMap = new HashMap<>();
//		2. 값 넣기
		myMap.put("name", "legend");
		myMap.put("age", "25");
		myMap.put("job", "student");
//		3. 키를 이용해 밸류 알아내기
		System.out.println(myMap.get("name"));
		System.out.println(myMap.get("age"));
		System.out.println(myMap.get("job"));
//		4. 해당 키가 포함 되어 있는지 확인
		boolean isContainsKey = myMap.containsKey("name");
		if(isContainsKey){
			System.out.println("isContainsKey: " + isContainsKey);
		}
//		5. 해당 밸류가 포함 되어 있는지 확인
		boolean isContainsValue = myMap.containsValue("student");
		if(isContainsValue){
			System.out.println("isContainsValue: " + isContainsValue);
		}
//		6. HashMap 의 사이즈(길이) 알아내기
		int mapSize = myMap.size();
		System.out.println("mapSize : " +  mapSize);
//		7. while 순환문으로 HashMap 의 모든 값을 확인하기
		showHashMap(myMap);
//		8. remove 함수로 값을 삭제 하기
		boolean removeResult = myMap.remove("name", "legend");
//		boolean removeResult = myMap.remove("name");
		System.out.println("removeResult: " + removeResult);
//		삭제가 잘 되었는지 확인 하자.
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
