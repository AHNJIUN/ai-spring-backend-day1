package com.sesac.ai_backend.service;

import com.sesac.ai_backend.util.MessageFormatter;
import com.sesac.ai_backend.util.MessageFormatter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingService {

    private final MessageFormatter formatter;

    public String hello(String name){
        return formatter.format(name);
    }
}
