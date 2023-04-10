import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Guessing_Game {
    public static void main(String args[]) {  
        while(true){
           
           
            int attempts = 0;
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int rand_int1 = rand.nextInt(51);
           
            while(true){
            try
            {
            System.out.print("Enter number: ");
            int ans = scan.nextInt();
             if(ans < rand_int1){
                System.out.println("Too low. Try again \n");
                attempts +=1;
                continue;
    
            }
            else if(ans >= 51){
                System.out.println("Out of range! \n");
                attempts +=1;
                continue;
    
            }
            else if(ans > rand_int1){
                System.out.println("Too High. Try again \n");
                attempts +=1;
                continue;
                
    
            }
            else
            System.out.printf("You got it in %,d attempts(s) \n", attempts);
            break;
           
            }
            catch(Exception e)
            {
                System.out.println("Invalid Input! ");
                scan.nextLine();
                continue;
                
            }
        
        }
        scan.nextLine();
        System.out.println("Continue Playing? [y/n]: ");
        String again = scan.nextLine().toUpperCase();
        if(again.equals("N")){
            System.out.println("thank you for playing!");
            break;
        }
        else{
            continue;
        }
                
          
    }
}
}
                  
                                            

        
    
    

