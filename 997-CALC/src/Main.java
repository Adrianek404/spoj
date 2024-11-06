import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String st = scanner.nextLine();
            if (st.isEmpty()) break;
            if (st.split(" ")[0].equals("+")) {
                System.out.println(Integer.parseInt(st.split(" ")[1]) + Integer.parseInt(st.split(" ")[2]));
            } else if (st.split(" ")[0].equals("-")) {
                System.out.println(Integer.parseInt(st.split(" ")[1]) - Integer.parseInt(st.split(" ")[2]));
            } else if (st.split(" ")[0].equals("*")) {
                System.out.println(Integer.parseInt(st.split(" ")[1]) * Integer.parseInt(st.split(" ")[2]));
            } else if (st.split(" ")[0].equals("/")) {
                System.out.println(Integer.parseInt(st.split(" ")[1]) / Integer.parseInt(st.split(" ")[2]));
            } else if (st.split(" ")[0].equals("%")) {
                System.out.println(Integer.parseInt(st.split(" ")[1]) % Integer.parseInt(st.split(" ")[2]));
            }
        }
        System.exit(0);
    }
}

// Zadanie wykonane poprawnie
//https://pl.spoj.com/users/adrianek404/