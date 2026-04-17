package data.structure;

import java.util.ArrayList;
import java.util.List;

public class Stack<T extends Comparable<T>> {
    Node<T> head;
    int size;
    public void add(Node<T> element) {
        element.setNext(head);
        head = element;
        size++;
    }
    public void pop() {
        head = head.getNext();
        size--;
    }
    public List<T> getElements() {
        Node<T> temp = head;
        List<T> elements = new ArrayList<>();
        while (temp != null) {
            elements.add(temp.getElement());
            temp = temp.getNext();
        }
        return elements;
    }

    public void show () {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getElement() + "\t");
            temp = temp.getNext();
        }
    }
}
