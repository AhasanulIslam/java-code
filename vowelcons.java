import java.util.Scanner;

public class vowelcons{

public static void main(String [] args){
        
           Scanner input = new Scanner(System.in);
           int ch;
           System.out.print("enter the character : ");
           ch = input.next().charAt(0);
           System.out.println(" "+ch);
           
           if (ch=='a')
           {
           System.out.println("vowel");
           }
           
           else if (ch=='e')
           {
           System.out.println("vowel");
           }
           
           else if (ch=='i')
           {
           System.out.println("vowel");
           }
           
           else if (ch=='o')
           {
           System.out.println("vowel");
           }
           
           else if (ch=='u')
           {
           System.out.println("vowel");
           }
           
           else
           {
           System.out.println(" consonant");
           }
                        
        
      }

}
