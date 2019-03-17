public class MultiMatrix {

    public static void mulitiplyArray(int[][] a, int[][] b) {
        int z[][] = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                z[i][j] = a[i][j] * b[i][j];
            }
        }

        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < z[i].length; j++) {
                System.out.println("Location ["+i+"]["+j+"] " +z[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        int x[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

        int y[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

        mulitiplyArray(x, y);
    }
}