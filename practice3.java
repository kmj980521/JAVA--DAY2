package ex1.io;
import java.util.Scanner; //라이브러리 사용
import java.util.Random;
public class Program {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		
		
		System.out.println("A의 값: "); int a=std.nextInt();
		System.out.println("B의 값: "); int b=std.nextInt();
		
		int max;
		
		if(a>b)
			max=a;
		else
			max=b;
		System.out.println("둘 중 큰 값은 "+max+"입니다");
	}
}

