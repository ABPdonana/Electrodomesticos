public class Television extends Electrodomestico {

    int resolucion = 20;
    boolean tdt = false;

    public Television() {
        super();
    }

    public Television(int precio, int peso){
        super(precio, peso);
    }


    public Television(int precio, String color, char consumoEnergetico, int peso, int resolucion, boolean tdt) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return this.resolucion;
    }

    public boolean getTdt() {
        return this.tdt;
    }

    @Override
    public int precioFinal() {
        int valorFinal = super.precioFinal();
        if (this.getResolucion() > 40){
            valorFinal += getPrecio() * 0.3;
        }
        if (this.getTdt()){
            valorFinal += 50;
        }
        return valorFinal;
    }

}
