package com.microservices.jsonvalidatorapp.jsonvalidatorapplication.controller;


import com.microservices.jsonvalidatorapp.jsonvalidatorapplication.dto.ChatRequest;
import com.microservices.jsonvalidatorapp.jsonvalidatorapplication.dto.ChatResponse;
import com.microservices.jsonvalidatorapp.jsonvalidatorapplication.service.GenAIService;
import com.microservices.jsonvalidatorapp.jsonvalidatorapplication.service.GenAIServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "https://json-validation-ui-using-react-l0selo2bs-krushnnas-projects.vercel.app/api/chat", "https://json-validation-ui-using-react-l0selo2bs-krushnnas-projects.vercel.app/"})
@RequestMapping("/api/chat")
public class GenrativeConstructor {

    @Autowired
    private GenAIServiceImpl genAIService;
    @PostMapping
    public ChatResponse getChatRepsonse(@RequestBody ChatRequest request){

        return new ChatResponse(genAIService.getResponse(request));

    }
}
