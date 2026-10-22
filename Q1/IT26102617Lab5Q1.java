import java.util.Scanner;

	public class IT26102617Lab5Q1{
		public static void main(String[] args){
		
		Scanner value = new Scanner(System.in);
		
		System.out.print("Enter the first integer:");
		int firstInteger = value.nextInt();
		
		System.out.print("Enter the second integer:");
		int secondInteger = value.nextInt();
		
		System.out.print("Enter the third integer:");
		int thirdInteger = value.nextInt();
		
		System.out.println("\nUser entered number are:" +  firstInteger  + " "  +  secondInteger  + " "  +  thirdInteger);
		
		int smallest = Math.min(firstInteger, Math.min(secondInteger, thirdInteger));
		int largest = Math.max(firstInteger, Math.max(secondInteger, thirdInteger));
		
		System.out.println("The Smallest number is: " + smallest);
		System.out.println("The Largest number is: " + largest);
		
	}
}
		