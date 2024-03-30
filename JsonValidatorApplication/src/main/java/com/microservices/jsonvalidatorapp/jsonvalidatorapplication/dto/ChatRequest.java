package com.microservices.jsonvalidatorapp.jsonvalidatorapplication.dto;

public record ChatRequest(String question) {

    // Factory method to create ChatRequest instances with modified question
    public static ChatRequest withAppendedString(String question) {
        String modifiedQuestion = "is it correct json if correct then just reply yes or if its not correct then reply with just  'no' word  then correct json on next line and mistake in next lines " + question+ " ";
        return new ChatRequest(modifiedQuestion);
    }
}
