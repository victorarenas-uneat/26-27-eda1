public class Cola {
    private PilaBase entrada;
    private PilaBase salida;

    public Cola() {
        entrada = new PilaBase();
        salida = new PilaBase();
    }

    public void encolar(int valor) {
        entrada.apilar(valor);
    }

    public int desencolar() {
        assert !estaVacia() : "No es posible desencolar una cola vacia";
        if (salida.estaVacia()) {
            while (!entrada.estaVacia()) {
                salida.apilar(entrada.desapilar());
            }
        }
        return salida.desapilar();
    }

    public boolean estaVacia() {
        return entrada.estaVacia() && salida.estaVacia();
    }
}
