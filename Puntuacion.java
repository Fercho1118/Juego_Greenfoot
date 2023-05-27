import greenfoot.*;

public class Puntuacion extends Actor {

    private int puntos = 0;
    private GreenfootImage imagen;

    public Puntuacion() {
        imagen = new GreenfootImage(100, 30);
        setImage(imagen);
        update();
    }

    public void addPuntos(int puntos) {
        this.puntos += puntos;
        update();
    }

    private void update() {
        imagen.clear();
        imagen.setColor(Color.WHITE);
        imagen.setFont(new Font("Arial", 20));
        imagen.drawString("Puntos: " + puntos, 5, imagen.getHeight()/2 + 5);
        setImage(imagen);
    }
}



