package interfaces;

/**
 * Created by Omar.Rivera on 27/3/23.
 *
 * @author Omar.Rivera
 */

public class SoccerBall extends Ball {
    @Override
    public int maxBounceHeight() {
        return 5;
    }

    public static void main(String[] args) {
        SoccerBall soccerBall = new SoccerBall();
        System.out.println("soccerBall.maxBounceHeight() = " + soccerBall.maxBounceHeight());
    }

    @Override
    public void setRadio(int radio) {

    }

    @Override
    public int getRadio() {
        return 0;
    }
}
