package com.alidade.repository;

import com.alidade.model.MessageBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageBoardRepository extends JpaRepository<MessageBoard, Long> {
}
