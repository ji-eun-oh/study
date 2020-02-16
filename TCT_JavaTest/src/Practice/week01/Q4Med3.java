package Practice.week01;

import java.util.Scanner;

public class Q4Med3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("a: "); int a = sc.nextInt();
		System.out.print("b: "); int b = sc.nextInt();
		System.out.print("c: "); int c = sc.nextInt();
		System.out.println("중앙값은 " + Med(a,b,c));
	}
	
	static int Med (int a, int b, int c) {
		int med = a;
		if(a>b) {
			if(b>c) { //a>b>c
				med = b;
			}else{
				//a>c>b
				if(a>c) {
					med = c;
				}else{
					//c>a>b
					med = a;
				}
			}
		}else{ //b>a
			if(a>c) {
				//b>a>c
				med = a;
			}else{
				//b>c>a
				if(b>c) {
					med = c;
				}else {
					//c>b>a
					med = b;
				}
				
			}
		}
		return med;
	}

}
