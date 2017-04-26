package ClassesPDM_RICHARD;

public class Automovel {
private String cor;
private String modelo;
double velocidadeAtual;
private double velocidadeMaxima;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //Liga o automóvel
    public void liga() {
    System.out.println("O automóvel está ligado: ");
    }

    //Acelera uma certa quantidade
    public void acelera(double quantidade) {
    double velocidadeNova = this.velocidadeAtual + quantidade;
    this.velocidadeAtual = velocidadeNova;
    }
}