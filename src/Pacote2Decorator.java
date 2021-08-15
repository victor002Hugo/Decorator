public class Pacote2Decorator extends Decorator{

    public Pacote2Decorator(VisualComponent decorates) {
        super(decorates);
    }

    public void imprimirPlano(){
        System.out.println("Plano de R$9,99");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        imprimirPlano();
    }
}
