package javaprogramming;
 public class subtraction
{
int a,b;
public int sub(int x,int y)
{
a=x;
b=y;
return x-y;
}
public static void main(String args[])
{
subtraction as=new subtraction();
System.out.println("add is "+as.sub(800,900));
}
}