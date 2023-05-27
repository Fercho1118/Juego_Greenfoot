import greenfoot.*;
import java.util.ArrayList;
import java.util.List;

public class MiMundo extends World {

    private static final int NUMERO_VIDAS = 3;

    private Mono mono;
    private Puntuacion puntuacion;
    private List<Vida> vidas;

    public MiMundo() {    
        super(997, 662, 1);
        mono = new Mono();
        addObject(mono, getWidth()/2, getHeight()-50);
        puntuacion = new Puntuacion();
        addObject(puntuacion, 50, 25);  
        
        vidas = new ArrayList<Vida>();
        for (int i = 0; i < NUMERO_VIDAS; i++) {
            Vida vida = new Vida();
            vidas.add(vida);
            addObject(vida, 550 + i * 20, 25);  // Añade las vidas a la esquina superior derecha
        }
    }

    public Puntuacion getPuntuacion() {
        return puntuacion;
    }

    public void reducirVida() {
        if (!vidas.isEmpty()) {
            Vida vida = vidas.remove(vidas.size() - 1);
            removeObject(vida);

            if (vidas.isEmpty()) {
                showText("GAME OVER", getWidth()/2, getHeight()/2);
                Greenfoot.stop();
            }
        }
    }

    public void act() {
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Bananas(), Greenfoot.getRandomNumber(getWidth()-1), 0);
        }
    }
}


