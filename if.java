package ex1.io;
import java.util.Scanner; //라이브러리 사용
import java.util.Random;
public class Program {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		
		int a=std.nextInt();
		
		if(a>0)
			System.out.println(a+"는 양수입니다.");
		else 
			System.out.println(a+"는 양수가 아닙니다.");
	}

}

