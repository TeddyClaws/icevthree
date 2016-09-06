package ui;

import java.util.Scanner;

public class Main {

    private int choix;

    public void run() {

        Scanner sc = new Scanner(System.in);
        int nombre1;
        int nombre2;

        System.out.println("||-------------------------------------------||");
        System.out.println("||Bienvenue sur la calculatrice cooperative !||");
        System.out.println("||-------------------------------------------||");

        System.out.println("Choisissez ce que vous voulez faire :");
        System.out.println("1 - Additionner deux nombres  ?");
        System.out.println("2 - Soustraire deux nombres   ?");
        System.out.println("3 - Multiplier deux nombres   ?");
        System.out.println("4 - Diviser deux nombres      ?");
        System.out.println("5 - Puissance de deux nombres ?");
        System.out.print("Votre choix : ");
        choix = sc.nextInt();

        while (choix < 1 || choix > 5) {
            System.out.println("Le nombre doit etre compris entre 1 et 5 ...");
            System.out.print("Votre choix :");
            choix = sc.nextInt();
        }

        switch (choix) {
        case 1:
            System.out.print("Nombre 1 :");
            nombre1 = sc.nextInt();
            System.out.print("Nombre 2 :");
            nombre2 = sc.nextInt();
            break;
        case 2:
            System.out.print("Nombre 1 :");
            nombre1 = sc.nextInt();
            System.out.print("Nombre 2 :");
            nombre2 = sc.nextInt();
            break;
        case 3:
            System.out.print("Nombre 1 :");
            nombre1 = sc.nextInt();
            System.out.print("Nombre 2 :");
            nombre2 = sc.nextInt();
            break;
        case 4:
            System.out.print("Nombre 1 :");
            nombre1 = sc.nextInt();
            System.out.print("Nombre 2 :");
            nombre2 = sc.nextInt();
            break;
        case 5:
            System.out.print("Nombre 1 :");
            nombre1 = sc.nextInt();
            System.out.print("Nombre 2 :");
            nombre2 = sc.nextInt();
            break;
        default:

        }

        sc.close();
    }
    // toto
}
