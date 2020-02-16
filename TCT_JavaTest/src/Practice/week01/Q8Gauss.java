package Practice.week01;

import java.util.Scanner;

public class Q8Gauss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값: ");
		int n = stdIn.nextInt();
		int sum = 0;
		// 1~10 의 합은 (10+1)*5

		sum = (n+1) * n / 2;
	
		System.out.println("1부터 "+ n +"까지의 합은 " + sum + "입니다." );
	}

}
