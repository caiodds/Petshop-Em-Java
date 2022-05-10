# Petshop-Em-Java
PetShop Em Java
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetFeliz pet = new PetFeliz();
        dono donoPet = new dono();

        pet.nomeCachorro = "Puppy";
        pet.idadecachorro = "10";
        pet.racaCachorro = "Maltes";
        donoPet.nomeDono = "Caio";

        System.out.println("PetFeliz");
        System.out.println("-----------------");
        System.out.println("Nome do dono: "+donoPet.nomeDono);
        System.out.println("Nome do dog: " +pet.nomeCachorro);
        System.out.println("Idade do Dog: "+pet.idadecachorro);
        System.out.println("Raça Do Dog: "+pet.racaCachorro);

    }
}
