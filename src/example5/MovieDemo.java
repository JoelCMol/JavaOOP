package example5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieDemo {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Movie> movies = loadAllMovies();

        for (Movie m : movies) {
            //System.out.println(m);
        }

        //this is a lambda expression
        //thi ssyntax is unlocked when you have a functional interface
        //a functional interface is an interface with only one method
        //a interface is a class where all the methods need an implementation
        //METHOD 1: LAMBDA EXPRESSIONS
        MovieReducer r = list -> {
            Movie oldest = list.get(0);
            for (Movie current : list) {
                if (current.getYear() <= oldest.getYear()) {
                    oldest = current;
                }
            }
            return oldest;
        };
        //METHOD 2: TRADITIONAL IMPLEMENTS KEYWORD
        //MovieReducer r = new MyMovieReducer();
        //r.reduce(movies);

        //METHOD 3: ANONYMOUS INEER CLASSES
        MovieReducer other = new MovieReducer() {
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
        };

        Movie old = r.reduce(movies);
        System.out.println("The oldest movie is: " + old);
    }

    public static ArrayList<Movie> loadAllMovies() throws FileNotFoundException {
        File f = new File("movie_list.txt");
        Scanner inputFile = new Scanner(f);
        ArrayList<Movie> result = new ArrayList<>();
        while (inputFile.hasNextLine()) {
            String name = inputFile.nextLine();
            int year = inputFile.nextInt();
            //skip new line
            inputFile.nextLine();
            String genre = inputFile.nextLine();
            Movie m = new Movie(name, year, genre);
            result.add(m);
        }
        return result;
    }
}
