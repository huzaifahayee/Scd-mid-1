public class ListStack<T> implements Stack<T> {

    private static class Node<T> {
        T data;
        Node<T> next;
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node<T> top;
    private int size;

    @Override
    public void push(T val) {
        Node<T> node = new Node<>(val);
        node.next = top;
        top = node;
        size++;

    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public T peek() {
        return top.data;
    }

    @Override
    public T pop() {
        T val = top.data;
        

    }
}
