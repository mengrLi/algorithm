package IsIdealPermutatio;

public class IsIdealPermutation {
    public static boolean isIdealPermutation(int[] A) {
        int local = 0;
        int global = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                local++;
            }
        }

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    global++;
                }
            }
        }
        System.out.println("local is: " + local);
                System.out.println("global is:"+ global);
        if (global == local) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 0};
        System.out.println(isIdealPermutation(a));
    }

}
