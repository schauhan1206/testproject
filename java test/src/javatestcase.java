
public class javatestcase {

	public static long add(long i,long j) {
		return i + j;
	}
	
	//static util method
	public static int addInts(int i, int...js) {
		int sum = i;
		for(int x : js) sum+=x;
		return sum;
		
		
	
		

	}

}
