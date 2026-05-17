public class Moneda implements Recolectable {
    private Posicion posicion;  
    private int valor;

    public Moneda(Posicion posicion, int valor) {
        this.posicion = posicion;
        this.valor = valor; 
    }

    @Override
    public String toString() {
        return "Moneda en posición (" + posicion.getX() + ", " + posicion.getY() + ")";
    }

    @Override
    public Posicion posicion() {
        return posicion;
    }

    @Override
    public void hacerEfectoEn(Personaje personaje) {
        personaje.ganarDinero(valor);
    }

}
