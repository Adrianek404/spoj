import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        while (scanner.hasNextLine()) {
            String st = scanner.nextLine();
            if (st.isEmpty()) break;
            int input = Integer.parseInt(st);
            if (input >= -100 && input <= 100)
                suma += input;
            System.out.println(suma);
        }
        scanner.close();
    }
}

// Zadanie wykonane poprawnie
//https://pl.spoj.com/users/adrianek404/