package data.structure;

import static java.util.Objects.isNull;

public class Queue<T extends Comparable<T>> extends Stack<T> {

    Node<T> last;

    public void add(Node<T> node) {
       if(isNull(last)) {
           head = last = node;
           size++;
           return;
       }
       last.setNext(node);
       last = node;
       size++;
    }


}
