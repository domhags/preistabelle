import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Übersichtstabelle");
        System.out.println("Geben Sie den unteren Limit ein:");
        double unteresLimit = scanner.nextDouble();
        System.out.println("Geben sie das obere Limit ein:");
        double oberesLimit = scanner.nextDouble();
        double schrittweite = (oberesLimit - unteresLimit) / 10;

        System.out.print("\t");  //Tabulator für erste Zeile
        for (double j = unteresLimit; j <= oberesLimit; j += schrittweite) {
            System.out.printf("%.2f\t", j); //Anzeige der Einzelpreise
        }
        System.out.println();

        for (int stueck = 10; stueck <= 100; stueck += 10) {
            System.out.printf("%d\t", stueck); //Anzeige der Stückzahl
            for (double j = unteresLimit; j <= oberesLimit; j+=schrittweite) {
                double ergebnis = j * stueck;
                System.out.printf("%.2f\t", ergebnis); //Ausgabe der Preise gerundet auf 2 Nachkommastellen
            }
            System.out.println();
        }
    }
}
