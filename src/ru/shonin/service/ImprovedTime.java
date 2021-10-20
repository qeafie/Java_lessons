package ru.shonin.service;

public class ImprovedTime extends Time{
    private TimeZone timeZone;
    public ImprovedTime(int seconds,TimeZone timeZone){
        super(seconds);
        this.timeZone = timeZone;
    }

    public ImprovedTime(int hour, int minutes, int seconds, TimeZone timeZone) {
        super(hour, minutes, seconds);
        this.timeZone = timeZone;
    }

    public TimeZone getTimeZone() {
        return new TimeZone(timeZone.getHours(), timeZone.getMinutes());
    }

    @Override
    public String toString() {
        return super.toString() + timeZone;
    }
}
