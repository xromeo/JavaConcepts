package interfaces;

/**
 * Created by Omar.Rivera on 27/3/23.
 *
 * @author Omar.Rivera
 */

public abstract class Ball implements Bounceable, Circular {

    public abstract int maxBounceHeight();

    @Override
    public void bounce() {

    }

    @Override
    public void setBounceFactor(int bounceFactor) {

    }
}
