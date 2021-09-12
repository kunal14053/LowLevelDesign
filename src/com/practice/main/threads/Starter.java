package com.practice.main.threads;

public class Starter {

    //ConcurrentHashMap
    //Thread safe without having to synchronize the whole map Very fast reads while write is done with a lock No locking at the object level Uses multitude of locks.

    //SynchronizedHashMap
    //Object level synchronization Both read and writes acquire a lock Locking the collection has a performance drawback May cause contention

    //Vector
    //HashTable
    //CopyOnWriteArrayList
    //CopyOnWriteArraySet
    //Stack

    public static void main(String[] args) {
        Task1 one  = new Task1();
        Task2 t2 = new Task2();
        Thread t1 = new Thread(one);
        t1.start();
        t2.start();
    }
}
