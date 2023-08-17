package example5;

import java.util.ArrayList;

public class MyMovieReducer implements MovieReducer {

    @Override
    public Movie reduce(ArrayList<Movie> list) {
        Movie oldest = list.get(0);
        for (Movie current : list) {
            if (current.getYear() <= oldest.getYear()) {
                oldest = current;
            }
        }
        return oldest;
    }
}
