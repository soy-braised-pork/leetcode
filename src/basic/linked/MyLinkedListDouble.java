package basic.linked;

/**
 * @author zhulx
 * 双链表
 **/
public class MyLinkedListDouble<E> {
    // 虚拟头尾节点
    final private Node<E> head, tail;
    private int size;



    // 双链表节点
    private static class Node<E> {
        E val;
        Node<E> next;
        Node<E> prev;

        Node(E val) {
            this.val = val;
        }
    }


    // 构造函数初始化虚拟头尾节点
    public MyLinkedListDouble() {
        this.head = new Node<E>(null);
        this.tail = new Node<E>(null);
        head.next = tail;
        tail.prev = head;
        this.size = 0;
    }


    // 增
    public void addLast(E e) {
        Node<E> x = new Node<>(e);
        Node<E> temp = tail.prev;
        temp.next = x;
        x.prev = temp;
        x.next=tail;
        tail.prev = x;
        size++;
    }

    public void addFirst(E e) {
        Node<E> x = new Node<>(e);
        Node<E> temp = head.next;
        temp.prev = x;
        x.next = temp;

        head.next = x;
        x.prev = head;
        size++;
    }

    public void add(int index, E element) {
        checkPositionIndex(index);
        if (index == size) {
            addLast(element);
            return;
        }

        Node<E> p = getNode(index);
        Node<E> temp = p.prev;

        // 新要插入的 Noed
        Node<E> x = new Node<>(element);
        temp.prev = x;
        x.next = temp;

        x.prev = temp;
        x.next = p;

        size++;
    }

    // 其他工具函数
    public Node<E> getNode(int index) {
        checkElementIndex(index);
        Node<E> p = head.next;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p;
    }

    // 检查索引位置
    private boolean isElementIndex(int index){
        return index >= 0 && index < size;
    }

    private boolean isPositionIndex(int index){
        return index >= 0 && index <= size;
    }

    // 检查 index 索引位置是否可以存在元素
    private void checkElementIndex(int index) {
        if(!isElementIndex(index)){
            throw new IndexOutOfBoundsException("Index:"+index+" ,Size:"+size);
        }
    }

    // 检查 index 索引位置是否可以添加元素
    private void checkPositionIndex(int index){
        if(!isPositionIndex(index)){
            throw new IndexOutOfBoundsException("Index:"+index+" ,Size:"+size);
        }
    }

    private void display() {
        System.out.println("size = " + size);
        for (Node<E> p = head.next; p != tail; p = p.next) {
            System.out.print(p.val + " <-> ");
        }
        System.out.println("null");
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinkedListDouble<Integer> list = new MyLinkedListDouble<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst(0);
        list.add(2, 100);

        list.display();
        // size = 5
        // 0 <-> 1 <-> 100 <-> 2 -> 3 -> null
    }
}
