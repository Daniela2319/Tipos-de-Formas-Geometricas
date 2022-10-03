package FormaGeometrica;

public class Circulo extends FormaGeometria {

    public void calcularArea(double raio){
        area = 3.14 * raio * raio;
    }
    public void calcularPerimetro(double raio){
        perimetro = 3.14 * raio;
    }
}
