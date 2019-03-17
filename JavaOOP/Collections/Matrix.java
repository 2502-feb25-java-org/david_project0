public class Matrix {

    public static void arrAdd(int[][] a, int[][] b){
        int c[][] = new int[2][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println("Location ["+i+"]["+j+"] " +c[i][j]);
            }
        }
    }
    public static void main(String[] args) {

        int a[][] = { { 1, 3, 4 }, { 3, 4, 5 } };

        int b[][] = { { 1, 3, 4 }, { 3, 4, 5 } };

        arrAdd(a, b);
       
    }

}