package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_six() {
        BaseDemo baseDemo = new BaseDemo();

        int expected = 6;

        assertEquals(expected, baseDemo.sum(3, 3));
    }

    @Test
    public void should_return_ten() {
        BaseDemo baseDemo = new BaseDemo();

        int expected = 10;

        assertEquals(expected, baseDemo.sum(5, 5));
    }
}
