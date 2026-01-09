package com.xworkz.eventapp;

import com.xworkz.eventapp.dto.EventDTO;
import com.xworkz.eventapp.service.EventService;
import com.xworkz.eventapp.service.impl.EventServiceImpl;
import com.xworkz.eventapp.util.EntityManagerFactoryImpl;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EventRunner {
    public static void main( String[] args ) {

        EventService eventService = new EventServiceImpl();

        System.out.println( "main started" );
        System.out.println();

        Scanner sc = new Scanner(System.in);
        boolean appRunning = true;

while(appRunning) {
    System.out.println("Select Choice from below");
    System.out.println("1. Add Event");
    System.out.println("2. Get Event Info By Id");
    System.out.println("3. Get Event Info By Name");
    System.out.println("4. Get Event Info By Location");
    System.out.println("5. Get Event Info By Timings");
    System.out.println("6. Get Event Info By Manager Name");
    System.out.println("7. Update Event Timings By Id");
    System.out.println("8. Delete Event By Id");
    System.out.println("9. Filter By Location");
    System.out.println("10. Get Events Details By Event Name");
    System.out.println("11. Get All Managers Name");
    System.out.println("12. Get Event Name by Manager Name");
    System.out.println("13. Get Location By Time");
    System.out.println("14. Get All Events");
    System.out.println("15. Update Event Manager by event name and event Time");
    System.out.println("16. update Event Time by Event Name");
    System.out.println("17. Delete By Event Name");
    System.out.println("18. Exit");
    System.out.println();
    System.out.print("Enter Choice : ");
    int ch = sc.nextInt();
    switch (ch){
        case 1 :  System.out.print("Enter event name : \n");sc.nextLine();
            String eventName = sc.nextLine();
            System.out.print("Enter event location : \n");
            String eventLocation = sc.nextLine();
            System.out.println("Enter even timings : \n");
            String eventTimings = sc.nextLine();
            System.out.println("Enter event manager name : \n");
            String eventManagerName = sc.nextLine();
            EventDTO eventDTO = new EventDTO(eventName, eventLocation, eventTimings, eventManagerName);

            boolean isValidatedAndSaved = eventService.validateAndSave(eventDTO);
            System.out.println("Is Validated and saved : " + isValidatedAndSaved);
            break;

        case 2 : System.out.println("Enter Event Id :");

            int eId = sc.nextInt();
            Optional<EventDTO> eventDTOOptional1 = eventService.getEventInfoById(eId);
            if (eventDTOOptional1.isPresent()){
                System.out.println("Event Info : ");
                System.out.println("Event Id : "+eventDTOOptional1.get().getEventId());
                System.out.println("Event Name : "+eventDTOOptional1.get().getEventName());
                System.out.println("Event Location : "+eventDTOOptional1.get().getEventLocation());
                System.out.println("Event Timings : "+eventDTOOptional1.get().getEventTimings());
                System.out.println("Event Manager Name : "+eventDTOOptional1.get().getEventManagerName());
                System.out.println("-------");
            }else System.out.println("Data not present");
            break;

        case 3 :
            System.out.println("Enter Event name :");
            sc.nextLine();
            String eName = sc.nextLine();
            Optional<EventDTO> eventDTOOptional = eventService.getEventInfoByName("Yashu");
            if (eventDTOOptional.isPresent()){
                System.out.println("Event Info : ");
                System.out.println("Event Id : "+eventDTOOptional.get().getEventId());
                System.out.println("Event Name : "+eventDTOOptional.get().getEventName());
                System.out.println("Event Location : "+eventDTOOptional.get().getEventLocation());
                System.out.println("Event Timings : "+eventDTOOptional.get().getEventTimings());
                System.out.println("Event Manager Name : "+eventDTOOptional.get().getEventManagerName());
                System.out.println("-------");
            }else System.out.println("Data not present");
            break;

        case 4 : System.out.println("Enter Event Location :");
            sc.nextLine();
            String eventLoc = sc.nextLine();
            Optional<EventDTO> eventDTOOptional2 = eventService.getEventInfoByLocation(eventLoc);
            if (eventDTOOptional2.isPresent()){
                System.out.println("Event Info : ");
                System.out.println("Event Id : "+ eventDTOOptional2.get().getEventId());
                System.out.println("Event Name : "+ eventDTOOptional2.get().getEventName());
                System.out.println("Event Location : "+ eventDTOOptional2.get().getEventLocation());
                System.out.println("Event Timings : "+ eventDTOOptional2.get().getEventTimings());
                System.out.println("Event Manager Name : "+ eventDTOOptional2.get().getEventManagerName());
                System.out.println("-------");
            }else System.out.println("Data not present");
            break;

        case 5 : System.out.println("Enter Event Timings :");
            sc.nextLine();
            String timings = sc.nextLine();
            Optional<EventDTO> eventDTOOptional3 = eventService.getEventInfoByTimings(timings);
            if (eventDTOOptional3.isPresent()){
                System.out.println("Event Info : ");
                System.out.println("Event Id : "+ eventDTOOptional3.get().getEventId());
                System.out.println("Event Name : "+ eventDTOOptional3.get().getEventName());
                System.out.println("Event Location : "+ eventDTOOptional3.get().getEventLocation());
                System.out.println("Event Timings : "+ eventDTOOptional3.get().getEventTimings());
                System.out.println("Event Manager Name : "+ eventDTOOptional3.get().getEventManagerName());
                System.out.println("-------");
            }else System.out.println("Data not present");
            break;


        case 6 : System.out.println("Enter Event Manager Name :");
            sc.nextLine();
            String managerName = sc.nextLine();
            Optional<EventDTO> eventDTOOptional4 = eventService.getEventInfoByManagerName(managerName);
            if (eventDTOOptional4.isPresent()){
                System.out.println("Event Info : ");
                System.out.println("Event Id : "+ eventDTOOptional4.get().getEventId());
                System.out.println("Event Name : "+ eventDTOOptional4.get().getEventName());
                System.out.println("Event Location : "+ eventDTOOptional4.get().getEventLocation());
                System.out.println("Event Timings : "+ eventDTOOptional4.get().getEventTimings());
                System.out.println("Event Manager Name : "+ eventDTOOptional4.get().getEventManagerName());
                System.out.println("-------");
            }else System.out.println("Data not present");
            break;

        case 7 :
            System.out.println("Enter the Event Id : ");
            int id = sc.nextInt();
            System.out.println("Enter the updated Timings : ");sc.nextLine();
            String updatedTimings = sc.nextLine();
            boolean isUpdated = eventService.validateAndUpdateTimingsById(id,updatedTimings);
            System.out.println("Is Event Updated : "+isUpdated);
            break;

        case 8 :
            System.out.println("Enter the Id to delete : ");
            int id1 = sc.nextInt();
            boolean isDeleted = eventService.deleteById(id1);
            System.out.println("Is Event Deleted : "+ isDeleted);
            break;

        case 9 :
            System.out.println("Enter location to filter events : ");
            sc.nextLine();
            String loc = sc.nextLine();
            List<EventDTO> eventDTOS = eventService.getEventsInfoByLocation(loc);
            eventDTOS.stream().forEach(event-> System.out.println(event));
            break;

        case 10 :
            System.out.println("Enter event name to get Details : ");
            sc.nextLine();
            String eventName1 = sc.nextLine();
            Object[] event = eventService.getEventsInfoByEventName(eventName1);
            if (event!=null) {
                System.out.println("Events Info : ");
                System.out.println("Event Location : " + event[0]);
                System.out.println("Event Manager Name : " + event[1]);
                System.out.println("-----");
            }else System.err.println("Data not found");
            break;

        case 11 :
            List<String> managersList = eventService.getAllManagersName();
            System.out.println("Managers List : ");
            managersList.stream().forEach(manager-> {
                System.out.println(manager);
            });
            System.out.println("---------");
            break;

        case 12 :
            System.out.println("Enter manager name to get Event name: ");sc.nextLine();
            String managerName1=sc.nextLine();
            String eventName2 = eventService.getEventNameByManagerName(managerName1);
            if (eventName2!=null) System.out.println("Event Name Organized by the manager "+managerName1+" :" +eventName2);
            else System.err.println("Manager Not found");
            break;

        case 13 :
            System.out.println("Enter timings to get location : ");sc.nextLine();
            String timings1=sc.nextLine();
            String location = eventService.getLocationByTimings(timings1);
            if (location!=null) System.out.println("Event Location held at timings "+timings1+" is : "+location);
            else System.err.println("Manager Not found");
            break;

        case 14 :
            List<EventDTO> eventDTOList = eventService.getAllEventsList();
            System.out.println("Events List : ");
            eventDTOList.stream().forEach(eventDTO1-> {
                System.out.println(eventDTO1);
            });
            System.out.println("---------");
            break;

        case 15 :
            System.out.print("Enter event name : ");sc.nextLine();
            String eName1= sc.nextLine();
            System.out.print("Enter event time : ");
            String eTime=sc.nextLine();
            System.out.print("Enter updated manager Name : ");
            String updatedManagerName=sc.nextLine();
            boolean isUpdated1 = eventService.updateEventManagerNameByEventNameAndEventTime(eName1,eTime,updatedManagerName);
            System.out.println("Is Manager Name updated? : "+isUpdated1);
            break;


        case 16:
            System.out.print("Enter event name : ");sc.nextLine();
            String eName2 = sc.nextLine();
            System.out.print("Enter updated event time : ");
            String updatedEventTime=sc.nextLine();

            boolean isUpdated2 = eventService.updateEventTimeByEventName(eName2,updatedEventTime);
            System.out.println("Is Event Time updated? : "+isUpdated2);
            break;

        case 17:
            System.out.println("Enter the event name to delete"); sc.nextLine();
            String eventName3=sc.nextLine();
            boolean isDeleted1 = eventService.deleteEventByEventName(eventName3);
            System.out.println("Is Event Deleted? : "+isDeleted1);
            break;

        case 18 : appRunning=false;
            EntityManagerFactoryImpl.close();
            System.out.println("App Stopped");
            break;

        default:
            System.out.println("Invalid choice");
    }
}
        System.out.println();
        System.out.println( "main ended" );
    }
}
