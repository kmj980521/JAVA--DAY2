package ex1.io;
import java.util.Scanner; //라이브러리 사용
import java.util.Random;
public class Program {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		
		
		System.out.print("a의 값 입력 : "); int a=std.nextInt();
		System.out.print("b의 값 입력 : "); int b=std.nextInt();
		
		if(a==b)
			System.out.println("a와b의 값은 동일합니다");
		else
			System.out.println("a와b의 값은 다릅니다.");
	}

}

