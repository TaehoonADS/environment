package kr.co.insighter.environment;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void subtraction_isCorrect() throws Exception {
        assertEquals(1, 4 - 3);
    }

    @Test
    public void ckeckIsAdult() throws Exception {

        Director dir = new Director();
        assertEquals(true,dir.rightAge(21));

        assertEquals(2, 4 - 3);
    }
}