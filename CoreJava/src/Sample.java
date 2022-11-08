import java.util.Scanner;

/*
 * Data Type
 * 
 * 1. byte
 * 2. short
 * 3. int
 * 4. long
 * 5. float
 * 6. double
 * 7. char
 * 8. boolean 
 * 
 * */
public class Sample {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A:");
		a=sc.nextInt();
		System.out.print("Enter B:");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition : "+c);
	}
}
