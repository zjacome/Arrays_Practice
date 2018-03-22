import java.util.Scanner;
public class ArraysScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
					
		int[] numbers=new int[5];
				
				for(int x=0; x<numbers.length; x++) {
					
					System.out.println("Enter a number");
					numbers[x]=sc.nextInt();
						
				}
					
					System.out.println("Last Number in the array is " +numbers[4]);
					
				}
				
				
				
	}


