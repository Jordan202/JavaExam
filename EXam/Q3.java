package EXam;

public class Q3 {

	public static void main(String[] args) {
		int x = 8, y = 0,z = 1;
        
        for (int i = 1; i <= x; ++i)
        {
            System.out.print(y+" ");

           
            int s = y + z;
            y = z;
            z = s;
	}

}
}