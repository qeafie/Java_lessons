public class Path {
    City city;
    int cost;

    Path(City city){
        this.city = city;
    }
    Path(City city,int cost){
        this(city);
        this.cost = cost;
    }
    public String toString(){
        return city.name + ": " + cost;
    }
}
