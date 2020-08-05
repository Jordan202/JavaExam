package EXam;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  
	    System.out.println("Enter no ");
	    int x=s.nextInt();
	    s.close();
		
	    if (x<100||x>100) {;
	    System.out.println("good");
	    

	}else {
		System.out.println("bad");
	}
}
}