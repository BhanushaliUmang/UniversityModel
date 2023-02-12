package com.example.universityeventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.universityeventmanagement.model.Event;
import com.example.universityeventmanagement.service.EventService;

@RestController
@RequestMapping("/api/v1")
public class EventController {
    @Autowired
	private EventService eventService;  

    @PostMapping("add-Event")
	 public void addRestaurant(Event EventDetails) {
		 
        EventService.addUser(EventDetails);
	}

    @PutMapping("update-Event/{id}")
    public void update(@PathVariable int Eventid, @RequestBody Event user) {
        EventService.updateById(Eventid,user);
    }

    @DeleteMapping("/delete/{EventId}")
	    public void delete(@PathVariable int EventId) {
            EventService.deleteById(EventId);
	}
    @GetMapping("/find-event/EventId/{id}")
	public Event findEvent(@PathVariable int id) {
		return EventService.findStudent(id);
		
	}
}
