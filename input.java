import java.util.Scanner;

public class input{

public static void main( String [] args)
    {
        
        Scanner cin=new Scanner(System.in);
        int num = cin.nextInt();
        System.out.println("number : "+num);
       
        String faltu = cin.nextLine(); 
        //Scanner input=new Scanner(System.in);
        String name = cin.nextLine();
        System.out.println("name : "+name);
    }

}
