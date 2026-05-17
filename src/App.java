import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Personaje personaje = new Personaje( new Posicion(2, 2));

        List<Recolectable> objetos = new ArrayList<>();

        objetos.add(
                new Moneda(
                        new Posicion(2, 3),
                        5
                )
        );

        objetos.add(
                new Pocion(
                        new Posicion(3, 3)
                )
        );

        personaje.mover(Direccion.ARRIBA);
        personaje.recoger(objetos);

        personaje.mover(Direccion.DERECHA);
        personaje.recoger(objetos);

        personaje.mostrarInventario();
   
    }
}
