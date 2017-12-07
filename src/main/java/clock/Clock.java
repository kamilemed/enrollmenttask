package clock;

public class Clock {
    private static final int MIN_HOURS_AND_MINUTES = 0;
    private static final int MAX_HOURS = 23;
    private static final int MAX_MINUTES = 59;
    private static final double MIN_ARROW_DEG_PER_MINUTE = 360.0 / 60.0;
    private static final double HOUR_ARROW_DEG_PER_HOUR = 360.0 / 12.0;
    private static final double HOUR_ARROW_DEG_PER_MINUTE = 360.0 / 12.0 / 60.0;

    private int hours;
    private int minutes;

    public Clock() {
        this.hours = 0;
        this.minutes = 0;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setTime(int hours, int minutes) throws IllegalArgumentException {
        if (!validTime(hours, minutes)) {
            throw new IllegalArgumentException();
        }

        this.hours = hours;
        this.minutes = minutes;
    }

    public boolean validTime(int hours, int minutes) {
        return ((hours >= MIN_HOURS_AND_MINUTES && hours <= MAX_HOURS) && (minutes >= MIN_HOURS_AND_MINUTES && minutes <= MAX_MINUTES));
    }

    public double getDegreeBetweenArrows() {
        hours = this.hours > 12 ? this.hours - 12 : this.hours; // convert from 24-hour to 12-hour main.java.clock if needed
        double hourPosition = hours * HOUR_ARROW_DEG_PER_HOUR + HOUR_ARROW_DEG_PER_MINUTE * this.minutes;
        double minPosition = MIN_ARROW_DEG_PER_MINUTE * this.minutes;
        return Math.min(Math.abs(hourPosition - minPosition), 360 - Math.abs(minPosition - hourPosition));
    }
}
