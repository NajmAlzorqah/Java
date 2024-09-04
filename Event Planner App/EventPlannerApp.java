package event.planner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Event {
    String name;
    LocalDate date;
    LocalTime time;

    Event(String name, LocalDate date, LocalTime time) {
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public String toString() {
        return name + " on " + date + " at " + time;
    }
}

public class EventPlannerApp {
    private static List<Event> events = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        while (true) {
            System.out.println("\nEvent Planner App");
            System.out.println("1. Add Event");
            System.out.println("2. View Upcoming Events");
            System.out.println("3. Event Countdown");
            System.out.println("4. Display Event in Different Time Zones");
            System.out.println("5. Calculate Age of an Event");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Event
                    System.out.print("Enter event name: ");
                    String name = input.nextLine();

                    System.out.print("Enter event date (dd-MM-yyyy): ");
                    String dateStr = input.nextLine();
                    LocalDate date = LocalDate.parse(dateStr, dateFormatter);

                    System.out.print("Enter event time (HH:mm): ");
                    String timeStr = input.nextLine();
                    LocalTime time = LocalTime.parse(timeStr, timeFormatter);

                    events.add(new Event(name, date, time));
                    System.out.println("Event added successfully!");
                    break;

                case 2:
                    // View Upcoming Events
                    System.out.println("Upcoming Events:");
                    LocalDate today = LocalDate.now();
                    for (Event event : events) {
                        if (event.date.isAfter(today) || event.date.equals(today)) {
                            Period period = Period.between(today, event.date);
                            System.out.println(event + " - "+period.getMonths() + " Months - " + period.getDays() + " Days remaining");
                        }
                    }
                    break;

                case 3:
                    // Event Countdown
                    System.out.print("Enter event name for countdown: ");
                    String eventName = input.nextLine();
                    Event countdownEvent = findEventByName(eventName);
                    if (countdownEvent != null) {
                        ZonedDateTime now = ZonedDateTime.now();
                        ZonedDateTime eventDateTime = ZonedDateTime.of(countdownEvent.date, countdownEvent.time, now.getZone());
                        Duration duration = Duration.between(now, eventDateTime);
                        System.out.println("Time remaining: " + duration.toHours() + " hours and " + duration.toMinutes() + " minutes");
                    } else {
                        System.out.println("Event not found.");
                    }
                    break;

                case 4:
                    // Display Event in Different Time Zones
                    System.out.print("Enter event name: ");
                    String timezoneEventName = input.nextLine();
                    Event timezoneEvent = findEventByName(timezoneEventName);
                    if (timezoneEvent != null) {
                        ZonedDateTime eventDateTime = ZonedDateTime.of(timezoneEvent.date, timezoneEvent.time, ZoneId.of("UTC+3"));
                        System.out.println("Event time in New York: " + eventDateTime.withZoneSameInstant(ZoneId.of("America/New_York")));
                        System.out.println("Event time in London: " + eventDateTime.withZoneSameInstant(ZoneId.of("Europe/London")));
                        System.out.println("Event time in Tokyo: " + eventDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo")));
                    } else {
                        System.out.println("Event not found.");
                    }
                    break;

                case 5:
                    // Calculate Age of an Event
                    System.out.print("Enter event name to calculate age: ");
                    String ageEventName = input.nextLine();
                    Event ageEvent = findEventByName(ageEventName);
                    if (ageEvent != null) {
                        Period period = Period.between(ageEvent.date, LocalDate.now());
                        System.out.println(ageEvent.name + " is " + period.getYears() + " years, " + period.getMonths() + " months, and " + period.getDays() + " days old.");
                    } else {
                        System.out.println("Event not found.");
                    }
                    break;

                case 6:
                    // Exit
                    System.out.println("Exiting...");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static Event findEventByName(String name) {
        for (Event event : events) {
            if (event.name.equalsIgnoreCase(name)) {
                return event;
            }
        }
        return null;
    }
}
