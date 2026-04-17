package com.zipcodewilmington.froilansfarm;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class EaterTest {
    @Test
    static class TestFood implements Edible {
        @Override
        public boolean getIsEdible() {
            return true;
        }
    }
    @Test
    static class TestEater implements Eater {
        boolean hasEaten = false;
        public void eat(Edible edible) {
            this.hasEaten = true;
        }
    }
    @Test
    void testEat() {
        TestEater eater = new TestEater();
        Edible food = new TestFood();

        eater.eat(food);
        assertTrue(eater.hasEaten, "Eater will be eatin all of it yum");
    }

}