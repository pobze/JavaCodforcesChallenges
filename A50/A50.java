import java.util.Scanner;

public class A50 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int area = N * M;
        final int domino = 2;
        System.out.println((area/domino));
    }
}
