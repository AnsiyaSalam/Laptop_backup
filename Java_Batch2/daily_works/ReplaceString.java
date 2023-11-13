class ReplaceString{
public static void main(String []args){
StringBuffer str= new StringBuffer("Hello everyone, how are you?");
str.replace(6,15,"folks");
System.out.println(str);
}
}
