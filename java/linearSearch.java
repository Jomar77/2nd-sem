public class linearSearch {
    public static void main(String[] args) {
        linearSearch l = new linearSearch();
        int a[]= {1,2,3,4,5,6,2};
        System.out.println(l.myVer(2, a));

    }

    public boolean myVer(int value, int num[]){
        int i = 0;
        while ( i < num.length)
        {   
            if (num[i] == value)
            {
                return true;
            }
            else
            {
            i++;
            }
        }   
    return false;
}
}
