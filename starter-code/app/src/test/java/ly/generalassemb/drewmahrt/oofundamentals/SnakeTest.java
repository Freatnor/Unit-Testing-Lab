package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jonathan Taylor on 7/13/16.
 */
public class SnakeTest {

    @Test
    public void makeNoise_isCorrect(){
        Snake snake = new Snake(true);
        assertEquals("Hiss!!!", snake.makeNoise());
    }

    @Test
    public void toString_isCorrect(){
        Snake snake = new Snake(true);
        assertEquals("Snake (Poisonous)", snake.toString());

        Snake snake2 = new Snake(false);
        assertEquals("Snake", snake2.toString());
    }

    @Test
    public void hasShell_isCorrect(){
        Snake snake = new Snake(true);
        assertFalse(snake.getHasShell());
    }

    @Test
    public void setHasShell_isCorrect(){
        Snake snake = new Snake(true);
        snake.setHasShell(true);
        assertTrue(snake.getHasShell());
    }

    @Test
    public void getTopSpeed_isCorrect(){
        Snake snake = new Snake(true);
        assertEquals(5, snake.getTopSpeed());
    }

    @Test
    public void setTopSpeed_isCorrect(){
        Snake snake = new Snake(true);
        snake.setTopSpeed(50);
        assertEquals(50, snake.getTopSpeed());
    }

    @Test
    public void getIsEndangered_isCorrect(){
        Snake snake = new Snake(true);
        assertFalse(snake.isEndangered());
    }

    @Test
    public void setIsEndangered_isCorrect(){
        Snake snake = new Snake(true);
        snake.setIsEndangered(true);
        assertTrue(snake.isEndangered());
    }

    @Test
    public void getName_isCorrect(){
        Snake snake = new Snake(true);
        assertEquals("Snake", snake.getName());
    }

    @Test
    public void setName_isCorrect(){
        Snake snake = new Snake(true);
        snake.setName("Salazar");
        assertEquals("Salazar", snake.getName());
    }
}
