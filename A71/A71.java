import java.util.Scanner;
public class A71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n ; i++) {
            String s = in.next();
            if (s.length() <= 10) {
                System.out.println(s);
            } else System.out.println(s.charAt(0) + "" + (s.length() - 2) + "" + s.charAt(s.length() - 1));
        } System.exit(0);
    }
}