import ElementoMultimediale.ElementoMultimediale;
import ElementoMultimediale.elementi.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        //ho scelto di poter dare la possibilità dare all'utente di scegliere quanti file creare

        System.out.println("Quanti file vuoi creare??");
        int n = s.nextInt();
        /* ho scelto di creare gli ogetti tramite il titolo e la loro durata quando necessario dato che si
        dovrebbe sapere in partenza la durata di un video o di un audio; il volume e luminosità li gestisco successivamente */
        ElementoMultimediale[] arr = new ElementoMultimediale[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Invia 'a' per creare un audio, 'v' per video o 'i' per immagine");
            char tipo = sc.nextLine().charAt(0);
            tipo = Character.toLowerCase(tipo);
            int durata;
            String nome;
            switch ((tipo)) {
                case 'v':
                    System.out.println("inserisci il titolo del tuo video");
                    nome = sc.nextLine();
                    System.out.println("inserisci la durata del tuo video");
                    durata = s.nextInt();
                    ElementoMultimediale v = new Video(nome, durata);
                    arr[i] = v;
                    break;
                case 'a':
                    System.out.println("inserisci il titolo del tuo audio");
                    nome = sc.nextLine();
                    System.out.println("inserisci la durata del tuo audio");
                    durata = s.nextInt();
                    arr[i] = new Audio(nome, durata);
                    break;
                case 'i':
                    System.out.println("inserisci il titolo del tuo audio");
                    nome = sc.nextLine();
                    arr[i] = new Immagine(nome);
                    break;
                default: break;
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
                System.out.println("Inserisci il volume da 0 a 10");
                Playable p = (Playable) e;
                int vol = s.nextInt();
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
                System.out.println("Inserisci la luminosità da 1 a 10");
                int lum = s.nextInt();
                Showable sh = (Showable) e;
                sh.setLuminosità(lum);
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