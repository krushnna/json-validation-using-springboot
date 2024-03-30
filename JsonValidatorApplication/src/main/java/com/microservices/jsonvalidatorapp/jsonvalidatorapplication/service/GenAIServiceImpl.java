package com.microservices.jsonvalidatorapp.jsonvalidatorapplication.service;

import com.microservices.jsonvalidatorapp.jsonvalidatorapplication.dto.ChatRequest;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class GenAIServiceImpl implements GenAIService{
    @Override
    public String getResponse(ChatRequest request) {
        var modifiedRequest = ChatRequest.withAppendedString(request.question());

        var model =OpenAiChatModel.builder()
                .apiKey("demo")
                .modelName(OpenAiChatModelName.GPT_3_5_TURBO)
                .build();

     String res =  model.generate(modifiedRequest.question());
        if (res.toLowerCase().contains("yes")) {
            return "Yes";
        }

        String[] lines = res.split("\\r?\\n");
        String re =  re = "Correct JSON = " + lines[1] + "Reason =" + lines[2];
        return re;

    }
}
