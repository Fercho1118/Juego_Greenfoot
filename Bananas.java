import greenfoot.*;

public class Bananas extends Actor {
    public void act() {
        setLocation(getX(), getY()+3);

        if (getY() + getImage().getHeight() / 2 >= getWorld().getHeight()) {
            ((MiMundo)getWorld()).reducirVida();
            getWorld().removeObject(this);
        }
    }
}



