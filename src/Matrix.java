import java.util.Arrays;
import java.util.Random;

public class Matrix {
    Random random = new Random();

    Matrix(){}

    Matrix(int n, int k) {
        this.n = n;
        this.k = k;
        this.arr = new int[n][k];
    }

    int[][] arr;
    int n;
    int k;

    void init() {
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr[i][g] = random.nextInt(10, 30);

            }
        }
    }

    void printMatrix() {
        System.out.println(Arrays.deepToString(this.arr));
    }

    Matrix plusMatrix(Matrix matrix){
        int[][] arr_1 = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr[i].length; g++) {
                arr_1[i][g] = arr[i][g] + matrix.arr[i][g];
            }
        }
        Matrix matrix1 = new Matrix();
        matrix1.arr = arr_1;
        matrix1.n = n;
        matrix1.k = k;
        return matrix1;
    }
}
