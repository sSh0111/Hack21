import java.util.*;
class trial {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String[][] arr = new String[10][];
        int i, j, items;
        for(i = 0 ; i< 10; i++)
        arr[i] = x.next();
        for(i = 0; i< 10; i++) {
        System.out.println("Enter number of items in the list for Person "+i+" : ");
        items = x.nextInt();
        arr[i] = new String[items];
        System.out.println("Enter "+items+" items : ");
        for(j = 0 ; j < items ; j++)
             arr[i][j] = x.next();
        }
        
        
        //to check and display common items people
        for(i = 0 ; i < 10 ; i++) {
            for(j = i ; j < 10 ; j++) {
                if(Arrays.equals(arr[i],arr[j]))
                System.out.println( arr[i]+" and "+arr[j]);
            }
        }
    }
}           