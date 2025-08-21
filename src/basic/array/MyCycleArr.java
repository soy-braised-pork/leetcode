package basic.array;

/**
 * @author zhulx
 **/
public class MyCycleArr<T> {
    private T[] arr;
    private int start;
    private int end;
    private int count;
    private int size;

    public MyCycleArr(){
        this(1);
    }

    @SuppressWarnings("unchecked")
    public MyCycleArr(int size){
        this.size=size;
        this.arr = (T[]) new Object[size];
        this.start=0;
        this.end=0;
        this.count=0;
    }

    // 自动扩缩容辅助函数
    @SuppressWarnings("unchecked")
    public void resize(int newSize){
        // 创建新的数组
        T[] newArr =(T[]) new Object[newSize];
        // 将旧数组元素复制到新数组中
        for(int i=0;i<count;i++){
            newArr[i] = arr[(start+i) % size];
        }
        arr=newArr;
        // 重置 start 和 end指针
        start=0;
        end=count;
        size=newSize;
    }

    // 在数组头部添加元素
    public void addFirst(T val){
        // 当数组满时，扩容为原来两倍
        if(isFull()){
            resize(size*2);
        }
        start=(start-1+size)%size;
        arr[start]=val;
        count++;
    }

    // 获得数组头部元素
    public T getFirst(){
        if(isEmpty()){
            throw new IllegalStateException("Array is Empty");
        }
        return arr[start];
    }

    // 获得数组尾部元素
    public T getLast(){
        if(isEmpty()){
            throw new IllegalStateException("Array is Empty");
        }
        return arr[(end-1+size)%size];
    }

    public boolean isFull(){
        return count==size;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }


}
