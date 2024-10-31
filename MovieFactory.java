package org.example.cinemamanagementsystemprojectassignment;

public class MovieFactory {
    public Movie createMovie(String genre) {
        switch (genre) {
            case "Action":
                return new ActionMovie();
            case "Drama":
                return new DramaMovie();
            default:
                return null;
        }
    }
}
