
import java.util.*;

class Exercise6{
  public static void main(String []args){
  int n1,n2;
  System.out.println("Enter two numbers");
  Scanner sc=new Scanner(System.in);
  n1=sc.nextInt();
  n2=sc.nextInt();

  if(n1==n2){
     System.out.println("n1 is equal to n2");
  }
  else if(n1>n2){
     System.out.println("n1 is greater than n2");
  } 
  else{
      System.out.println("n2 is greater than n1");
}
}
}