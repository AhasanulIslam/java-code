 public class Teachern1 { 
    int num,age;
 String name;
 static String university_name="DU";
 
 Teachern1 ()
 {
   System.out.println("no information");  
 }
 Teachern1 (int a,String s){
    
    age=a;
    name=s;
    }
 
  Teachern1 (int n,int a,String s){
    num=n;
    age=a;
    name=s;
 
 }
  
 void printAllInfo()
 {
 System.out.println("name :"+name);
 
 System.out.println("age :"+age);
 
 System.out.println("num :"+num);
 
  System.out.println("university_name :"+university_name);
 
 }
 
 
 
 
 }
