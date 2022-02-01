public class recursive{
    public static void main(String[] args) {
        recursive r = new recursive();
        System.out.println(r.ree(10));
        }
    public int ree(int n) {
        if (n != 0)  // termination condition
            return n * ree(n-1); // recursive call
        else
            return 1;
    }
}
