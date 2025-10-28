interface Observer{
    public void update (String message);
}

// Participant
Class Participant implements Observer {
    String name;
    String email;
    String mobile;
    Calendar calendar;

    public Participant (String name, String email, String mobile){
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
class MeetingRoom {
    String roomId;
    Meeting meeting;
    int capacity;
    Calendar calendar;
    Location location;

    public MeetingRoom(String roomId, int capacity, Location location){
        this.roomId = "\{roomId}_\{location.floorId}_\{location.buildingId}";
        this.capacity = capacity;
        this.location = location;
        this.calendar = new Calendar();
    }

    public isAvailable(TimeSlot timeSlot){
        return this.calendar.isAvailable(timeSlot);
    }
}

// TimeSlot
class TimeSlot {
    int startTime; 
    int endTime;

    public TimeSlot(int startTime, int endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean isOverlapping (TimeSlot slot, TimeSlot newSlot){
        if((slot.startTime <= newSlot.startTime && slot.endTime <= newSlot.startTime) || 
        (slot.startTime >= newSlot.endTime && slot.endTime >= newSlot.endTime)){
            return true;
        }
        return false;
    }
}

// Calendar
class Calendar {
    List<TimeSlot>bookings;

    public Calendar (){
        this.bookings = new ArrayList<>();
    }

    public void addTimeSlot (TimeSlot timeSlot){
        this.bookings.add(timeSlot);
    }

    public void removeTimeSlot(TimeSlot timeSlot){
        this.bookings.remove(timeSlot);
    }

    public boolean isAvailable (){
        if(bookings.size()==0)return true;
        for(TimeSlot booking : this.bookings){
            if(slot.isOverlapping(slot, booking)){
                return true;
            }
        }
        return false;
    }
}

// Location
class Location{
    int floorId;
    int buildingId;

    public Location (int floorId, int buildingId){
        this.floorId = floorId;
        this.buildingId = buildingId;
    }
}

