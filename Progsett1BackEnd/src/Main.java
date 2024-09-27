import ElementoMultimediale.ElementoMultimediale;
import ElementoMultimediale.elementi.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        ElementoMultimediale[] arr = new ElementoMultimediale[5];
        for (int i = 0; i <= 4; i++) {
            int durata = 0;
            System.out.println("inserisci il titolo del tuo file");
            String fileName = sc.nextLine();
            if (i != 4) {
                System.out.println("inserisci la durata del tuo file");

                durata = s.nextInt();
            }
            if (i == 0 || i == 1) {
                ElementoMultimediale v = new Video(fileName, durata);
                arr[i] = v;
            } else if (i == 2 || i == 3) arr[i] = new Audio(fileName, durata);
            else arr[i] = new Immagine(fileName);
        }


        while (true) {
            System.out.println("inserisci il numero del file al quale ti vuoi riferire ( 0 per interrompere )");
            int i = s.nextInt();
            if (i == 0) {
                System.out.println("FINE");
                break;
            }
            ElementoMultimediale e = arr[i - 1];
            if (e instanceof Playable) {
                System.out.println("Inserisci il volume ");
                int vol = s.nextInt();
                Playable p = (Playable) e;
                p.setVolume(vol);
                boolean condition = true;
                while (condition) {
                    System.out.println("se vuoi alzare o abbassare il volume inviare + o - (qualsiasi altro carattere per uscire)");
                    char v = sc.next().charAt(0);
                    switch (v){
                        case '+': p.aumentaVolume(); break;
                        case '-': p.aumentaVolume(); break;
                        default: condition = false; break;
                    }
                    System.out.println("la luminosità è: " + p.getVolume());

                }

            }

            if (e instanceof Showable) {
                System.out.println("Inserisci la luminosità ");
                int vol = s.nextInt();
                Showable sh = (Showable) e;
                sh.setLuminosità(vol);
                boolean condition = true;
                while (condition) {
                    System.out.println("se vuoi alzare o abbassare la luminosità inviare + o - (qualsiasi altro carattere per uscire)");
                    char l  = sc.next().charAt(0);
                    switch (l){
                        case '+': sh.aumentaLum(); break;
                        case '-': sh.diminuisciLum(); break;
                        default: condition = false; break;
                    }
                    System.out.println("la luminosità è: " + sh.getLum());
                }

            }
            e.play();
        }
    }

    ;
}