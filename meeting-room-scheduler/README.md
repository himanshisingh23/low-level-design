# Meeting Room Scheduler LLD in Java
Link : https://medium.com/@sumashreyatv/building-a-low-level-design-for-meeting-room-scheduler-2f461639d0db

# System Requirements

The **Meeting Room Scheduler** should:

- Handle multiple meeting rooms with defined capacities.
- Allow booking a meeting room for a specific time slot and number of participants.
- Notify participants about meetings and changes.
- Keep track of room availability and participants’ calendars.
- Support booking strategies (e.g., *First-Come, First-Serve*).
- Manage updates or cancellations of meetings.

---

# Key Design Considerations

## 1. Modular Entities

The system’s core entities include:

- **MeetingRoom:** Represents rooms with capacity and booking history.
- **Participant:** Holds participant details and their personal calendar.
- **Meeting:** Links participants, rooms, and time slots.
- **TimeSlot:** Represents a range of time with conflict checks.

---

## 2. Design Patterns

- **Observer Pattern:**  
  Used for participant notifications. The `Participant` class implements the `Observer` interface, and the `Meeting` class manages notifications.

- **Strategy Pattern:**  
  Allows flexible room selection strategies. We implement a `RoomSelectionStrategy` interface with concrete strategies like *First-Come First-Serve*.

---

## 3. Thread Safety

Concurrency is handled using **locks** for critical sections, ensuring consistent room availability and booking.
