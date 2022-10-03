package FormaGeometrica;

public class Retangulo extends FormaGeometria {

    public void calcularArea(double ladoA, double ladoB){
        area = ladoA * ladoB;
    }
    public void calcularPerimetro(double ladaA, double ladoB){
        perimetro = 2 * ladaA + 2 * ladoB;
    }
}
