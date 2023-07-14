package ru.zhukov.message.Service;

import ru.zhukov.message.Entity.Message;

import java.util.List;

public interface MessageService {
    public Message createMessage(Message message);
    public List<Message> getAllMessages();
}
