public class Cuckoo extends Bird{

    @Override
    public void sing(){
        int rand = (int)(Math.random()*10);

        for (;rand > 0; rand--){
            System.out.println("ку-ку");
        }
    }

}
