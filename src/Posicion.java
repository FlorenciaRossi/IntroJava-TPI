public class Posicion {
    private int x;
    private int y;

    public Posicion(int i, int j) {
        this.x = i;
        this.y = j;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Posicion posicion = (Posicion) obj;
        return x == posicion.x && y == posicion.y;
    }

    @Override
    public int hashCode() {
        return x + y;
    }


}
