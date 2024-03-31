import java.util.Scanner;

public class ExtractDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the number :") ;
		int num = sc.nextInt() ;
		
		System.out.println(isDigit(num)) ;

	}
	
	public static boolean isDigit(int num)
	{
		if (num == 10) {
		     return false ;
		}
		int rem = num % 10 ;
		System.out.println(rem) ;
		num /= 10 ;
		isDigit(num) ;
		}
		
	}

}
