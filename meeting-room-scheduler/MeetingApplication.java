interface Observer{
    public void update (String message);
}

// Participant
Class Participant implements Observer {
    String name;
    String email;
    String mobile;
    Calendar calendar;

    public Participant (String name, String email, String mobile, Calendar calendar){
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.calendar = new Calendar();
    }

    @Override
    public void update (String message){
        System.out.println("Email sent to \{this.email}: \{this.message}.");
    }
}

// Meeting

// MeetingRoom

// TimeSlot

// Calendar

// Location


