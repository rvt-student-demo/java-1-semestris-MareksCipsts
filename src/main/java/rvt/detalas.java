package rvt;

import java.util.Scanner;

public class detalas {
    public static void main (String[] args) {
        System.out.print("Bob's Discount Bolts");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ievadi skrūvju skaitu:");
        int skruves = sc.nextInt();
        int skrcena = skruves * 5;
        System.out.print("Ievadi uzriežņu skaitu:");
        int uzgr = sc.nextInt();
        int uzgrcena = uzgr * 3;
        System.out.print("Ievadi paplākšņu skaitu:");
        int papl = sc.nextInt();
        int paplcena = papl * 1;
        int total = skrcena + uzgrcena + paplcena;
        if (skruves > uzgr) {
            System.out.println("Pārbaudi pasūtījumu: par maz uzgriežņu");
        }
        if (skruves * 2 > papl) {
            System.out.println("Pārbaudi pasūtījumu: par maz paplāksņu");
        } 
        if (uzgr >= skruves && papl >= skruves * 2) {
            System.out.println("Pasūtījums ir pareizs");
        }
        
        System.out.println("Kopējā cena:" + total);
    }
}
