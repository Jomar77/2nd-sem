public class recursion{
	public static int fib(int num)
    {
        if(num <= 1)
            return num;
        else
            return fib(num - 1) + fib(num - 2);
    }
    public static void main(String args[]) {
	int max = 10;
	for(int i = 0; i < max; i++){
			System.out.print(fib(i) +" ");
		}
	}
}
