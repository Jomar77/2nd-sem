public class equivalent{
    public static void main(String args[])
    {
        int b[] = { 1,2,3,4 };
        int a[] = { 2,3,4 };
        int i = 0;
        int j = 0;
        boolean t, h = true;

        int m = a.length;
        int s = b.length;

        System.out.println( "the cardinality of A: "  + m);
        System.out.println( "the cardinality of A: " + s);

        
        for (i = 0; i < s; i++) {
            for (j = 0; j < m; j++)
                if (b[i] == a[j])
                    break;
            if (j == m)
                h = false;
        }

        if (m == s)
            t = true;
        else
            t= false;

        System.out.println("Equal set: " + h);
        System.out.println("Equivalent set: " + t); 
    }
}