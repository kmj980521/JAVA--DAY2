package ex1.io;
import java.util.Scanner; //라이브러리 사용
import java.util.Random;
public class Program {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		
		
		System.out.print("정수 A : "); int a=std.nextInt();
		System.out.print("정수 B : "); int b=std.nextInt();
		if(a%b==0)
		{
			System.out.println("B는 A의 약수입니다.");
		}
		else
	
			System.out.println("B는 A의 약수가 아닙니다");
	}

}

