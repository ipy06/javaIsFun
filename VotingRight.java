import java.util.Scanner;

public class VotingRight {
    public static void main(String[] args){

		System.out.print("How old are you? ");
		Scanner input = new Scanner(System.in);

 		int myAge = input.nextInt();
        
        if (myAge >= 18) {
            System.out.println("You have the right to vote!");
        } else {
            System.out.println("You will be allowed to vote in "+ (18 - myAge)+" years.");
        }
        input.close();
	}
}
