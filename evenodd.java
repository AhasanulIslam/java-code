import java.util.Scanner;

public class evenodd{

public static void main(String [] args){
        
           Scanner input = new Scanner(System.in);
           int num;
           System.out.print("enter the num : ");
           num = input.nextInt();
           System.out.println(" "+num);
           
           if (num%2==0)
           {
           System.out.println("the enter is even");
           }
           
           else
           {
           System.out.println(" the enter num odd");
           }
                        
        
      }

}
