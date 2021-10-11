public class ThreeDimensionalPoint extends Point{
    private int z;

    ThreeDimensionalPoint(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public String toString(){
        return "{" + super.getX() + ";" + super.getY() + ";" + z + "}";
    }
}
