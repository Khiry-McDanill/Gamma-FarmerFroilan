package com.zipcodewilmington.froilansfarm;
import org.junit.Assert;
import org.junit.Test;
package com.zipcodewilmington.froilansfarm.Interface.NoiseMaker;

public class NoiseMakerTest {
    @Test
    private static class testNoiseMaker implements NoiseMaker {
        @Overrride
        public String makeNoise() {
            return "some noise";
        }
    }
    @Test
    public void testMakeNoise() {
        NoiseMaker noisemaker = new TestNoiseMaker();
        String result = noiseMaker.makeNoise();

        Assert.assertEquals("some noise" , result);
    }
}