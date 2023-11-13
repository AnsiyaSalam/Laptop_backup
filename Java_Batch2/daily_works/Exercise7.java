import java.util.*;

class Exercise7{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int distance,time,speed;
System.out.println("Enter the speed and distance");
distance=sc.nextInt();
speed=sc.nextInt();
time=distance/speed;
System.out.println("The time is"+time);
}
}