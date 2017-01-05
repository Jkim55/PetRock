import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {
    private PetRock rocky = new PetRock("Rocky");

    @Test
    public void getName() throws Exception{
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void petRockIsHappyToStart () throws Exception {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void petRockIsHappyafterPlay() throws Exception {
        rocky.plays();
        assertTrue(rocky.isHappy());
    }

    @Test
    public void hasASize() throws Exception {
        rocky.setSize("Large blob");
        assertEquals("Large blob", rocky.getSize());
    }
}
