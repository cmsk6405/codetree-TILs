import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());

        System.out.printf("%s\n",s);
        System.out.printf("%.2f\n",a);
        System.out.printf("%.2f", b);
    }
}