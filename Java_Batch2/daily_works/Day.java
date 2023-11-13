import java.util.*;

class Day{
public static void main(String []args){

int day;
System.out.println("Enter a number");

Scanner sc=new Scanner(System.in);
day=sc.nextInt();

switch(day){

case 1:
System.out.println("Monday");
break;

case 2:
System.out.println("Tuesay");
break;

case 3:
System.out.println("Wednesday");
break;

case 4:
System.out.println("Thursday");
break;

case 5:
System.out.println("Friday");
break;

case 6:
System.out.println("saturday");
break;

case 7:
System.out.println("Sunday");
break;

default:
System.out.println("Wrong option selected");
break;
}

}
}