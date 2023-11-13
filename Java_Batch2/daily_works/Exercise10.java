import java.util.*;

class Exercise10{
  public static void main(String []args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the age");
  int age=sc.nextInt();
  if(age>=1 && age<=120){
  if(age>=1 && age<=12){
  System.out.println("Kid");
}
  else if(age>=13 && age<=19){
System.out.println("Teenage");
}
else if(age>=20 && age>=60){
System.out.println("Adult");
}
else{
System.out.println("senior");
}
}
else{
  System.out.println("Invalid choice");
}
}
}