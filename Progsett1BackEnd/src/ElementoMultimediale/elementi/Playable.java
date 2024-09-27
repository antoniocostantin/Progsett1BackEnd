package ElementoMultimediale.elementi;

public interface Playable {

    public void play();
    public void setVolume(int volume);
    public void setVolume(char vol);
    public void setLuminosità(char lum);
    public void setLuminosità(int lum);
    public int getVolume();
    public int getLum();
}
