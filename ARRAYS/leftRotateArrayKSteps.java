package ARRAYS;

public class leftRotateArrayKSteps {
    public static void leftRotateArrayK(int[] arr, int d, int n) {
        d = d % n;
        int j, k, temp, gcd = gcd(d, n);
        for (int i = 0; i < gcd; i++) {
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }, rotateTime = 2, size = arr.length;
        leftRotateArrayK(arr, rotateTime, size);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
