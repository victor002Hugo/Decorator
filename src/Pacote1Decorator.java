public class Pacote1Decorator extends Decorator{

    public Pacote1Decorator(VisualComponent decorates) {
        super(decorates);
    }

    public void imprimirPlano(){
        System.out.println("Plano de R$19,99");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        imprimirPlano();
    }
}
