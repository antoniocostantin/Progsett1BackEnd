package ElementoMultimediale.elementi;

import ElementoMultimediale.ElementoMultimediale;

public class Audio extends ElementoMultimediale implements Playable {
    private String titolo;
    private int durata;
    private int volume;

    public Audio(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = 5;
    }

    // setter

    public void setVolume(int vol) {
        if (vol > 10) {
            this.volume = 10;
            System.out.println("IL VOLUME PUO' ESSERE MASSIMO 10(te l'ho messo io ;))!!!");
        } else if (vol <= 0) {
            this.volume = 0;
            System.out.println("il volume può essere minimo 0(te l'ho messo io ;)!!!");
        } else if (vol > 0 || vol > 10) {
            this.volume = vol;
            System.out.println("il volume è al: " + this.volume);
        }

    }

    // diminuisci e aumenta
    @Override
    public void aumentaVolume() {
        int vol = this.volume;
        if (vol + 1 > 10) {
            System.out.println("IL VOLUME E' GIA' AL MASSIMOOO!!!!");
        } else this.volume++;

    }

    @Override
    public void diminuisciVolume() {
        int vol = this.volume;
        if (vol - 1 < 0) {
            System.out.println("Il volume è già al minimooo...");
        } else this.volume--;
    }

    // getter
    public int getDurata() {
        return durata;
    }


    public String getTitolo() {
        return this.titolo;
    }

    public int getVolume() {
        return this.volume;
    }

    //play

    @Override
    public void play() {
        String vol = "";
        for (int i = 0; i < this.getVolume(); i++) {
            vol = vol + "!";
        }
        ;

        System.out.println("Il tuo audio:");
        for (int i = 0; i < this.getDurata(); i++) {
            System.out.println(getTitolo() + vol);
        }
    }
}
