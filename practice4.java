package ex1.io;

import java.util.Random;
public class Program {

	public static void main(String[] args) {
		Random rand=new Random();
		
		int lucky1=rand.nextInt(3);
		switch(lucky1) {
		case 0 :System.out.println("가위");break;
		case 1 :System.out.println("바위");break;
		case 2 :System.out.println("보");break;
		}
	
	}
}

