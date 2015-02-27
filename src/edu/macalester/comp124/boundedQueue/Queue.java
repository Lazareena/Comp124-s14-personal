package edu.macalester.comp124.boundedQueue;

/**
 * Created by Reena on 4/7/14.
 */
public class Queue {
    String names[];
    private int front;
    private int currentSize;

    public Queue(int capacity){
        names = new String[capacity];
        currentSize = 0;
        front = 0;
    }

    public boolean enqueue(String a) {
        if (currentSize == names.length) {
            return false;
        }
        int dest= (front + currentSize) % names.length;
        names[dest] = a;
        currentSize++;
        return true;

    }


  public String deque() {
      if (currentSize == 0) {
          return null;
      }
      String result = names[front % names.length];
      names[front % names.length] = null;
      currentSize--;
      front++;

      return result;
  }
}