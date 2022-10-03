package FormaGeometrica;

public class Triangulo extends FormaGeometria {

    public void calcularArea( double base, double altura){
        area = (base * altura) / 2;
    }
    public void calcularPerimetro(double lado1, double lado2, double lado3){
        perimetro = lado1 + lado2 + lado3;
    }
}
