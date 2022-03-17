import java.util.*;

public class altExam {
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

                altExam g = new altExam();
                int length1= g.diff(name1,name2);
                System.out.println("Count : " + length1);
                int length2 = g.diff(name2,name1);
                System.out.println("Count : " + length2);
                int length = length1 +length2;

                flames(length);
        }

    int diff(char a[], char b[]){

        String hold = "";

        for(int i = 0; i < a.length; i++){
            hold += a[i]+" ";
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++){
                if (Character.toUpperCase(a[i]) == Character.toUpperCase(b[j])){

                    hold =  hold.replace(Character.toString(a[i]), "");
                    break;
                }
                hold = hold.replaceAll("\\s+", "");
            }
        }
        System.out.println(hold);
        int count = hold.length();
        return count;
    }

    int sum(char a[], char b[]){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (Character.toUpperCase(a[i]) == Character.toUpperCase(b[j])){
                    count++;
                }
            }
        }
        return count;
    }

    static void flames(int total){

            int val = total;
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