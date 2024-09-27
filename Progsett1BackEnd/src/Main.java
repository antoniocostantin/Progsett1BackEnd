import ElementoMultimediale.ElementoMultimediale;
import ElementoMultimediale.elementi.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        /* ho scelto di creare gli ogetti tramite il titolo e la loro durata quando necessario dato che si
        dovrebbe sapere in partenza la durata di un video o di un audio; il volume e luminosità li gestisco successivamente */
        ElementoMultimediale[] arr = new ElementoMultimediale[5];
        for (int i = 0; i <= 4; i++) {
            System.out.println("Invia 'a' per creare un audio, 'v' per video o 'i' per immagine");
            char tipo = sc.nextLine().charAt(0);
            int durata;
            String nome;
            switch (tipo) {
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
                if(vol >= 10 || vol < 0)
                    System.out.println("Il volume non è stato modificato doveva essere tra 0 e 10");
                else p.setVolume(vol);
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
                if(lum >= 10 || lum < 1)
                    System.out.println("La luminosità non è stato modificata doveva essere tra 0 e 10");
                else sh.setLuminosità(lum);
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