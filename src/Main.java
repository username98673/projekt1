

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
   }
}