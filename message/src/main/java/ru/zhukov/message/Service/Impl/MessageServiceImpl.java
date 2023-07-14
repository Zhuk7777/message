package ru.zhukov.message.Service.Impl;

import org.springframework.stereotype.Service;
import ru.zhukov.message.Entity.Message;
import ru.zhukov.message.Repository.MessageRepository;
import ru.zhukov.message.Service.MessageService;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }
}