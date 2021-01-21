package gugudan;

import java.util.Scanner; // import해서 Scanner클래스 사용

public class FourFive {
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);  //JDK애서 제공하는 Scanner클래스
		int number = scanner.nextInt();            //number는 사용자가 입혁한 값을 받는 변수 
		System.out.println("number : " + number);
		
		System.out.println(number + "단");
		
		System.out.println(number*1);
		System.out.println(number*2);
		System.out.println(number*3);
		System.out.println(number*4);
		System.out.println(number*5);
		System.out.println(number*6);
		System.out.println(number*7);
		System.out.println(number*8);
		System.out.println(number*9);
		
				
		
	}
}
