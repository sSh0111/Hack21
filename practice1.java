import java.util.*;
import java.io.*;
import java.time.*;

class practice1 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = 10, x1, x2, sum = 0, sum1 = 0, i;
long t1, t2, t3, t4;

ArrayList<Integer> arl = new ArrayList<Integer>(n);
for(i=0;i<n;i++)
{
x1 = in.nextInt();
arl.add(x1);
}
t1 = System.nanoTime();
System.out.println("time1 for ArrayList = "+t1);
arl.remove(0);
arl.remove(4);
arl.remove(9);
for(i=0;i<n;i++){
sum+=arl[i];}
System.out.println("Sum of elements in ArrayList is "+sum);
t2 = System.nanoTime();
System.out.println("time2 for Arraylist = "+t2);
System.out.println("Diff in timing for Array List is "+(t2-t1));


LinkedList<Integer> ll = new LinkedList<Integer>();
for(i =0;i<n;i++) {
x2=in.nextInt();
ll.add(x2);
}
t3 = System.nanoTime();
System.out.println("time1 for LinkedList = "+t3);
ll.remove(0);
ll.remove(4);
ll.remove(9);
for(i=0;i<n;i++){
sum1+=ll[i];
}
System.out.println("Sum of elements in LinkedList is "+sum);
t4 = System.nanoTime();
System.out.println("time2 for LinkedList = "+t4);
System.out.println("Diff in timing for Linked List is "+(t4-t3));


}
}