package ru.shonin.service;

public final class TimeZone {
    private int hours;
    private int minutes;

    TimeZone(int hours){
        if((hours >= -12) && (hours <= 14))
            this.hours = hours;
        else
            throw  new IllegalArgumentException("Число должно быть в диапозоне от -12 до 14");



    }

    TimeZone(int hours, int minutes){
        this(hours);

        if(((hours != 14) && (hours != -12)) && ((minutes == 0) || (minutes == 30)))
            this.minutes = minutes;
        else
            throw new IllegalArgumentException("Число минут должно быть либо 0, либо 30");
    }

    public void setHours(int hours) {
        if((hours >= -12) && (hours <= 14))
            this.hours = hours;
        else
            throw  new IllegalArgumentException("Число должно быть в диапозоне от -12 до 14");
    }

    public void setMinutes(int minutes) {
        if(((hours != 14) && (hours != -12)) && ((minutes == 0) || (minutes == 30)))
            this.minutes = minutes;
        else
            throw new IllegalArgumentException("Число минут должно быть либо 0, либо 30");
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public String toString(){

        return (hours > 0?"+":"-") +
                ((hours / 10) >= 1 ? Math.abs(hours) : "0" + Math.abs(hours)) + ":" +
                ((hours / 10) >= 1 ? Math.abs(minutes) : "0" + Math.abs(minutes)) + " UTC";
    }
}
