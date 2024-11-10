import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String szyfr = scanner.nextLine();
            String odszyfrowane = "";
            int klucz = -3;
            while (klucz < 0){
                klucz+=26;
            }
            for (int i = 0; i < szyfr.length(); i++) {
                if (szyfr.charAt(i) != ' '){
                    char przesunietyZnak = (char) (szyfr.charAt(i) - (klucz % 26));
                    char poprawkaNaPoczatekAlfabetu;
                    if ('A' - przesunietyZnak > 0) {
                        poprawkaNaPoczatekAlfabetu = (char) ('Z' - ('A' - przesunietyZnak) + 1);
                    } else {
                        poprawkaNaPoczatekAlfabetu = przesunietyZnak;
                    }
                    odszyfrowane += poprawkaNaPoczatekAlfabetu;
                } else {
                    odszyfrowane += ' ';
                }
            }
            System.out.println(odszyfrowane);
        }
    }
}