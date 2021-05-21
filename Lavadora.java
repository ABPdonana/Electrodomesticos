public class Lavadora extends Electrodomestico {
    int carga = 5;

    public Lavadora() {
        super()
    }

    public Lavadora(int precio, int peso) {
        super(precio, peso);
    }

    public Lavadora(int precio, String color, char consumoEnergetico, int peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return this.carga;
    }

    @Override
    public int precioFinal() {
        int valorFinal = super.precioFinal();
        if (this.getCarga() > 30){
            valorFinal += 50;
        }
        return valorFinal;
    }
}
