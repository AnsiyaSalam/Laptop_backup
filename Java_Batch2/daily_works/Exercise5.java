
import java.util.*;

class Exercise5{
  public static void main(String []args){
  int n1,n2;
  System.out.println("Enter two numbers");
  Scanner sc=new Scanner(System.in);
  n1=sc.nextInt();
  n2=sc.nextInt();

  if(n1>n2){
     System.out.println("num1 is greater");
  }
  else{
     System.out.println("num2 is greater");
  } 
}
}