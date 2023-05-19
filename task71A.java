import java.util.ArrayList;
import java.util.Scanner;

public class task71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            list.add(sc.nextLine());
        }

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.length() > 10){
                String newStr = "";
                StringBuilder builder = new StringBuilder(newStr);
                builder.append(str.charAt(0));
                builder.append(str.length()-2);
                builder.append(str.charAt(str.length()-1));
                list.set(i,builder.toString());
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
