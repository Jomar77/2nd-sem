public class reverse
{ 

 public static void main(String[] args) {
    reverse r = new reverse();
    int n = r.r(214748369);
    System.out.println(n);

    int[] num = { 0,1,2,3};
    r.search(num, 3);
    
}

public int r(int x) {
    int rev= 0;
    while( x != 0){
        rev= rev*10 + x % 10;
        x= x/10;
        if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            System.out.println(Integer.MAX_VALUE);
    }
    return (int) rev;
}
void search(int[] num, int val){
    int count  = 0;
    while (count <num.length){
            if(num[count]== val)
            System.out.println("number " + val + " is in the array");
            count++;
    }
}
}