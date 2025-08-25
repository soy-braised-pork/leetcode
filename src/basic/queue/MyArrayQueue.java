package basic.queue;

import basic.array.MyCycleArr;

/**
 * @author zhulx
 **/
public class MyArrayQueue<E> {
    private MyCycleArr<E> arr;

    public MyArrayQueue() {
        arr = new MyCycleArr<>();
    }

//    public void push(E t) {
//        arr.addLast(t);
//    }
//
//    public E pop() {
//        return arr.removeFirst();
//    }

    public E peek() {
        return arr.getFirst();
    }

    public int size() {
        return arr.size();
    }
}
