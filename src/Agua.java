public class Agua {

    public double temperatura;

    public Agua(double temperatura){
        this.temperatura = temperatura;
    }

    public void determinarEstado(){
        if(this.temperatura <= 0){
            System.out.println("Esta en estado SOLIDO.");
        } else if (this.temperatura < 100) {
            System.out.println("Esta en estado LIQUIDO.");
        } else if (this.temperatura >= 100) {
            // Si, lo podiamos hacer con un else a secas
            System.out.println("Esta en estado GASEOSO.");
        }
    }

}
