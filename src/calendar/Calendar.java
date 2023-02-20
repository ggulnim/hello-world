package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("두수를 입력하세요");
		s1 = scanner.next();
		s2 = scanner.next();
//		System.out.println(s1+", "+s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.printf("%d 와 %d 두 수의 합은 %d 입니다.",a, b, a+b);
		scanner.close();

		
	}

}
