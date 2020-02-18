package Practice.week01;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요.");
		System.out.print("입력: ");int a = sc.nextInt();
		int cnt = 1;

		while(a>0) {
			a = a/10;
			if(a != 0) cnt++;
			System.out.println("a:"+a);
		}
		
		System.out.println("그 수는 " + cnt + "자리입니다.");
	}

}
