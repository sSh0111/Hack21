package javaprogramming;
 public class addition
{
int a,b;
public int add(int x,int y)
{
a=x;
b=y;
return x+y;
}
public static void main(String args[])
{
addition in=new addition();
System.out.println("add is "+in.add(50,90));
}
}