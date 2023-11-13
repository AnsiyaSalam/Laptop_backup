import java.util.*;
class Swap{
public static void main(String []args){

int size;
System.out.println("Enter the size");
Scanner sc=new Scanner(System.in);
size=sc.nextInt();

int arr[]=new int[size];
System.out.println("Enter "+ size +" numbers");

for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
 
for(int i=0; i<arr.length-1; i++){
for(int j=i+1; j<arr.length; j++){

if(arr[i]>arr[j]){
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(var s: arr){
System.out.print(s+" ");
}
}
}


