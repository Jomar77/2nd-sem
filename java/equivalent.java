
public class equivalent{
    public static void main(String args[])
    {
        int b[] = { 1,1,2,3,3,4,6,8,9,1};
        int a[] = { 2,3,3,4,5,6,7,8,9 };
        equivalent eq =new equivalent();

        eq.union(a, b);
        eq.unionAll(a, b);
        eq.intersect(a, b);
        eq.diff(a, b);
        eq.symDiff(a, b);
    }

// Jomar A. Nacorda
    public void union(int a[], int b[]){
        String hold = "";

        for(int i = 0; i < a.length; i++){
            hold += a[i]+" ";
        }
        for(int i = 0; i < b.length; i++){
            hold += b[i]+" ";
        }

        String s = "";

        for (int i = 0; i < hold.length(); i++)
        {

            char val = hold.charAt(i);

            if (s.indexOf(val) < 0)
            {
                s += val + " ";
            }
        }
        System.out.println(s);
   }


    public void unionAll(int a[], int b[]){
        String hold = "";
        for(int i = 0; i < a.length; i++){
            hold += a[i]+" ";
        }
        for(int i = 0; i < b.length; i++){
            hold += b[i]+" ";
        }

        System.out.println(hold);
    }

    public void intersect(int a[], int b[]){
        String hold = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++)
                if (a[i] == b[j]){
                   hold += b[j] + " ";
                }
            }
            String s = "";

            for (int i = 0; i < hold.length(); i++)
            {
                char val = hold.charAt(i);
                if (s.indexOf(val) < 0)
                {
                    s += val + " ";
                }
            }
            System.out.println(s);
        }

        public void diff(int a[], int b[]){

            String hold = "";

            for(int i = 0; i < a.length; i++){
                hold += a[i]+" ";
            }

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++){
                    if (a[i] == b[j]){

                        hold =  hold.replace(Integer.toString(a[i]), "");
                        break;
                    }
                }
            }

            String s = "";

            for (int i = 0; i < hold.length(); i++)
            {
                char val = hold.charAt(i);
                if (s.indexOf(val) < 0)
                {
                    s += val + " ";
                }
            }
            System.out.println(s);
        }



        public void symDiff(int a[], int b[]){

            String hold = "";

            for(int i = 0; i < a.length; i++){
                hold += a[i]+" ";
            }


            for(int i = 0; i < b.length; i++){
                hold += b[i]+" ";
            }

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++){
                    if (a[i] == b[j]){

                        hold =  hold.replace(Integer.toString(a[i]), "");
                        break;
                    }
                }
            }
            
            System.out.println(hold);
            String s = "";

            for (int i = 0; i < hold.length(); i++)
            {
                char val = hold.charAt(i);
                if (s.indexOf(val) < 0)
                {
                    s += val + " ";
                }
            }
            System.out.println(s);
        }

}