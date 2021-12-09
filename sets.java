class GFG {
    static boolean isSubset(int a[],
                            int b[], 
                            int m, int n)
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                if (b[i] == a[j])
                    break;
            if (j == m)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int a[] = { 1,2,3,4 };
        int b[] = { 1,2,3,4 };
        boolean h = false;
        int m = a.length;
        int n = b.length;
        System.out.println( "the cardinality of A: "  + m);
        System.out.println( "the cardinality of A: " + n);
        System.out.println("B is a subset of A : " +  isSubset(a, b, m, n));
        if (m > n){
            boolean t = true;
            h = t && isSubset(a, b, m, n);
        }
        System.out.print("B is a subset of A : " + h); 
    }
}