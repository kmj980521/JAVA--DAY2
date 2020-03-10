package ex1.io;
import java.util.Scanner; //라이브러리 사용
import java.util.Random;
public class Program {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		
		
		System.out.print("정숫값 : "); int a=std.nextInt();
		
		if(a>0)
		{
			System.out.println("절댓값은"+a+"입니다");
		}
		else
	
			System.out.println("절댓값은"+(-a)+"입니다");
	}

}

