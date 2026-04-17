package data.structure;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

class StackTest extends CommonTest {
    @Test
    void pushStackSuccess() {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i < inputElements.size(); i++) {
            stack.add(new Node(inputElements.get(i)));
        }
        List<Integer> actual = stack.getElements();
        Collections.reverse(inputElements);
        assertThat(actual).isEqualTo(inputElements);
    }
    @Test
    void PopSuccess() {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i < inputElements.size(); i++) {
            stack.add(new Node(inputElements.get(i)));
        }
        stack.pop();
        List<Integer> actual = stack.getElements();
        inputElements.remove(inputElements.size() - 1);
        Collections.reverse(inputElements);
        assertThat(actual).isEqualTo(inputElements);
    }

}