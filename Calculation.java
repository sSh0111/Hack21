import javaprogramming.*;
class Calculation
{
public static void main(String args[])
{
int a=200;
int b=100;
addition obj_a=new addition();
System.out.println("Addition of 2 numbers(using javaprogramming package): "+ obj_a.add(a,b));
subtraction obj_s=new subtraction();
System.out.println("Subtraction of 2 numbers(using javaprogramming package): "+ obj_s.sub(a,b));
}
}