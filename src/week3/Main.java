package week3;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountID("12345");
        account.setBalance(1000);
        account.deposit(100);
        account.withdraw(50);

        System.out.println("**************************************************");
        Holiday h1 = new Holiday("Coptic Christmas", 7, "January");
        Holiday h2 = new Holiday("Revolution/Police Day", 25, "January");
        Holiday h3 = new Holiday("Sinai Liberation Day", 25, "April");
        Holiday h4 = new Holiday("Labor Day", 1, "May");
        Holiday h5 = new Holiday("June 30 Revolution", 30, "June");
        Holiday h6 = new Holiday("July 23 Revolution", 23, "July");
        Holiday h7 = new Holiday("Armed Forces Day (October War Victory)", 6, "October");

        Holiday[] holidays = {h1, h2, h3, h4, h5, h6, h7};
        System.out.println("holidays average date: " + Holiday.avgDate(holidays));
        System.out.println("**************************************************");
        Movie[] movies = {
            new Movie("Inception", "Warner Bros", "PG-13"),
            new Movie("Finding Nemo", "Pixar", "G"),
            new Movie("The Dark Knight", "Warner Bros", "PG"),
            new Movie("Joker", "Warner Bros", "R"),
            new Movie("Unknown Title", "Indie Studio", "NR"),
            new Movie("Avengers", "Marvel")
        };

        System.out.println("Movies with PG rating:");
        for (Movie movie : Movie.getPG(movies)) {
            System.out.println(movie);
        }
        System.out.println("***************************");

        System.out.println("Movies with PG-13 rating:");
        for (Movie movie : Movie.getPG13(movies)) {
            System.out.println(movie);
        }
        System.out.println("***************************");

        System.out.println("Movies with G rating:");
        for (Movie movie : Movie.getG(movies)) {
            System.out.println(movie);
        }
        System.out.println("***************************");

        System.out.println("Movies with R rating:");
        for (Movie movie : Movie.getR(movies)) {
            System.out.println(movie);
        }
        System.out.println("***************************");
    
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");
        System.out.println(casinoRoyale);
    }
}
