package ru.zhukov.message.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.zhukov.message.Entity.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {
}
