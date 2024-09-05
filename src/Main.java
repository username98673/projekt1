/*
git config user.name "nick"
git confing user.email "mail"
git init - puste repozytorium
git add . - dodaj wszystkie pliki do repozytorium
git commit -m "nazwa" - tworzy migawke o nazwie pusty projekt
git push -u  origin master - dodaj do repozytorium
 */

import java.util.Scanner;

public  class Main{
    public static void  main(String[] args){
        System.out.println("witaj swiecie");

        int wylosowana=(int)(Math.random()*100+1);
        System.out.println(wylosowana);
        System.out.println("Zgadnij liczbe");
        Scanner klawiatura=new Scanner(System.in);
        int wpisanaLiczba=klawiatura.nextInt();
        //instrukcja warunkowa
        if(wpisanaLiczba==wylosowana){
            System.out.println("gratulacje wygrana");
        }
        else{
            System.out.println("pudlo");
        }
        //wyrazenie warunkowe
        int roznica= wylosowana>wpisanaLiczba? wylosowana-wpisanaLiczba : wpisanaLiczba-wylosowana;
        System.out.println(roznica);
        //dzielenie calkowite
        roznica=roznica/10;
        //instrukcja switch
        switch (roznica){
            case 0:
                System.out.println("Dobra robota");
                break;
            case 1:
                System.out.println("Bardo blisko");
            case 2:
                System.out.println("blisko");
            default:
                System.out.println("slabo");
        }
        System.out.println(switch (roznica){
                case 0 -> "bardzo dobrze";
                case 1 -> "bardzo blisko";
                case 2 -> "blisko";
                default -> "slabo";
        });
        //zgadujemy 10 razy
        for (int i = 0; i < 10; i++) {
            System.out.println("podaj liczbe");
            wpisanaLiczba=klawiatura.nextInt();
            if(wpisanaLiczba==wylosowana){
                System.out.println("gratulacje wygrana");
                break;
            }
        }
        //zgadujemy do skutku
        System.out.println("podaj liczbe");
        wpisanaLiczba=klawiatura.nextInt();
        while(wylosowana!=wpisanaLiczba){
            if (wylosowana>wpisanaLiczba){
                System.out.println("wpisano za malo");
            }
            else {
                System.out.println("wpisano za duzo");
            }
            System.out.println("podaj liczbe");
            wpisanaLiczba=klawiatura.nextInt();
        }
        System.out.println("gratulacje wygrana");
   }
}