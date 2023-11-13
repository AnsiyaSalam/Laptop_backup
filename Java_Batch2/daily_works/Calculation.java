import java.util.*;

class Calculation{
public static void main(String []args){

int n1,n2;
System.out.println("Enter two number");
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
n2=sc.nextInt();

System.out.println("\n 1.Add \n 2.Sub \n 3.Mul \n 4.Div");
System.out.println("\n select an arithmetic operator");
int ch=sc.nextInt();

switch(ch){

case 1:
System.out.println(n1+n2);
break;

case 2:
System.out.println(n1-n2);
break;

case 3:
System.out.println(n1*n2);
break;

case 4:
System.out.println(n1/n2);
break;
}

}
}