import greenfoot.*;

public class Mono extends Actor {

    private int speed = 15;

    public void act() {
        if(Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());
        }
        if(Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
        }
        if(canSee(Bananas.class)) {
            eat(Bananas.class);
        }
    }

    public boolean canSee(Class clss) {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;
    }

    public void eat(Class clss) {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
            ((MiMundo)getWorld()).getPuntuacion().addPuntos(1);
        }
    }
}



