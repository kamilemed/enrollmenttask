package clockTests;

import clock.Clock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClockTest {

    @Test
    public void checkIfArrowsArrowMovesAroundTheClock() {
        Clock clock = new Clock();
        clock.setTime(0, 30);
        Assertions.assertEquals(clock.getDegreeBetweenArrows(),165);
    }

    @Test
    public void checkIfSmallerAngleIsCalculated() {
        Clock clock = new Clock();
        clock.setTime(0, 45);
        Assertions.assertEquals(clock.getDegreeBetweenArrows(),112.5);
    }

    @Test
    public void checkIfMinuteArrowMovesAroundTheCock() {
        Clock clock = new Clock();
        clock.setTime(0, 1);
        Assertions.assertEquals(clock.getDegreeBetweenArrows(),5.5);
    }

}