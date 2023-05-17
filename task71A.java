import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class task71A {
    public static void tooLongStrings(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.length() > 10){
                StringBuilder builder = new StringBuilder(str);
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
