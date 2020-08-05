package EXam;

public class Q8 {

	public static void main(String[] args) {
		int x=4;
		for(int i=1;i<=8;i++){ 
			
			for (int j=x;j>=1;j--) {
				System.out.println(" ");
			}
			for(int j=1;j<=i;j++){  
			        System.out.print(j+" ");  
			}  
			System.out.println();
			x=x-1;

}
}}