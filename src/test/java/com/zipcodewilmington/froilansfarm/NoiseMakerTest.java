package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class NoiseMakerTest {

    private static class TestNoiseMaker implements NoiseMaker {
        @Override
        public String makeNoise() {
            return "some noise";
        }
    }

    @Test
    public void testMakeNoise() {
        NoiseMaker noiseMaker = new TestNoiseMaker();
        String result = noiseMaker.makeNoise();
        Assert.assertEquals("some noise", result);
    }
}
