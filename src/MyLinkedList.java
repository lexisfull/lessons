/**
 * https://leetcode.com/problems/design-linked-list/
 * @param <T>
 */
public class MyLinkedList<T> {

    private int size;
    private Node<T> head;
    private Node<T> tail;

    private static class Node<T> {
        private T value;
        private Node<T> prev;
        private Node<T> next;

    }

    public int getSize() {
        return this.size;
    }

    public void addFirst(T value) {
        var node = createNode(value);
        node.next = head;
        if (head != null) {
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
        size ++;
    }

    public void addLast(T value) {
        if (head == null) {
            addFirst(value);
            return;
        }
        var node = createNode(value);

        tail.next = node;
        node.prev = tail;
        tail = node;

        size++;
    }

    public void remove(int index) {
        error(index);
        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
            return;
        }
        if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }
        if (index < size / 2) {
            Node<T> current = head;
            for (int i = 0; i < index; i ++) {
                current = current.next;
            }
            current.next.prev = current.prev;
            current.prev.next = current.next;
            size --;
            return;
        }
        Node<T> current = tail;
        for (int i = size - 1 - index; i > 0; i--) {
            current = current.prev;
        }
        current.next.prev = current.prev;
        current.prev.next = current.next;
        size--;
    }

    public T get(int index) {
        error(index);
        if (index == 0) {
            return head.value;
        }
        if (index == size - 1) {
            return tail.value;
        }
        if (index < size / 2) {
            Node<T> current = head;
            for (int i = 0; i < index; i ++) {
                current = current.next;
            }
            return current.value;
        }
        Node<T> current = tail;
        for (int i = size - 1 - index; i > 0; i--) {
            current = current.prev;
        }
        return current.value;
    }

    public void reverse() {
        Node<T> current = head; // 0
        while(current != null) {
            Node<T> temp = current.next; // 1
            current.next = current.prev; // null
            current.prev = temp; // 1
            current = temp;
        }
        Node<T> temp = head;
        head = tail;
        tail = temp;
    }

    private void error(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
    }

    private Node<T> createNode(T value) {
        Node<T> node = new Node<>();
        node.value = value;
        return node;
    }

}
