package ElementoMultimediale.elementi;

import ElementoMultimediale.ElementoMultimediale;


public class Video extends ElementoMultimediale {
    private String titolo;
    private int durata;
    private int volume;
    private int luminosità;

    public Video(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = 5;
        this.luminosità = 5;
    }

    //setter
    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setVolume(char vol) {
        if(vol == '+')
            this.volume++;
        else if (vol == '-')
            this.volume--;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLuminosità(int lum) {
        this.luminosità = lum;
    }

    public void setLuminosità(char set) {
        if(set == '+'){
            this.luminosità++;
        } else if (set == '-') {
            this.luminosità--;
        }
    }

    //getter
    public String getTitolo() { return this.titolo; }
    public int getDurata() { return this.durata ; }
    public int getVolume() { return this.volume; }
    public int getLum() {return  this.luminosità; }

    // play

    public void play(){
        String vol = "";
        for(int i = 0; i < this.getVolume(); i++) {
             vol = vol + "!";
        };

        String lum = "";
        for (int i = 0; i < this.getLum(); i++) {
            lum = lum + "*";
        }

        for (int i = 0; i < this.getDurata(); i++) {
            System.out.println(getTitolo() + " " + vol + " " + lum );
        }
    }

}
