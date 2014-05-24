package gordillo.proyecto1;

public class Contador {
static int  contador;

    public static int getContador() {
        contador++;
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
