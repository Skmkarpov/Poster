public class PosterManager {

    private Poster[] ArrayPoster = new Poster[0];
    private int countOut = 10;


    public PosterManager() {
    }

    public PosterManager(int Count) {
        if (Count > 0) {
            this.countOut = Count;
        }
    }

    public void addMovie(Poster item) {
        Poster[] temp = new Poster[ArrayPoster.length + 1];
        System.arraycopy(ArrayPoster, 0, temp, 0, ArrayPoster.length);
        temp[temp.length - 1] = item;
        ArrayPoster = temp;
    }

    public Poster[] findAll() {
        return ArrayPoster;

    }

    public Poster[] findLast() {

        int CountOut = 0;
        if (ArrayPoster.length < countOut) {
            CountOut = ArrayPoster.length;
        } else {
            CountOut = countOut;
        }
        Poster[] temp = new Poster[CountOut];
        for (int i = 0; i < CountOut; i++) {
            temp[i] = ArrayPoster[ArrayPoster.length - 1 - i];
        }
        return temp;
    }
}