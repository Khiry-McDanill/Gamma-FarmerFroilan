package com.zipcodewilmington.froilansfarm;
<<<<<<< HEAD
=======

>>>>>>> 7c5517a9de158dfcc36bbde41953b368ab6d532e
import org.junit.Test;

public class PilotTest {
class TestPilot implements Pilot {
    public void fly() {
        System.out.println("Flying");
    }
    public void land() {
        System.out.println("Landed!");
    }
}

@Test
public void testFly() {
    TestPilot tp = new TestPilot();
    tp.fly();

  } 

@Test
public void testLand() {
    TestPilot tp = new TestPilot();
    tp.land();
}
}
