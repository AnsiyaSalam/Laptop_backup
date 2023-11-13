import java.util.*;
class Exercise8{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
char c;
System.out.println("Enter the character");
c=sc.next().charAt(0);
if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
System.out.println("It is vowel");
}
else{
System.out.println("It is constant");
}
}
}