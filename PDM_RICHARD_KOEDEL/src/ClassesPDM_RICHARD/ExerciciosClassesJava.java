package ClassesPDM_RICHARD;

public class ExerciciosClassesJava {

    public static void main(String[] args) {
        Automovel meuAuto = new Automovel();
        meuAuto.setCor("Azul");
        meuAuto.setModelo("Volvo");
        meuAuto.setVelocidadeAtual(0);
        meuAuto.setVelocidadeMaxima(80);
        
        meuAuto.liga();
        
        meuAuto.acelera(45);
        System.out.println(meuAuto.getVelocidadeAtual());
        meuAuto.acelera(45);
        System.out.println(meuAuto.getVelocidadeAtual());
        
        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.setCor = "Pérola";
        meuCarro.setModelo = "Camaro";
        meuCarro.setVelocidadeAtual = 0;
        meuCarro.setVelocidadeMaxima = 100;

        //Liga o carro
        meuCarro.ligaCarro(2);

        //Acelera o carro
        meuCarro.acelera(20);
        System.out.println(meuCarro.velocidadeAtual);

        //Obtém marcha do carro
        int marcha = meuCarro.pegaMarcha();

        Moto minhaMoto;
        minhaMoto= new Moto();
        minhaMoto.setCor = "vermelho";
        minhaMoto.setModelo = "Yamaha";
        minhaMoto.setVelocidadeAtual = 0;
        minhaMoto.setVelocidadeMaxima = 70;

        //Liga a moto
        minhaMoto.liga();

        //Acelera a moto
        minhaMoto.acelera(90);
        System.out.println(minhaMoto.velocidadeAtual);

        //Verifica estado da corrente
        minhaMoto.imprimirEstadoMotor(3);
        
    }
}