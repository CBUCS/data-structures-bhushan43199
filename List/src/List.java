public interface List {
    void add (Object item); //Linked list , Deque, Queue
    void addAt (Object item, int position);
    int remove (Object item);
    int removeAt (int position);
    int contains (Object item);
    int addAtTail(Object item);
    int push(Object item);
    int pop(Object item);
    int delete(Object item);
    void addLast(Object item);
    void addFirst(Object item);
    int getData(Object item);




    int numItems();
    Object grabAt(int position);
    Object[] toArray();
    void print();
    boolean clear();
}