package first;

import java.util.Scanner;

public class hey {
    public static void main(String[] args) {
        int pwd = 15 ; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Devinez le nombre secret !");
        System.out.print("Entrez un chiffre : ");
        int chiffreUtilisateur = scanner.nextInt();

        if (chiffreUtilisateur > pwd) {
            System.out.println("Le numéro que vous avez saisi est supérieur au numéro secret.");
        } else if (chiffreUtilisateur < pwd) {
            System.out.println("Le numéro que vous avez saisi est inférieur au numéro secret.");
        } else {
            System.out.println("Bravo ! Vous avez gagné le jeu.");
        }

        scanner.close();
    }
}

