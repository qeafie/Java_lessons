package ru.shonin.city;

public class Path {
    private City city;
    private int cost;

    Path(City city){
        this.city = city;
    }
    Path(City city,int cost){
        this(city);
        this.cost = cost;
    }
    public City getCity(){
        return new City(city.getName());
    }
    public int getCost(){
        return cost;
    }
    public void setCity(City city){
        this.city = city;
    }
    public void setCost(int cost){
        this.cost = cost;
    }
    public String toString(){
        return city.getName() + ": " + cost;
    }
}
