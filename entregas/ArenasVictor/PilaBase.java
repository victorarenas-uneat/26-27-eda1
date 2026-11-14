public class PilaBase {
    private Nodo cima;

    public PilaBase() {
        cima = null;
    }

    public void apilar(int valor) {
        cima = new Nodo(valor, cima);
    }

    public int desapilar() {
        assert !estaVacia();
        int valor = cima.getValor();
        cima = cima.getSiguiente();
        return valor;
    }

    public boolean estaVacia() {
        return cima == null;
    }
}
