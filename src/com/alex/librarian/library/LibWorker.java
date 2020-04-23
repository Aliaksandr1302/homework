package com.alex.librarian.library;

import com.alex.librarian.base.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibWorker {
    private final Map<BaseAction, List<EventListener>> listeners = new HashMap<>();

    public LibWorker(){
        BaseAction[] actions = BaseAction.values();
        for(BaseAction action : actions){
            listeners.put(action, new ArrayList<>());
        }
    }

    public void fireEvent(BaseAction action){
       List<EventListener> events = listeners.get(action);
        for(EventListener event : events){
            event.update();
        }
    }

    public void addHandler(BaseAction action, EventListener eventListener){
        List<EventListener> events = listeners.get(action);
        events.add(eventListener);
    }

}
