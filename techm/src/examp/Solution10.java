package examp;

import java.util.Scanner;

import techm.Moviee;

public interface Solution10 {
    public static double findAvgBudgetByDirector(Moviee[] movies, String director) {
	        int count = 0;
	        int totalBudget = 0;
	        for (Moviee movie : movies) {
	            if (movie.getDirector().equalsIgnoreCase(director)) {
	                totalBudget += movie.getBudget();
	                count++;
	            }
	        }
	        return count > 0 ? (double) totalBudget / count : 0;
	    }

	    public static Moviee getMovieByRatingBudget(Moviee[] movies, int rating, int budget) {
	        for (Moviee movie : movies) {
	            if (movie.getRating() == rating && movie.getBudget() == budget && budget % rating == 0) {
	                return movie;
	            }
	        }
	        return null;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Moviee[] movies = new Moviee[4];

	        for (int i = 0; i < 4; i++) {
	            int movieId = Integer.parseInt(scanner.nextLine());
	            String director = scanner.nextLine();
	            int rating = Integer.parseInt(scanner.nextLine());
	            int budget = Integer.parseInt(scanner.nextLine());
	            Moviee movie = new Moviee(movieId, director, rating, budget);
	            movies[i] = movie;
	        }

	        String director = scanner.nextLine();
	        int rating = Integer.parseInt(scanner.nextLine());
	        int budget = Integer.parseInt(scanner.nextLine());

	        double avgBudget = findAvgBudgetByDirector(movies, director);
	        if (avgBudget > 0) {
	            System.out.println((int) avgBudget);
	        } else {
	            System.out.println("Sorry - The given director has not yet directed any movie");
	        }

	        Moviee movie = getMovieByRatingBudget(movies, rating, budget);
	        if (movie != null) {
	            System.out.println(movie.getMovieId());
	        } else {
	            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");}}

}


