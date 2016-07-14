package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Jonathan Taylor on 7/13/16.
 */
public class MouseTest {

    @Test
    public void isAlbino_isCorrect(){
        Mouse mouse = new Mouse(true);
        assertTrue(mouse.isAlbino());
    }

    @Test
    public void setIsAlbino_isCorrect(){
        Mouse mouse = new Mouse(true);
        mouse.setIsAlbino(false);
        assertFalse(mouse.isAlbino());
    }

    @Test
    public void makeNoise_isCorrect(){
        Mouse mouse = new Mouse(true);
        assertEquals("Squeak!", mouse.makeNoise());
    }

    @Test
    public void toString_isCorrect(){
        Mouse mouse = new Mouse(true);
        assertEquals("Mouse (has white fur)", mouse.toString());
        mouse.setIsAlbino(false);
        assertEquals("Mouse", mouse.toString());
    }

    @Test
    public void getNumLegs_isCorrect(){
        Mouse mouse = new Mouse(true);
        assertEquals(4, mouse.getNumLegs());
    }

    @Test
    public void setNumLegs_isCorrect(){
        Mouse mouse = new Mouse(true);
        //mutant!
        mouse.setNumLegs(5);
        assertEquals(5, mouse.getNumLegs());
    }

    @Test
    public void getTopSpeed_isCorrect(){
        Mouse mouse = new Mouse(true);
        assertEquals(3, mouse.getTopSpeed());
    }

    @Test
    public void setTopSpeed_isCorrect(){
        Mouse mouse = new Mouse(true);
        mouse.setTopSpeed(70);
        assertEquals(70, mouse.getTopSpeed());
    }

    @Test
    public void getIsEndangered_isCorrect(){
        Mouse mouse = new Mouse(true);
        assertFalse(mouse.isEndangered());
    }

    @Test
    public void setIsEndangered_isCorrect(){
        Mouse mouse = new Mouse(true);
        mouse.setIsEndangered(false);
        assertFalse(mouse.isEndangered());
    }

    @Test
    public void getName_isCorrect(){
        Mouse mouse = new Mouse(true);
        assertEquals("Mouse", mouse.getName());
    }

    @Test
    public void setName_isCorrect(){
        Mouse mouse = new Mouse(true);
        mouse.setName("Stewart");
        assertEquals("Stewart", mouse.getName());
    }
}
