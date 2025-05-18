package dev.rohitahuja;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("")
    public String generateJoke() {
        return chatClient.prompt()
                .user("Please tell me a good dad joke about computers.")
                .call()
                .content();
    }

}
