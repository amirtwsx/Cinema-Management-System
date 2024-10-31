package org.example.cinemamanagementsystemprojectassignment;

public class SystemConfig {
    private static SystemConfig instance;
    private String cinemaName;
    private int totalScreens;

    private SystemConfig() {
        cinemaName = "CineMax";
        totalScreens = 5;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public int getTotalScreens() {
        return totalScreens;
    }
}
