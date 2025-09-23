package basic.array;

/**
 * @author zhulx
 **/
public class MyArrayQueue<E> {
    private MyCycleArr<E> arr;

    public MyArrayQueue() {
        arr = new MyCycleArr<>();
    }

    public void push(E t) {
        arr.addFirst(t);
    }

    public E peekLast() {
        return arr.getLast();
    }

    public E peekFirst() {
        return arr.getFirst();
    }

    public int size() {
        return arr.size();
    }
}