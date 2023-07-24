import java.util.Scanner;

public class Factorial {

    public static void main(String arg[]){

        int i,fact = 1;

        Scanner op = new Scanner(System.in);
        
        System.out.print("Enter the number of Factorial: ");
        int count = op.nextInt();

        for(i=1;i<=count;i++){

            fact =fact*i;

        }

        System.out.println("factorial of "+count+ " is "+ fact);
    }
    
}
