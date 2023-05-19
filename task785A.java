import java.util.ArrayList;
import java.util.Scanner;

public class task785A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(sc.nextLine());
        }
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.equals("Tetrahedron")){
                count += 4;
            } else if (str.equals("Cube")) {
                count += 6;
            } else if (str.equals("Octahedron")) {
                count += 8;
            } else if (str.equals("Dodecahedron")) {
                count += 12;
            } else if (str.equals("Icosahedron")){
                count += 20;
            }
        }
        System.out.println(count);
    }
}

