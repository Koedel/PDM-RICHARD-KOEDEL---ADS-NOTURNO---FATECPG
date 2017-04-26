package ClassesPDM_RICHARD;

class Carro extends Automovel{
   private int categoria;
   private int fabricante;
   private boolean trava;
    String setCor;
    String setModelo;
    int setVelocidadeAtual;
    int setVelocidadeMaxima;
   
    //Liga o carro
    public void ligaCarro() {
    System.out.println("Carro ligado");
    }
        //Liga o carro com gasolina ou alcool
        public void ligaCarro(int tipo) {
        if (tipo == 1) {
        System.out.println("O carro está ligado abastecido com gasolina");
        }
        if (tipo == 2) {
        System.out.println("O carro está ligado abastecido com alcool");
        }
        }
    //Devolve a marcha do carro
    public int pegaMarcha() {
        if (this.velocidadeAtual < 0) {
        return 1;
        } if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 45) {
        return 1;
        } if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 85) {
        return 2;
        } else {
        return 3;
        }
    }

}