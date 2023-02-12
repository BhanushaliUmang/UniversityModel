package com.example.universityeventmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.universityeventmanagement.model.Event;



@Service
public class EventService {
    
    private static final  List<Event> events=new ArrayList<>();
        private static int id=0;
        
        static {
            Event s1=new Event(++id,"Robowar","Electrical Department","12/2/2023","11.00","14.00");
            events.add(s1);
            Event s2=new Event(++id,"Marketing","Chemical Department","12/2/2023","12.00","16.00");
            events.add(s2);
            Event s3=new Event(++id,"Short film making","Biological Department","13/2/2023","10.00","17.00");
            events.add(s3);
            Event s4=new Event(++id,"Esports","Instrumentation Department","13/2/2023","16.00","18.00");
            events.add(s4);
            Event s5=new Event(++id,"IT Quiz","IT Department","14/2/2023","10.00","14.00");
            events.add(s5);
            Event s6=new Event(++id,"Debate","Civil Department","14/2/2023","14.00","17.00");
            events.add(s6);
        
            
        }

        public static void deleteById(int eventId) {
			events.remove(eventId);
			
		}
        public static void addUser(Event eventDetails) {
		    events.add(eventDetails);
			
		}
        public static void updateById(int eventId, Event event1) {
		
			Event userUpdate=findStudent(eventId);

			userUpdate.setEventName(event1.getEventName());
			userUpdate.setLocation(event1.getLocation());
			userUpdate.setDate(event1.getDate());
			userUpdate.setStarttime(event1.getStarttime());
            userUpdate.setEndtime(event1.getEndtime());
			
		}
        public static Event findStudent(int EventId) {
            for(Event event : events) {
                if(event.getEventId()==EventId) {
                    return event;
                }
            }
            return null;
        }
}
