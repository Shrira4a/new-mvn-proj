package abs;

//100% AN ABSTRACT CLASS
public interface Playable {

    //PUBLIC ABSTRACT BY DEFAULT
    void play();
    void play(int numberOfSong);
    public abstract void stop();

    //BY DEFAULT FIELD IS PUBLIC AND STATIC, FINAL (CONSTANT)
    double PI=3.14;

    public static final double x=0.99;

}
