package com.microservices.jsonvalidatorapp.jsonvalidatorapplication.service;

import com.microservices.jsonvalidatorapp.jsonvalidatorapplication.dto.ChatRequest;

public interface GenAIService {

    String getResponse(ChatRequest request);
}
