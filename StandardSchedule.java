package org.example.cinemamanagementsystemprojectassignment;
public class StandardSchedule implements MovieSchedule {
    private String movie;
    private String time;

    public StandardSchedule(String movie, String time) {
        this.movie = movie;
        this.time = time;
    }

    @Override
    public String getMovie() {
        return movie;
    }

    @Override
    public String getTime() {
        return time;
    }

    @Override
    public MovieSchedule clone() throws CloneNotSupportedException {
        return (MovieSchedule) super.clone();
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return movie + " at " + time;
    }
}

