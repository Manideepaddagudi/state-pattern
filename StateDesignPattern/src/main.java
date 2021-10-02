import java.util.Scanner;

public class main {

	public static void main(String[] args) {
			TacoMachine machine = new TacoMachine();
			
			
			Scanner scanner = new Scanner( System.in );
			System.out.println("Enter 1 for Ordering Tacos");
			System.out.println("Enter 2 for checking your progress Tacos");
			System.out.println("Enter 3 for checking your delivery status Tacos");
			
			int input = scanner.nextInt();
			if(input==1)
			{
				machine.operate(input);
			
			}
			else if(input ==2)
			{
				
				machine.operate(input);
			}else if(input ==3) {

		
				machine.operate(input);
			}
			
	
	}

}
