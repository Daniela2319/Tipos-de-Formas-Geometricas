package FormaGeometrica;

public class MainAreaEPerimetro {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.calcularArea(10);
        double area = circulo.retornaArea();
        circulo.calcularPerimetro(5);
        double perimetro = circulo.retornaPerimetro();
        System.out.println("Calculando Aréa e o Perimetro do Círculo");
        System.out.println("A aréa do Circulo é: " + area + " e o perimetro é: " + perimetro);
        System.out.println("*********************************************");

        Quadrado quadrado = new Quadrado();
        quadrado.calcularArea(10);
        area = quadrado.retornaArea();
        quadrado.calcularPerimetro(10);
        perimetro = quadrado.retornaPerimetro();
        System.out.println("Calculando Area e o Perimetro do Quadrado");
        System.out.println("A area é: " + area + " e o perimetro é: " + perimetro);
        System.out.println("*********************************************");

        Triangulo triangulo = new Triangulo();
        triangulo.calcularArea(10,20);
        area = triangulo.retornaArea();
        triangulo.calcularPerimetro(10, 20, 30);
        perimetro = triangulo.retornaPerimetro();
        System.out.println("Calcular Area e o Perimetro do Triangulo");
        System.out.println("A area é: " + area + " e o Perimetro é: " + perimetro);
        System.out.println("**********************************************");

        Retangulo retangulo = new Retangulo();
        retangulo.calcularArea(30, 40);
        area = retangulo.retornaArea();
        retangulo.calcularPerimetro(30,40);
        perimetro = retangulo.retornaPerimetro();
        System.out.println("Calcular Area e o Perimetro do Retangulo");
        System.out.println("A area é: " + area + " e o Perimetro é: " + perimetro);


    }
}
