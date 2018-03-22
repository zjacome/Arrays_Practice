import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		
		
		String[] Names=new String[3];
		
		for(int x=0; x<Names.length; x++) {
			
			System.out.println("Enter a Name");
			Names[x]=sc.nextLine();
				
		}
		for(int y=0; y<Names.length;y++) {
			
			System.out.println(Names[y]);
			
		}
		
		
		
		
		int [] number= new int[3];
		number[0]=3;
		number[1]=34;
		number[2]=6;
		for(int x=0; x<number.length; x++) {
			System.out.println(number[x]);
		}
		
		
		
	}

}
