package com.example.session;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.io.Serializable;

@Service
@SessionScope
public class CounterService implements Serializable {
    private int counter = 0;

    /**
     * Returns and increment counter;
     */
    public int getCounter() {
        return counter++;
    }
}
