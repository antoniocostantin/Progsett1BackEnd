import ElementoMultimediale.ElementoMultimediale;
import ElementoMultimediale.elementi.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        /* ho deciso di creare gli oggetti dichiarando solo il loro titolo ela loro durata quando necessaria
        i primi due oggetti sono video il secondo paio sono audio e l'ultimo oggetto è un' immagine*/
        ElementoMultimediale[] arr = new ElementoMultimediale[5];
        for (int i = 0; i <= 4; i++) {
            int durata = 0;

            if (i != 4) {

            }
            if (i == 0 || i == 1) {
                System.out.println("inserisci il titolo del tuo video");
                String fileName = sc.nextLine();
                System.out.println("inserisci la durata del tuo video");
                durata = s.nextInt();
                ElementoMultimediale v = new Video(fileName, durata);
                arr[i] = v;
            } else if (i == 2 || i == 3) {
                System.out.println("inserisci il titolo del tuo audio");
                String fileName = sc.nextLine();
                System.out.println("inserisci la durata del tuo audio");
                durata = s.nextInt();
                arr[i] = new Audio(fileName, durata);
            } else {
                System.out.println("inserisci il titolo del tuo audio");
                String fileName = sc.nextLine();
                arr[i] = new Immagine(fileName);
            }
        }


        //ho scelto di settare il volume non durante la creazione degli oggetti ma prima del loro play()
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
                    switch (v) {
                        case '+':
                            p.aumentaVolume();
                            System.out.println("il volume è: " + p.getVolume());
                            break;
                        case '-':
                            p.diminuisciVolume();
                            System.out.println("il volume è: " + p.getVolume());
                            break;
                        default:
                            condition = false;
                            break;
                    }


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
                    char l = sc.next().charAt(0);
                    switch (l) {
                        case '+':
                            sh.aumentaLum();
                            System.out.println("la luminosità è: " + sh.getLum());
                            break;
                        case '-':
                            sh.diminuisciLum();
                            System.out.println("la luminosità è: " + sh.getLum());
                            break;
                        default:
                            condition = false;
                            break;
                    }

                }

            }
            e.play();
        }
    }

    ;
}