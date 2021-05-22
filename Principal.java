public class Principal {

    public static void main(String[] args) {

        Electrodomestico[] arrayElec = new Electrodomestico[10];

        arrayElec[0] = new Electrodomestico(200, "Verde", 'C', 60);
        arrayElec[1] = new Lavadora(150, 30);
        arrayElec[2] = new Television(500, "negro", 'E', 80, 42, false);
        arrayElec[3] = new Electrodomestico();
        arrayElec[4] = new Electrodomestico(600, "gris", 'D', 20);
        arrayElec[5] = new Lavadora(300, "blanco", 'Z', 40, 40);
        arrayElec[6] = new Television(250, 70);
        arrayElec[7] = new Lavadora(400, "verde", 'A', 100, 15);
        arrayElec[8] = new Television(200, "naranja", 'C', 60, 30, true);
        arrayElec[9] = new Electrodomestico(50, 10);

        for (Electrodomestico o : arrayElec) {
            System.out.println(o.precioFinal());
        }
    }

}
