package week3;

public class Movie {

    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getStudio() {
        return studio;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    public static Movie[] getPG(Movie[] movies) {
        Movie[] pgMovies = new Movie[movies.length];
        int index = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating().equals("PG")) {
                pgMovies[index] = movies[i];
                index++;
            }
        }
        return pgMovies;
    }

    public static Movie[] getPG13(Movie[] movies) {
        Movie[] pg13Movies = new Movie[movies.length];
        int index = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating().equals("PG-13")) {
                pg13Movies[index] = movies[i];
                index++;
            }
        }
        return pg13Movies;
    } 

    public static Movie[] getG(Movie[] movies) {
        Movie[] gMovies = new Movie[movies.length];
        int index = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating().equals("G")) {
                gMovies[index] = movies[i];
                index++;
            }
        }
        return gMovies;
    }

    public static Movie[] getR(Movie[] movies) {
        Movie[] rMovies = new Movie[movies.length];
        int index = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating().equals("R")) {
                rMovies[index] = movies[i];
                index++;
            }
        }
        return rMovies;
    }

    public static Movie[] getNR(Movie[] movies) {
        Movie[] nrMovies = new Movie[movies.length];
        int index = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating().equals("NR")) {
                nrMovies[index] = movies[i];
                index++;
            }
        }
        return nrMovies;
    }

    @Override
    public String toString() {
        return "Movie{"
                + "title='" + title + '\''
                + ", studio='" + studio + '\''
                + ", rating='" + rating + '\''
                + '}';
    }

}
