import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electrodomestico {
    public int precio = 100;
    public String color = "blanco";
    public char consumoEnergetico = 'F';
    public int peso = 5;
    private List<String> colorDisponible = Arrays.asList("blanco", "negro", "azul", "gris");
    private List<Character> consumoDisponible = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F');

    public Electrodomestico(){

    }

    public Electrodomestico(int precio, int peso){
        this.precio = precio;
        this.peso = peso;
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.comprobarColor(color);
        this.comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public int getPrecio() {
        return this.precio;
    }

    public String getColor() {
        return this.color;
    }

    public char getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    public int getPeso() {
        return this.peso;
    }

    public char comprobarConsumoEnergetico(char letra){
        if (consumoDisponible.contains(letra)){
            return this.consumoEnergetico = letra;
        }
        return this.consumoEnergetico;
    }

    public String comprobarColor(String color){
        if (colorDisponible.contains(color)){
            return this.color = color;
        }
        return this.color;
    }

    public int precioFinal(){
        int valorFinal = this.getPrecio();
        switch (consumoEnergetico){
            case 'A' : valorFinal += 100;
                break;
            case 'B' : valorFinal += 80;
                break;
            case 'C' : valorFinal += 60;
                break;
            case 'D' : valorFinal += 50;
                break;
            case 'E' : valorFinal += 30;
                break;
            case 'F' : valorFinal += 10;
                break;
            default : System.err.println("Kapasao");
                break;
        }

        if (this.getPeso() <= 19){
            valorFinal += 10;
        } else if (this.getPeso() <=49){
            valorFinal += 50;
        } else if (this.getPeso() <=79){
            valorFinal += 80;
        } else{
            valorFinal += 100;
        }

        return valorFinal;
    }
}
