package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jonathan Taylor on 7/13/16.
 */
public class ZooTest {

    @Test
    public void addAnimal_isCorrect(){
        Zoo zoo = Zoo.getInstance();
        zoo.addAnimal(new Lion(true));
        assertNotNull(zoo.getAnimals());
        assertEquals(1, zoo.getAnimals().size());
    }

    @Test
    public void removeAnimal_isCorrect(){
        Zoo zoo = Zoo.getInstance();
        zoo.addAnimal(new Snake(true));
        zoo.removeAnimal(zoo.getAnimals().size() - 1);
        assertEquals(0, zoo.getAnimals().size());
    }
}
