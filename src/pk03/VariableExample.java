package pk03;

public class VariableExample {
	private int globalInteger;
	private float globalFloat;
	private double globalDouble;
	private long globalLong;
	
	public void showVariables(){
		// �������� ����
		int localInteger;
		float localFloat;
		double localDouble;
		long localLong;
		
		// �������� ����ϱ�
		/*
		System.out.format("globalInteger : %d %n" , globalInteger);
		System.out.format("globalFloat : %f %n" , globalFloat);
		System.out.format("globalDouble : %f %n" , globalDouble);
		System.out.format("globalLong : %d %n", globalLong);
		*/
		
		//�������� �� �ֱ�
		
		// �������� �ʱ�ȭ �� ��� �ϱ�
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
		
		//���� �����Ͽ� ����ϱ�
		/*
		localFloat = 3.141593f;
		System.out.format("localFloat : %.3f%n", localFloat); // �Ҽ��� ���ڸ����� ���
		System.out.format("localFloat : %10.3f%n", localFloat); // ������ ���� | �Ҽ��� ���ڸ� ���
		System.out.format("localFloat : %10.6f%n", localFloat); // ������ ���� | �Ҽ��� �����ڸ� ���
		System.out.format("localFloat : %-10.3f%n", localFloat); // �������� | �Ҽ��� ���ڸ� ���
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
