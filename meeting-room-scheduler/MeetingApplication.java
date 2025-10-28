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
        this.name = name;/
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
class Meeting{
    String meetingId;
    String title;
    List<Participant> participants;
    TimeSlot timeSlot;

    public Meeting (String meetingId, String title, List<Participant> participants, TimeSlot timeSlot){
        this.meetingId = meetingId;
        this.title = title;
        this.participants = participants;
        this.timeSlot = timeSlot;
    }

    public addParticipant(Participant participant){
        this.participants.add(participant);
    }

    public removeParticipant(Participant participant){
        this.participants.remove(participant);        
    }
    
    public notifyParticipant(String message){
        for(Participant participant: participants){
            participant.update(message);
        }
    }

}

// MeetingRoom 

// TimeSlot

// Calendar

// Location


