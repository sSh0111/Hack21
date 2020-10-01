import java.util.*;
import java.lang.*;

public class q1{
public static void main(String[] args) {
Scanner x = new Scanner(System.in);
int a, b, c, max = 0;
System.out.println("Enter numbers : ");
a = x.nextInt();
b = x.nextInt();
c = x.nextInt();
max = a>b?(a>c?a:c):(b>c?b:c);
System.out.println("Max value : "+max);
}
}