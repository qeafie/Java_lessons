public class Rectangle extends Shape{
    private int aSide;
    private int bSide;

    public Rectangle(Point point,int aSide,int bSide){
        super(point);
        if ((aSide<0) || (bSide < 0))
            throw new IllegalArgumentException("Сторона не может равняться нулю");
        this.aSide =aSide;
        this.bSide =bSide;
    }

    public int getArea(){
        return aSide * bSide;
    }
    public int getaSide() {
        return aSide;
    }

    public int getbSide() {
        return bSide;
    }

}
