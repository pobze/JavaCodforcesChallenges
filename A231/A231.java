import java.util.Scanner;

public class A231 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = 0; i < n ; i++){
            int Petya = in.nextInt();
            int Vasya = in.nextInt();
            int Tonya = in.nextInt();
            if (Petya == Vasya && Petya ==1)count += 1;
            else if (Vasya == Tonya && Vasya ==1) {
                count += 1;
            } else if (Tonya == Petya && Tonya ==1) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
