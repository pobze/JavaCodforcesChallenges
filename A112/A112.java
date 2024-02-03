import java.util.Scanner;
public class A112 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        String str1 = in.next();
        String str2 = in.next();

        if (str1.equalsIgnoreCase(str2)){
            System.out.println(0);
        } else if (str1.compareToIgnoreCase(str2) > 0){
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
