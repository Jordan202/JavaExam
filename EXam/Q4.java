package EXam;

public class Q4 {

	public static void main(String[] args) {
		double price=Double.parseDouble(args [0]);
		double tips=Double.parseDouble(args [1]);
		double total=((tips/100)*price);
		System.out.println(total);

}
}