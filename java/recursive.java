public class recursive{
    public static void main(String[] args) {
        recursive r = new recursive();
        System.out.println(r.ree(10));
        }
    public int ree(int k) {
        if (k == 0 ) {
            return 1;
        } 
        return k * ree(k - 1);
        }
    }
