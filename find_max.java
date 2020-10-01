
import Math.Max.Maximum;
import java.util.Scanner;
import java.io.*;

public class find_max extends Maximum {
    static int maxof3(int a, int b, int c) {
		return (a>b?(a>c?a:c):(b>c?b:c));
		}
        

public static void main(String[] args)throws FileNotFoundException 
{
        Scanner in = new Scanner(new File("D:\\CSE1007\numbers.txt"));
        int [] numbers = new int [100];
        int i = 0, M = 0, j;
        while(in.hasNextInt())
            numbers[i++] = in.nextInt();
        for(j=0;j<numbers.length/3;j++)
		{
            M = maxof3(numbers[j*3],numbers[(j*3)+1],numbers[(j*3)+2]);
		}
		System.out.println("Maximum of Three numbers : "+M);
}
}
