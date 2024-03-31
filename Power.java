import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base :") ;
		int base = sc.nextInt();
		
		System.out.println("Enter the raise :");
		int raise = sc.nextInt() ;
		
		System.out.println(pow(base, raise)) ;
		

	}
	
	public static int pow(int base, int raise) {
		if (raise == 0) {
			return 1 ;
		}
		else {
			return pow(base , (base * raise - 1)) ;
		}
		
	}

}
