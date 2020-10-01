/*This Code demonstrates working of 1D, 2D normal and 2D jagged Array,                  | 
   by implementing various functions on the 1D array. Also this code demonstrates       |
   the Working of various String functions. Command Line inputs are also required(only  |
   the first String will be considered). Proper JAVA Code Structure has been followed,  |
   public class and static methods have been employed to get the job done.              |
   Code by Yash Ray, 19BCE0235                                                          |
<--------------------------------------------------------------------------------------->*/
import java.util.*;
public class ast_1 {
    public static void str_func(String s) {
        //This method applies various String Functions on the provided String
        System.out.println("******String Operations******");
        
        //Function 1 - .length()
        System.out.println("Length of the entered String is "+s.length());
        
        //Function 2 - .substring()
        System.out.println("Substring from 2 to 4 in the given string is "+s.substring(2,4));
        
        //Function 3 -  .compareTo()
        System.out.println("Comparison of the given string with \"Apple\" is "+s.compareTo("Apple"));
        
        //Function 4 - .equals()
        System.out.println("Equality is present in the given string and \"Apple\" : "+s.compareTo("Apple"));
        
        //Function 5 - .equalsIgnoreCase()
        System.out.println("Equality is present in the given String wrt the String \"apPle\" "+s.equalsIgnoreCase("apPle"));
        
        //Function 6 - .startsWith()
        System.out.println("The entered String starts with an \"a\" "+s.startsWith("a"));
        
        //Function 7 - .endsWith()
        System.out.println("The entered String ends with an \"e\" "+s.endsWith("e"));
        
        //Function 8 - .hashCode()
        System.out.println("Hash Code of the entered String is "+s.hashCode());
        
        //Function 9 - .concat()
        System.out.println("String after Concatanating extra spaces after thr length : "+s.concat("     "));
        
        //Function 10 - .trim()
        System.out.println("String after removing redundant spaces from both ends : "+s.trim());
    }
    
    //Method to demonstrate 1D array and its functions
    public static void arr1D() {
        Scanner x = new Scanner (System.in);
        System.out.println("\n******1D Array******");
        System.out.print("Enter a size for the array : ");
        int sz = x.nextInt();
        int[] arr = new int[sz];
        System.out.println("Enter "+sz+" elements for the array : ");
        for(int i = 0 ; i < sz ; i++) {
            arr[i] = x.nextInt();
        }
        
        //Function 0 - .length()
        System.out.println("Size of the Array is "+arr.length);
      
        //Function 1 - Arrays.sort()
        System.out.println("The Sorted Array is : ");
        Arrays.sort(arr);
        for(int i = 0; i < sz ; i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
        
        //Function 2 - Arrays.binarySearch()
        System.out.print("Enter an element to be searched : ");
        int src = x.nextInt();
        int pos = Arrays.binarySearch(arr, src);
        if(pos < 0)
            System.out.println("Element Not Found.");
        else
            System.out.println("Element found at position "+(pos+1));
        
        //Function 3 - Arrays.hashCode()        
        int hc = Arrays.hashCode(arr);
        System.out.println("Hash Value of the Given Array's instance is "+hc);
        
        //Function 4 - Arrays.toString()
        System.out.println("Arrays entered is : "+Arrays.toString(arr));
        
        //Function 5 - Arrays.equals()
        System.out.print("Enter another size for another array : ");
        int sz2 = x.nextInt();
        int[] arr2 = new int[sz];
        System.out.println("Enter "+sz2+" elements for the array : ");
        for(int i = 0 ; i < sz ; i++) {
            arr2[i] = x.nextInt();
        }
        System.out.println("Both the arrays are equal? : "+Arrays.equals(arr, arr2));
    }
    
    //Method to perform basic operations on a normal 2D array and also, demonstrate its functioning.
    public static void arr_2D_normal() {
        Scanner x = new Scanner(System.in);
        System.out.println("\n******2D Normal Array******");
        System.out.print("Enter number of rows : ");
        int r = x.nextInt();
        System.out.print("Enter number of columns : ");
        int c = x.nextInt();
        int[][] arr2D = new int[r][c];
        System.out.println("Enter "+(r*c)+" elements for the array : ");
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                arr2D[i][j] = x.nextInt();
            }
        }
        //To display the border elements of the matrix in a suitable format.
        System.out.println("The Border elements of the array are : ");
        for(int i = 0; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                if(i==0 || j==0 || i==(r - 1) || j == (c - 1))
                    System.out.print(arr2D[i][j]+"\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
    
    //Method to Demonstrate working of a Jagged 2D Array   
    public static void arr_2D_jagged() {
        Scanner x = new Scanner (System.in);
        System.out.println("\n******2D Jagged Array******");
        System.out.print("Enter number of rows for the jagged 2D array : ");
        int r_jag = x.nextInt();
        int col_jag = 0;
        int[][] arr2Djag = new int[r_jag][];
        int[] sizing = new int[r_jag];
        System.out.println("Enter the number of elements to be stored in each row of the jagged Array : ");
        for(int i  = 0; i < r_jag ; i++) {
            col_jag = x.nextInt();
            arr2Djag[i] = new int[col_jag];
            sizing[i] = col_jag;
        }
        int sum = 0;
        for(int i:sizing)
            sum+=i;
        //Displaying Working of jagged array
        System.out.println("Enter "+sum+" elements for the Jagged Array : ");
        for(int i  = 0; i < r_jag ; i++) {
            for(int j = 0 ; j < sizing[i] ; j++) {
                arr2Djag[i][j] = x.nextInt();
            }
        }
        //Displaying the entered array
        System.out.println("The Resulting Jagged Array is : ");
        for(int i = 0; i < r_jag ; i++) {
            for(int j = 0 ; j < sizing[i] ; j++) {
                System.out.print(arr2Djag[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    //Main Method, the Heart of the Program.
    public static void main(String[] args) {
        String s1 = args[0];
        str_func(s1);
        arr1D();
        arr_2D_normal();
        arr_2D_jagged();
    }
}       