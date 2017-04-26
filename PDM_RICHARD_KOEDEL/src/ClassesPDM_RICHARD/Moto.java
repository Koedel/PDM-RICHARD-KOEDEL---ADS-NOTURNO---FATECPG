package ClassesPDM_RICHARD;

public class Moto extends Automovel{
    private int cilindradas;
    private String estadoCorrente;
        String setCor;
        String setModelo;
        int setVelocidadeMaxima;
        int setVelocidadeAtual;

    //Devolve a marcha do carro
    public void imprimirEstadoMotor(int value){
            if(value == 1) {
            estadoCorrente = "Parado";
            System.out.println("Moto Parada");
            }
            else if(value == 2) {
            estadoCorrente = "Andando";
            System.out.println("Moto Andando");
            }
            else if(value == 3) {
            estadoCorrente = "Correndo";
            System.out.println("Moto Correndo");
            }
    }
}

