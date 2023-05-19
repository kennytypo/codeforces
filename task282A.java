import java.util.ArrayList;
import java.util.Scanner;

public class task282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(sc.nextLine());
        }
        int result = 0;
        for (int i = 1; i < list.size(); i++) {
            String str = list.get(i);
            if (str.charAt(0) == 'X'){
                if (str.charAt(1) == '+'){
                    result++;
                } else if (str.charAt(1) == '-') {
                    result--;
                }
            } else if (str.charAt(2) == 'X') {
                if (str.charAt(0) == '+'){
                    ++result;
                } else if (str.charAt(0) == '-') {
                    --result;
                }
            }
        }
        System.out.println(result);

    }
}