package data.structure;

import org.junit.jupiter.api.Test;

import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

class HeapTest extends CommonTest {

    @Test
    void insertNodeToHeapSuccess() {
        Heap<Integer> heap = new Heap<>(inputElementsSize);
        for(int i=0; i < inputElements.size(); i++) {
            heap.insertNode(new Node(inputElements.get(i)));
        }
        Node<Integer>[] actualHeapElements = heap.getHeapArray();
        Node<Integer>[] expectedHeapElements = buildExpectedHeap().toArray(Node[]::new);

        assertThat(actualHeapElements)
                .usingRecursiveComparison()
                .isEqualTo(expectedHeapElements);
    }


    @Test
    void removeNodeFromHeapSuccess() {
        Heap<Integer> heap = new Heap<>(inputElementsSize);
        for(int i=0; i < inputElements.size(); i++) {
            heap.insertNode(new Node(inputElements.get(i)));
        }
        Node node = heap.removeNode(5);
        Node<Integer>[] actualHeapElements = heap.getHeapArray();

        PriorityQueue<Node<Integer>> expectedHeap = buildExpectedHeap();
        expectedHeap.remove(node);
        Node<Integer>[] expectedHeapElements = expectedHeap.toArray(Node[]::new);

        assertThat(actualHeapElements)
                .usingRecursiveComparison()
                .isEqualTo(expectedHeapElements);
    }

    private <T extends Comparable<T>> PriorityQueue<Node<T>> buildExpectedHeap() {
        PriorityQueue<Node<T>> expectedHeap = new PriorityQueue<>();
        for(Integer element : inputElements) {
            expectedHeap.add(new Node(element));
        }
        return expectedHeap;
    }

}