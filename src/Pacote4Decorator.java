public class Pacote4Decorator extends Decorator{


    public Pacote4Decorator(VisualComponent decorates) {
        super(decorates);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }

    public void imprimirPlano(){
        System.out.println("Plano de R$49,99");
    }
}
