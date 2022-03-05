public class re {
    public static void main(String[] args) {
        int a =7, b=10;

        System.out.println( power(a,b));
    }
    
    static int power(int a, int b){
        if (a == 0){
        return 0;
        }
        else 
        return b+power(b,a-1);
    }
}
