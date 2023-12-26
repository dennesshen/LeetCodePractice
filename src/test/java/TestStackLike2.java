import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import study.StackLike2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author christinehsieh on 2023/12/18
 */
public class TestStackLike2 {

    private StackLike2<Integer> stack = new StackLike2<>();

    @BeforeEach
    public void  beforeTest(){
        stack = new StackLike2<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
    }

    @Test
    public void testPop(){
        int x = stack.pop();
        assertEquals(5, x);
        x = stack.pop();
        assertEquals(4, x);
        int size = stack.size();
        assertEquals(3, size);
    }

    @Test
    public void testGet(){

        int x = stack.get(0);
        assertEquals(1, x);
        x = stack.get(3);
        assertEquals(4, x);

        assertThrows(IndexOutOfBoundsException.class, ()-> stack.get(5));
        assertThrows(IndexOutOfBoundsException.class, ()-> stack.get(-1));

        int size = stack.size();
        assertEquals(5, size);
    }

    @Test
    public void testBottom(){
        int x = stack.bottom();
        assertEquals(1, x);

        int size = stack.size();
        assertEquals(5, size);
    }
}
