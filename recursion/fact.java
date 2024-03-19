class fact{
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fun(n));
    }

    public static int fun(int n) {
        //base cond
        if (n == 0) {
            return 1;
        }
        
        int f = fun(n-1);
        return n * f;
    }
}