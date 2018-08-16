package example01;

public class ArguTest {

	public static void main(String[] args) {
		int aVal;
		int bVal;
		int Tot;
		
		if(args.length==2){
		    aVal=Integer.parseInt(args[0]);
		    bVal=Integer.parseInt(args[1]);
		}else{
		    aVal=0;
		    bVal=0;
		}

		 Tot=aVal+bVal;
		 System.out.println(Tot);
	}

}
