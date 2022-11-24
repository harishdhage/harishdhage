package Polymorphism.OverridingPack;

public class FinalMethOverriding {
    public static void main(String[] args) {

    }
}

class CricketBall{
    public final void swing(){
        System.out.println("Inside CricketBall -> swing()");
    }

}
class PinkBall extends CricketBall{
    /*@Override
    public void swing(){

    }*/
}
