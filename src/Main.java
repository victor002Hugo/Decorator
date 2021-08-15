public class Main {
    public static void main(String[] args) {
        Basico bs = new Basico();
        Pacote1Decorator p1 = new Pacote1Decorator(bs);
        Pacote2Decorator p2 = new Pacote2Decorator(p1);
        Pacote3Decorator p3 = new Pacote3Decorator(p2);
        Pacote4Decorator p4 = new Pacote4Decorator(p3);

        p4.imprimir();
    }
}
