package ElementoMultimediale.elementi;

import ElementoMultimediale.ElementoMultimediale;

public class Audio extends ElementoMultimediale {
    private String titolo;
    private int durata;
    private int volume;

    public Audio(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = 5;
    }

    // setter

    public void setVolume(char vol) {
        if(vol == '+')
            this.volume++;
        else if (vol == '-')
            this.volume--;
    }

    public void setVolume(int vol) {
        this.volume = volume;
    }

    @Override
    public void setLuminosità(char lum) {
        System.out.println("no luminosità in Audio");
    }

    public void setLuminosità(int lum) {
        System.out.println("no luminosità in Audio");
    }

    // getter
    public int getDurata() {
        return durata;
    }

    @Override
    public int getLum() {
        System.out.println("no luminosità in Audio");
        return 0;
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
        for(int i = 0; i < this.getVolume(); i++) {
            vol = vol + "!";
        };


        for (int i = 0; i < this.getDurata(); i++) {
            System.out.println(getTitolo() + " " + vol );
        }
    }
}
