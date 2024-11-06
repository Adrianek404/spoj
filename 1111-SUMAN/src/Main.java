import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int n = scanner.nextInt();
            if (n >= 1 && n<=1000) {
                int suma = 0;
                int tempN = n;
                for (int j = 0; j < n; j++) {
                    suma = suma + tempN;
                    tempN--;
                }
                System.out.println(suma);
            }
        }
    }
}

// Zadanie wykonane poprawnie
//https://pl.spoj.com/users/adrianek404/