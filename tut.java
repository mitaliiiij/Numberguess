import java.util.Random;
import java.util.Scanner;

public class tut
{   public static void main(String[] args)
    {Scanner obj = new Scanner(System.in); 
    System.out.println("Guess a number: ");
    int rnum1 = obj.nextInt();
   
   
    Random ran = new Random();
    int rnum = ran.nextInt(101);
    System.out.println("Random number generated is: "+ rnum );
    
    tut.compare(rnum, rnum1);
    }
    public static void compare(int rnum,int rnum1)
    {
        if(rnum == rnum1){
            System.out.println("Your guess is correct");
        }
        else if(rnum > rnum1){
            System.out.println("Your guess is lower");
        }
        else {
            System.out.println("Your guess is higher");
        }
    }
    
}


