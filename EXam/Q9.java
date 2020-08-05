package EXam;

public class Q9 {

	public static void main(String[] args) {
		int x=5;
		for(int i=1;i<=9;i++){ 
			
			for (int j=x;j>=1;j--)
			{
				System.out.println(" ");
			}
			for(int j=1;j<=i;j++){  
			        System.out.print(i+"  ");  
			}  
			System.out.println();
			x=x-2;

}
	}

}
