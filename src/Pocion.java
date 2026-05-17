public class Pocion implements Recolectable {

    private static final int ENERGIA_RECUPERADA = 20;
    private Posicion posicion;

    public Pocion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public Posicion posicion() {
        return posicion;
    }

    @Override
    public void hacerEfectoEn(Personaje personaje) {
        personaje.ganarEnergia(ENERGIA_RECUPERADA);
    }


    @Override
    public String toString() {
        return "Poción en posición (" + posicion.getX() + ", " + posicion.getY() + ")";
    }
}
