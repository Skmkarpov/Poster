import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    Poster poster1 = new Poster("PosterLink1", "The game", "Thriller", true);
    Poster poster2 = new Poster("PosterLink2", "Terminator", "Action", false);
    Poster poster3 = new Poster("PosterLink3", "Treasures of the nation", "Adventure", true);
    Poster poster4 = new Poster("PosterLink4", "Silent hill", "Horror", false);
    Poster poster5 = new Poster("PosterLink5", "Warrior", "Drama", true);
    Poster poster6 = new Poster("PosterLink6", "Dumb and Dumber", "Comedy", false);

    @Test
    public void addPosterTest() {

        PosterManager Poster = new PosterManager();
        Poster.addMovie(poster1);
        Poster.addMovie(poster3);
        Poster.addMovie(poster5);
        Poster[] actual = Poster.findAll();
        Poster[] expected = {poster1, poster3, poster5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {

        PosterManager Poster = new PosterManager(2);
        Poster.addMovie(poster1);
        Poster.addMovie(poster3);
        Poster.addMovie(poster5);
        Poster[] actual = Poster.findLast();
        Poster[] expected = {poster5, poster3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoreThanLimitTest() {

        PosterManager Poster = new PosterManager(5);
        Poster.addMovie(poster1);
        Poster.addMovie(poster2);
        Poster.addMovie(poster3);
        Poster.addMovie(poster4);
        Poster.addMovie(poster5);
        Poster.addMovie(poster6);
        Poster[] actual = Poster.findLast();
        Poster[] expected = {poster6, poster5, poster4, poster3, poster2};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLessThanLimitTest() {

        PosterManager Poster = new PosterManager(5);
        Poster.addMovie(poster1);
        Poster.addMovie(poster2);
        Poster.addMovie(poster3);
        Poster.addMovie(poster4);
        Poster[] actual = Poster.findLast();
        Poster[] expected = {poster4, poster3, poster2, poster1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastEqualLimitTest() {

        PosterManager Poster = new PosterManager(5);
        Poster.addMovie(poster1);
        Poster.addMovie(poster2);
        Poster.addMovie(poster3);
        Poster.addMovie(poster4);
        Poster.addMovie(poster5);
        Poster[] actual = Poster.findLast();
        Poster[] expected = {poster5, poster4, poster3, poster2, poster1};
        Assertions.assertArrayEquals(expected, actual);
    }

}