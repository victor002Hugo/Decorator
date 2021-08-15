public class Pacote3Decorator extends Decorator{


    public Pacote3Decorator(VisualComponent decorates) {
        super(decorates);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        imprimirPlano();
    }

    public void imprimirPlano(){
        System.out.println("Plano de R$29,99");
    }
}
