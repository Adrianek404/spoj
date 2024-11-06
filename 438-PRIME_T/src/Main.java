import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int n, i;

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        if (n<100000)
        for (int j = 0; j < n; j++) {
            i = scanner.nextInt();
            System.out.println(isPrime(i) ? "TAK" : "NIE");
        }
        scanner.close();
    }

    private static boolean isPrime(int liczba){
        if (liczba < 2){
            return false;
        }
        if (liczba == 2) {
            return true;
        }
        if (liczba % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= liczba; i += 2) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }
}