import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n<=100){
            for (int i = 0; i < n; i++) {
                String pesel = scanner.next();
                String[] peselArray = pesel.split("");
                if (pesel.length()!=11){
                    return;
                }
                int pierwsza = Integer.parseInt(peselArray[0]);
                int druga = Integer.parseInt(peselArray[1]);
                int trzecia = Integer.parseInt(peselArray[2]);
                int czwarta = Integer.parseInt(peselArray[3]);
                int piata = Integer.parseInt(peselArray[4]);
                int szosta = Integer.parseInt(peselArray[5]);
                int siodma = Integer.parseInt(peselArray[6]);
                int osma = Integer.parseInt(peselArray[7]);
                int dziewiata = Integer.parseInt(peselArray[8]);
                int dziesiata = Integer.parseInt(peselArray[9]);
                int jedenasta = Integer.parseInt(peselArray[10]);
                int suma = ((pierwsza * 1) + (druga * 3) + (trzecia * 7)
                        + (czwarta * 9) + (piata * 1) + (szosta * 3)
                        +(siodma * 7) + (osma * 9) + (dziewiata * 1) +( dziesiata * 3) + (jedenasta*1));
                if (suma%10==0){
                    System.out.println("D");
                } else {
                    System.out.println("N");
                }
            }
        }
        scanner.close();

    }
}