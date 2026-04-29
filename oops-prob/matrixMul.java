public class matrixMul {
    public static void main(String[] args) {
        int[][] a = {
                { 3 ,5,9 ,3 },
                { 7 ,2 ,8 ,5 },
                { 1 ,4 ,6 ,7 },
        };

        int[][] b = {
                { 9, 7 },
                { 5, 1},
                { 2 ,6},
                { 3,4},
        };

        int m = a.length;
        int p = b[0].length;
        int n = a[0].length;

        int[][] res = new int[m][p];

        for(int i = 0;i<m;i++){
            for(int j =0 ;j<p ;j++){
                for(int k =0;k<n;k++){
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // print result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(res[i][j]+ "\t");
            }
            System.out.println();
        }

    }

}
