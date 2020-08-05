package com.example.session;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class CounterService {
    private int counter = 0;

    /**
     * Returns and increment counter;
     */
    public int getCounter() {
        return counter++;
    }
}
