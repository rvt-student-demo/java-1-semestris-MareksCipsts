package rvt;
import java.util.Scanner;
public class delikatese {
    public static void main(String[] args) {
        System.out.print("Ievadi preces nosaukumu: ");
        Scanner sc = new Scanner(System.in);
        String prece = sc.nextLine();
        System.out.print("Ievadi cenu: ");
        double cena = sc.nextDouble();
        System.out.print("Ekspress piegage (0 = ne) (1 = ja): ");
        int piegade = sc.nextInt();
        System.out.println("");
        double piegcen = 2.00;
        
        if (piegade == 0 && cena < 10) {
            piegcen = 2.00;
        }

        if (piegade == 1 && cena < 10) {
            piegcen = 5.00;
        }
        
        if (piegade == 0 && cena >= 10) {
            piegcen = 0;
        }
        if (piegade == 1 && cena >= 10) {
           piegcen = 3.00;
        }

        double kopa = piegcen + cena;

        System.out.println("Rekins:");
        System.out.println("    " + prece + "   " + cena);
        System.out.println("     piegade    " + piegcen);
        System.out.println("    kopa        " + kopa);

        

    }
}
