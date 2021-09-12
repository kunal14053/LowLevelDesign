package com.problems.multiThreadedKafka.public_interface;

import com.problems.multiThreadedKafka.model.Message;

public interface ISubscriber {

    String getId();
    void consume(Message message) throws InterruptedException;
}

