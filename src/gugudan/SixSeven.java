package gugudan;

public class SixSeven {
	public static void main(String[] args) {
		System.out.println("*** 6단 ***");
		int i = 1;
		while(i < 10) {
			int result = 6*i;
			System.out.println(result);
			i++;
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("*** 7단 ***");
		for(int j = 1; j < 10; j++) {
			System.out.println(7*j);
		}
	}
}
