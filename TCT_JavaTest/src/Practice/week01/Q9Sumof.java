package Practice.week01;

import java.util.Scanner;

public class Q9Sumof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		System.out.print("b의 값: ");
		int b = stdIn.nextInt();
		System.out.println("합은 "+ sumof(a,b) + "입니다.");
	}

	static int sumof(int a, int b) {
		int sum = 0;
		//3+4+5=12
		
		if(a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		for(int i = 0; i <= b-a; i++) {
			sum += a+i;
		}
		return sum;
	}
}
