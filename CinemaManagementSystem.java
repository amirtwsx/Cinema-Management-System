package org.example.cinemamanagementsystemprojectassignment;
public class CinemaManagementSystem {
    public static void main(String[] args) {
        SystemConfig config = SystemConfig.getInstance();
        System.out.println("Cinema Name: " + config.getCinemaName());
        System.out.println("Total Screens: " + config.getTotalScreens());

        MovieFactory movieFactory = new MovieFactory();
        Movie actionMovie = movieFactory.createMovie("Action");
        System.out.println("Created Movie Genre: " + actionMovie.getGenre());

        UIFactory uiFactory = new DesktopUIFactory();
        Button button = uiFactory.createButton();
        button.display();

        Ticket ticket = new Ticket.TicketBuilder("Action Movie")
                .setSeat("A12")
                .setSnacks("Popcorn")
                .build();
        System.out.println("Ticket booked for: " + ticket);

        MovieSchedule originalSchedule = new StandardSchedule("Action Movie", "12:00 PM");
        System.out.println("Original Schedule: " + originalSchedule);

        try {
            MovieSchedule clonedSchedule = originalSchedule.clone();
            clonedSchedule.setTime("3:00 PM");
            System.out.println("Cloned Schedule: " + clonedSchedule);
            System.out.println("After Cloning, Original Schedule: " + originalSchedule); 
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

