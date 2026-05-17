import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private Posicion posicion;
    private List<Recolectable> inventario;
    private int energia;
    private int dinero;

    public Personaje(Posicion posicion) {
        this.posicion = posicion;
        this.inventario = new ArrayList<>();
    }

    public void mover(Direccion direccion) {
        int newX = posicion.getX() + direccion.getDx();
        int newY = posicion.getY() + direccion.getDy();
        this.posicion = new Posicion(newX, newY);
    }

    public void recoger(List<Recolectable> objetos) {
        
        for (Recolectable objeto : objetos) {
            if (this.posicion.equals(objeto.posicion())) {
                objeto.hacerEfectoEn(this);
                inventario.add(objeto);
                System.out.println("Recolectado: " + objeto );
            }
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (Recolectable objeto : inventario) {
            System.out.println(" - " + objeto);
        }
    }

    public void ganarDinero(int valor) {
        this.dinero += valor;
    }

    public void ganarEnergia(int energiaRecuperada) {
        this.energia += energiaRecuperada;
    }

}
