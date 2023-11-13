class Design{
public static void main(String []args){
int lines=5;
for(int row=1; row<=lines; row++){
for(i nt col=1; col<row; col++){
char ch=row%2==0 ? '#' : '*';
System.out.print(ch+"  ");
}
System.out.println();
}
}
}
