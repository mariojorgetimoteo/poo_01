
package introducao_poo;

public class Ponto {

    // Meus atributos, da classe Ponto
    public double xa;
    public double xb;
    public double ya;
    public double yb;
    public double xr;
    public double yr;
    public double xr_2;
    public double yr_2;
    public double soma;
    public double result;
    public Ponto segundoPonto;

    // Meus construtor
    public Ponto(double xa, double ya) {
        this.xa = xa;
        // this.xb = xb;
        this.ya = ya;
        // this.yb = yb;
    }

    // Meu método especial, fazer o calculo, chamando o objeto
    public void calculo(Ponto segundoPonto) {

        // referenciar os valores digitados no p2.
        this.xb = segundoPonto.xb;
        this.xa = segundoPonto.xa;

        // passo 1 (subtrair)
        xr = xb - xa;
        yr = yb - ya;
        // passo 2 (elevar ao quadrado)
        xr_2 = xr * xr;
        yr_2 = yr * yr;
        // passo 3 (somar)
        soma = xr_2 + yr_2;
        // passo 4 (tirar a raiz)
        result = Math.sqrt(soma);
        // passo 5 (imprimir)
        System.out.println(result);
    }

}