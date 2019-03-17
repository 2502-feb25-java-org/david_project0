import com.sun.rowset.internal.Row;

public class Coll{
    public static void main(String[] args){

        // int[] arr = new int[10];
        // arr[0] = 34;
        // arr[1] = 22;

        // for (int i : arr) {
        //     System.out.println(i);
        // }
        //2-D array
        // int row = 2, col = 3;
        //     int[][] arry = {
        //         {1,2,3},
        //         {4,5,6}
        //     };
        //jagged array
        String[][] ja = new String[2][]; //two element with each element an array
        ja[0] = new String[]{"hello", "world","hi"};
        ja[1] = new String[]{"we","are","all","drinking"};
        //ja[2] = new String[]{"coffee","is","good"};

        System.out.println(ja.length);
        for(int i = 0; i < ja.length; i++){
            for (int j = 0; j < ja[i]; j++) {
                System.out.println(s);
            }
        }
        
    
    }
}