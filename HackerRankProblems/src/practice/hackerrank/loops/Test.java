package practice.hackerrank.loops;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(generateRandomNumber(10,15));;
	}
	
	 public static int generateRandomNumber(int max ,int min) {
		   return (int) (Math.random() * (max - min + 1) + min);
	 }

}
