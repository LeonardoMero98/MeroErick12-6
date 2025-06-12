package figurasGeometricas;

public class Cuadrado extends Figura {
    public Cuadrado(double valor1){
        super(valor1);
    }

    @Override
    public double getArea(){
        return this.valor1 * this.valor1;
    }

    @Override
    public double getPerimetro(){
        return this.valor1 * 4;
    }
}