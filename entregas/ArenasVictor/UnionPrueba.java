public class UnionPrueba {
    public static void main(String[] args) {

        Cola cola = new Cola();
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);
        assert cola.desencolar() == 1;
        cola.encolar(4);
        assert cola.desencolar() == 2;
        assert cola.desencolar() == 3;
        assert cola.desencolar() == 4;
        assert cola.estaVacia();

        Pila pila = new Pila();
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        assert pila.desapilar() == 3;
        pila.apilar(4);
        assert pila.desapilar() == 4;
        assert pila.desapilar() == 2;
        assert pila.desapilar() == 1;
        assert pila.estaVacia();

        System.out.println("Todo correcto");
    }
}
