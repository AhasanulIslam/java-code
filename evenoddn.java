import java.util.Scanner;

public class evenoddn{

public static void main(String [] args){
        
           Scanner input = new Scanner(System.in);
           char ch,cp,sm;
           System.out.print("enter the charecter : ");
           ch = input.next().charAt(0);
           System.out.println(" "+ch);
           
           if (ch>='a' && ch<='z')
           {
           cp='a'-32;
           System.out.println(" "+cp);
           }
           
            
           else if (ch>='A' && ch<='Z')
           {
           sm='A'+32;
           System.out.println(" "+sm);
           }
           
           else
           {
           System.out.println(" the enter char is not a letter");
           }
                        
        
      }

}
