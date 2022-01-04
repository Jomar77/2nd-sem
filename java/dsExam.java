import java.util.*;

public class dsExam
{
	public static void main(String args[])
                {
                        Scanner sc = new Scanner(System.in);
                        System.out.print("Your Name      : ");
                        String a = sc.nextLine();
                        a = a.replaceAll("\\s+", "");
                        System.out.print("Partner Name   : ");
                        String b = sc.nextLine();
                        b = b.replaceAll("\\s+", "");
        

                        char[] name1 = new char[a.length()];
                        for (int i = 0; i < a.length(); i++) {
                                name1[i] = a.charAt(i);
                            }

                        char[] name2 = new char[b.length()];
                        for (int i = 0; i < b.length(); i++) {
                                name2[i] = b.charAt(i);
                            }
                            
                        
                        dsExam g = new dsExam();
                        String c = g.symDiff(name1,name2);
                        int length = c.length();
                
                        
                        flames(length);

                }


                String symDiff(char a[], char b[]){

                        String hold = "";
            
                        for(int i = 0; i < a.length; i++){
                            hold += a[i];
                        }
            
            
                        for(int i = 0; i < b.length; i++){
                            hold += b[i];
                        }
            
                        for (int i = 0; i < a.length; i++) {
                            for (int j = 0; j < b.length; j++){
                                if (a[i] == b[j]){
            
                                    hold =  hold.replace(Character.toString(a[i]), "");
                                    break;
                                }
                            }
                        }

                        return hold;
                    }

                   
                static void flames(int total){
                        
                        int val = total;
                        System.out.println(val);
                        if (val > 6)
                                val = total%6;
                        

                        if (val == 1){
                                System.out.println("Friends");
                        }
                        else if (val == 2){
                                System.out.println("Love");
                        }
                        else if (val == 3){
                                System.out.println("Affection");
                        }
                        else if (val == 4){
                                System.out.println("Marriage");
                        }
                        else if (val == 5){
                                System.out.println("Enemies");
                        }
                        else{
                                System.out.println("Sibling");
                        }    
        
    }
    

}