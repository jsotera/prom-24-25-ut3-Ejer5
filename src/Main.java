public class Main {
    public static void main(String[] args) {
        Agua vapor = new Agua(127);
        System.out.println("ANALIZANDO EL VAPOR:");
        vapor.determinarEstado();
        Agua liquido = new Agua(36);
        System.out.println("ANALIZANDO EL LIQUIDO:");
        liquido.determinarEstado();
        Agua hielo = new Agua(-25);
        System.out.println("ANALIZANDO EL HIELO:");
        hielo.determinarEstado();
    }
}