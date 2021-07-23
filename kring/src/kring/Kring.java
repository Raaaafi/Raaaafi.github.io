package kring;

import java.util.*;

public class Kring {

    public static void main(String[] args) {
        
        
        Scanner kring = new Scanner(System.in); 
        int test = 0;
        int zaehler = 0;
             
        
        
        for(int i = 0; i<5; i++) {
                       
            zaehler = zaehler +1;
            System.out.println(zaehler + ". Versuch");
            
            System.out.println("Bitte Zahl eingeben: ");
            test = kring.nextInt();
            
            if(test == 123) {
                
                System.out.println("Code geknackt");
                       
                break;
            }  
            else {
                
                System.out.println("peinlich");
            }
        }
        if(zaehler == 5) {
            
            System.out.println("Zu viele Versuche");
        }
        else {
            
            System.out.println("Wie viel Geld willst du abheben?");
            test = kring.nextInt();
           
            System.out.println("Hier, deine " + test + "€");
        }

        /*
        
        Random kringinell = new Random();
        int test = kringinell.nextInt(6) + 1;

        if (test > 3) {

        System.out.println(test + " > 3");
        } else if (test < 3) {

        System.out.println(test + " < 3");
        } else if (test == 3) {

        System.out.println(test + " = 3");
        }
        
        double x = 1.123213123151235;
        int y = 1;
        double z = x+y;
        String kring = "test";
        
        System.out.println(kring);
              
        kring = "kringinell";
        
        System.out.println(kring);
        
        kring = "test";
        
        System.out.println(kring);
        
        
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        System.out.print("x, ");
        System.out.print("y, ");
        System.out.println("z");
         */
    }

}
