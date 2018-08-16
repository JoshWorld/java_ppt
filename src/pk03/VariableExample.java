package pk03;

public class VariableExample {
	private int globalInteger;
	private float globalFloat;
	private double globalDouble;
	private long globalLong;
	
	public void showVariables(){
		// 지역변수 선언
		int localInteger;
		float localFloat;
		double localDouble;
		long localLong;
		
		// 전역변수 출력하기
		/*
		System.out.format("globalInteger : %d %n" , globalInteger);
		System.out.format("globalFloat : %f %n" , globalFloat);
		System.out.format("globalDouble : %f %n" , globalDouble);
		System.out.format("globalLong : %d %n", globalLong);
		*/
		
		//전역변수 값 넣기
		
		// 지역변수 초기화 및 출력 하기
		/*
		localInteger = 5;
		localFloat = 3.141593f;
		localDouble = 4.61012d;
		localLong = 21954875453l;
		
		System.out.format("localInteger : %d%n" , localInteger);
		System.out.format("localFloat : %f%n" , localFloat);
		System.out.format("localDouble : %f%n", localDouble);
		System.out.format("localLong : %d%n", localLong);
		*/
		
		//포맷 지정하여 출력하기
		/*
		localFloat = 3.141593f;
		System.out.format("localFloat : %.3f%n", localFloat); // 소수점 세자리까지 출력
		System.out.format("localFloat : %10.3f%n", localFloat); // 오른쪽 정렬 | 소수점 세자리 출력
		System.out.format("localFloat : %10.6f%n", localFloat); // 오른쪽 정렬 | 소수점 여섯자리 출력
		System.out.format("localFloat : %-10.3f%n", localFloat); // 왼쪽정렬 | 소수점 세자리 출력
		*/
	}

	public int getGlobalInteger() {
		return globalInteger;
	}

	public void setGlobalInteger(int globalInteger) {
		this.globalInteger = globalInteger;
	}

	public float getGlobalFloat() {
		return globalFloat;
	}

	public void setGlobalFloat(float globalFloat) {
		this.globalFloat = globalFloat;
	}

	public double getGlobalDouble() {
		return globalDouble;
	}

	public void setGlobalDouble(double globalDouble) {
		this.globalDouble = globalDouble;
	}

	public long getGlobalLong() {
		return globalLong;
	}

	public void setGlobalLong(long globalLong) {
		this.globalLong = globalLong;
	}
	
}
