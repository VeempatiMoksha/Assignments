package examp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import techm.Movie;

public class Solution4 {

	    public static Movie[] getMovieByGenre(Movie[] movies, String searchGenre) {
	        List<Movie> result = new ArrayList<>();
	        for (Movie movie : movies) {
	            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
	                result.add(movie);
	            }
	        }
	        return result.toArray(new Movie[0]);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Movie[] movies = new Movie[4];

	        for (int i = 0; i < 4; i++) {
	            Movie movie = new Movie();
	            movie.setMovieName(scanner.nextLine());
	            movie.setCompany(scanner.nextLine());
	            movie.setGenre(scanner.nextLine());
	            movie.setBudget(Integer.parseInt(scanner.nextLine()));
	            movies[i] = movie;
	        }

	        String searchGenre = scanner.nextLine();
	        Movie[] filteredMovies = getMovieByGenre(movies, searchGenre);

	        for (Movie movie : filteredMovies) {
	            if (movie.getBudget() > 80000000) {
	                System.out.println("High Budget Movie");
	            } else {
	                System.out.println("Low Budget Movie");}}
	}}

	