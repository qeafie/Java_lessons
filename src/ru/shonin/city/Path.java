package ru.shonin.city;

import java.util.Objects;

public class Path {
    private City city;
    private int cost;

    public Path(City city){
        this.city = city;
    }
    public Path(City city,int cost){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Path path = (Path) o;
        return (cost == path.cost) && (Objects.equals(city.getName(), path.city.getName()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, cost);
    }
}
