import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter number :");
		int n = sc.nextInt() ;
		
		System.out.println(fact(n)) ;

	}
	
	public static int fact(int num)
	{
		if (num == 0) {
			return 1 ;
		}
		else {
			return num * fact(num - 1) ;
		}
	}

}
