package org.example.cinemamanagementsystemprojectassignment;

public interface MovieSchedule extends Cloneable {
    String getMovie();
    String getTime();
    MovieSchedule clone() throws CloneNotSupportedException;

    void setTime(String s);
}

