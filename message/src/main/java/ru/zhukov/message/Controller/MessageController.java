package ru.zhukov.message.Controller;

import org.springframework.web.bind.annotation.*;
import ru.zhukov.message.Entity.Message;
import ru.zhukov.message.Service.MessageService;

import java.util.List;

@RestController
public class MessageController {
    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/export")
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    @PostMapping("/message")
    public Message createMessage(@RequestBody Message message) {
        return messageService.createMessage(message);
    }


}
