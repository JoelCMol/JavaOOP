package example4;

import java.util.ArrayList;

public class DemoInterface {
    public static void main(String[] args) {
        //this list will hold anything that implements ComparableYear ex. Car, Movie
        ArrayList<ComparableYear> list = new ArrayList<>();

        list.add(new Car(2010, "Toyota", "Corolla", 100_000, 2012));
        list.add(new Car(1994, "Honda", "Civic", 20_000, 2018));
        list.add(new Car(2015, "Ford", "F-150", 50_000, 2015));
        list.add(new Car(2018, "Nissan", "Sentra", 15_000, 2020));
        list.add(new Car(2019, "Tesla", "Model S", 99_000, 2020));

        list.add(new Movie("Casino", 1995, "Crime"));
        list.add(new Movie("Back to the Future", 1985, "Sci Fi"));
        list.add(new Movie("Star Wars", 1977, "Sci Fi"));
        list.add(new Movie("The Godfather", 1972, "Crime"));
        list.add(new Movie("Toy Story", 1995, "Animation"));

        ComparableYear oldest = list.get(0);
        for (ComparableYear current : list) {
            if (current.getYear() < oldest.getYear()) {
                oldest = current;
            }
        }

        System.out.println(oldest);
    }
}
