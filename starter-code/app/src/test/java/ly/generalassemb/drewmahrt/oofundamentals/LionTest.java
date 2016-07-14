package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jonathan Taylor on 7/13/16.
 */
public class LionTest {

    @Test
    public void isAlpha_isCorrect(){
        Lion lion = new Lion(true);
        assertTrue(lion.isAlpha());
    }

    @Test
    public void setIsAlpha_isCorrect(){
        Lion lion = new Lion(true);
        lion.setIsAlpha(false);
        assertFalse(lion.isAlpha());
    }

    @Test
    public void makeNoise_isCorrect(){
        Lion lion = new Lion(true);
        assertEquals("Roar!!!", lion.makeNoise());
    }

    @Test
    public void toString_isCorrect(){
        Lion lion = new Lion(true);
        assertEquals("Lion (Alpha)", lion.toString());
        lion.setIsAlpha(false);
        assertEquals("Lion", lion.toString());
    }

    @Test
    public void getNumLegs_isCorrect(){
        Lion lion = new Lion(true);
        assertEquals(4, lion.getNumLegs());
    }

    @Test
    public void setNumLegs_isCorrect(){
        Lion lion = new Lion(true);
        lion.setNumLegs(3);
        assertEquals(3, lion.getNumLegs());
    }

    @Test
    public void getTopSpeed_isCorrect(){
        Lion lion = new Lion(true);
        assertEquals(50, lion.getTopSpeed());
    }

    @Test
    public void setTopSpeed_isCorrect(){
        Lion lion = new Lion(true);
        //MECHA LION!
        lion.setTopSpeed(5000);
        assertEquals(5000, lion.getTopSpeed());
    }

    @Test
    public void getIsEndangered_isCorrect(){
        Lion lion = new Lion(true);
        assertFalse(lion.isEndangered());
    }

    @Test
    public void setIsEndangered_isCorrect(){
        Lion lion = new Lion(true);
        lion.setIsEndangered(true);
        assertTrue(lion.isEndangered());
    }

    @Test
    public void getName_isCorrect(){
        Lion lion = new Lion(true);
        assertEquals("Lion", lion.getName());
    }

    @Test
    public void setName_isCorrect(){
        Lion lion = new Lion(true);
        lion.setName("Arthur");
        assertEquals("Arthur", lion.getName());
    }

}
