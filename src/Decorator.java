public abstract class Decorator extends VisualComponent{

    private VisualComponent component;

    public Decorator(VisualComponent decorates){
        this.component=decorates;
    }


    @Override
    public void imprimir() {
        component.imprimir();
    }
}
