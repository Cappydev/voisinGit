package com.company;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class Main {

    /**
     * Fonction qui me servira à récupéré le prénom de l'utilisateur.
     *
     * @return userName
     */


    public static void main(String[] args) {

        /**
         * Exo 3 Ecrire un programme qui demande un chiffre à l'utilisateur
         */
        Scanner saisieUtilisateur = new Scanner(System.in);

        System.out.println("Veuillez saisir un entier :");
        int ent = saisieUtilisateur.nextInt();
        int i;
        int result;
        int sommePair = 0;
        int sommeImpair = 0;

        for (i = 0; i < ent; i++){
            if (i % 2 == 0){
                sommePair += i;
                System.out.println(sommePair);
            } else {
                sommeImpair += i;
                System.out.println(sommeImpair);
            }

        }
        result = sommePair + sommeImpair;
        System.out.println("Le résultat des additions des sommepair + impair est "+ " " +result);
        


        /**
         * Exo 2 Ecrire un programme qui demande un chiffre à l'utilisateur
         */
/*
        Scanner saisieUtilisateur = new Scanner(System.in);

        System.out.println("Veuillez saisir un entier :");
        int ent = saisieUtilisateur.nextInt();
        int i;
        int result;
        int sommePair = 0;
        int sommeImpair = 0;

        for (i = 0; i < ent; i++){
            if (i % 2 == 0){
               sommePair += i;
                System.out.println(sommePair);
            } else {
                sommeImpair += i;
                System.out.println(sommeImpair);
            }

        }
        result = sommePair + sommeImpair;
        System.out.println("Le résultat des additions des sommepair + impair est "+ " " +result);
        */


        /**
         * Exo 1 Ecrire un programme qui demande un chiffre à l'utilisateur
         */
       /* int result;

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Veuillez saisir un nombre : ");
            String numberUser = input.nextLine();
            int numberParse = Integer.parseInt(numberUser);



            if (numberParse > 0) {
                result = numberParse * 2;
                System.out.print("Vous avez choisi un nombre positif donc je le multipli" + " " +  result  );
            } else if (numberParse < 0) {
                result = numberParse / 2;
                System.out.print("Vous avez choisi un nombre positif donc je le divise" + " " +  result);
            } else  {

                System.out.print("Veuillez saisir un Nom : ");
                String nameUser = input.nextLine();
                if (nameUser.length() > 7) {
                    System.out.print("Votre nom est grand");
                } else {
                    System.out.print("Votre nom est petit");
                }
                result=nameUser.length();
            }
        } catch (NumberFormatException e) {
            System.out.println("désoler votre nom est pas valide");
            result = -1;
        }
        System.out.println("\n "+ "Le résultat du calcul est " + " " + result +"." ); */



    }


}
