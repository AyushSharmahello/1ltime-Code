public class fact2 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fac(n, 1));
    }

    public static int fac(int n, int ans) {
        
        //base
        if (n == 0) {
            return ans;
        }

        return fac(n - 1, ans * n);
    }
}
