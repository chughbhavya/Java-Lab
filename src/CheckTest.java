
public class CheckTest {
	static int sum = 0;
	public static void main(String[] args) {
		int[] arr = {0,1,2,3};
		String y = "Bhavya";

//		System.out.println(arr.length);
		for(int i: arr)
			sum += i;
		
		System.out.println(sum);
		check c = new check();
		c.test();
		System.out.println(c.x);
		System.out.println(String.valueOf(y));
		
			
	}
		

}
