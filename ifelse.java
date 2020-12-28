import java.util.Scanner;

public class ifelse{

public static void main(String [] args){
        
           Scanner input = new Scanner(System.in);
           int num;
           System.out.print("enter the num : ");
           num = input.nextInt();
           System.out.print(" "+num);
           
           if (num > 0)
           {
           System.out.print("the enter is positive");
           }
           
           else
           {
           System.out.print(" the enter num negetive");
           }
                        
        
      }

}
