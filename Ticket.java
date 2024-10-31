package org.example.cinemamanagementsystemprojectassignment;

public class Ticket {
    private String movie;
    private String seat;
    private String snacks;

    private Ticket(TicketBuilder builder) {
        this.movie = builder.movie;
        this.seat = builder.seat;
        this.snacks = builder.snacks;
    }

    public static class TicketBuilder {
        private String movie;
        private String seat;
        private String snacks;

        public TicketBuilder(String movie) {
            this.movie = movie;
        }

        public TicketBuilder setSeat(String seat) {
            this.seat = seat;
            return this;
        }

        public TicketBuilder setSnacks(String snacks) {
            this.snacks = snacks;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }
}
