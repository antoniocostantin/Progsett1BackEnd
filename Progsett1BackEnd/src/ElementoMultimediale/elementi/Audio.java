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
        this.volume = vol;
    }

    @Override
    public void aumentaVolume() {
        int vol = this.volume;
        if (vol + 1 > 10) {
            System.out.println("Il volume deve essere compreso tra 0 e 10");
        } else this.volume++;

    }

    @Override
    public void diminuisciVolume() {
        int vol = this.volume;
        if (vol - 1 <= 0) {
            System.out.println("Il volume deve essere compreso tra 0 e 10");
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


        for (int i = 0; i < this.getDurata(); i++) {
            System.out.println(getTitolo() + vol);
        }
    }
}
