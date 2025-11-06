package atividades;

public class triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    
    // Construtor
    public triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    // Getters e Setters
    public double getLado1() {
        return lado1;
    }
    
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    
    public double getLado2() {
        return lado2;
    }
    
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    public double getLado3() {
        return lado3;
    }
    
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    // Verifica se o triângulo é válido (condição de existência)
    public boolean isValido() {
        return (lado1 > 0 && lado2 > 0 && lado3 > 0) && 
               (lado1 + lado2 > lado3) && 
               (lado1 + lado3 > lado2) && 
               (lado2 + lado3 > lado1);
    }
    
    // Calcula o perímetro
    public double calcularPerimetro() {
        if (!isValido()) {
            return 0;
        }
        return lado1 + lado2 + lado3;
    }
    
    // Calcula a área usando a fórmula de Herão
    public double calcularArea() {
        if (!isValido()) {
            return 0;
        }
        double s = calcularPerimetro() / 2;  // semiperímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
    
    // Identifica o tipo do triângulo quanto aos lados
    public String identificarTipo() {
        if (!isValido()) {
            return "Triângulo inválido";
        }
        
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    
    // Calcula o ângulo oposto ao lado1 usando a lei dos cossenos
    public double calcularAngulo1() {
        if (!isValido()) {
            return 0;
        }
        return Math.toDegrees(Math.acos((lado2*lado2 + lado3*lado3 - lado1*lado1) / (2*lado2*lado3)));
    }
    
    // Calcula o ângulo oposto ao lado2 usando a lei dos cossenos
    public double calcularAngulo2() {
        if (!isValido()) {
            return 0;
        }
        return Math.toDegrees(Math.acos((lado1*lado1 + lado3*lado3 - lado2*lado2) / (2*lado1*lado3)));
    }
    
    // Calcula o ângulo oposto ao lado3 usando a lei dos cossenos
    public double calcularAngulo3() {
        if (!isValido()) {
            return 0;
        }
        return Math.toDegrees(Math.acos((lado1*lado1 + lado2*lado2 - lado3*lado3) / (2*lado1*lado2)));
    }
    
    // Identifica o tipo do triângulo quanto aos ângulos
    public String identificarTipoAngulos() {
        if (!isValido()) {
            return "Triângulo inválido";
        }
        
        double angulo1 = calcularAngulo1();
        double angulo2 = calcularAngulo2();
        double angulo3 = calcularAngulo3();
        
        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            return "Retângulo";
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            return "Obtusângulo";
        } else {
            return "Acutângulo";
        }
    }
    
    // Exibe todas as informações do triângulo
    public void exibirInformacoes() {
        if (!isValido()) {
            System.out.println("Triângulo inválido! Os lados não formam um triângulo.");
            return;
        }
        
        System.out.println("=== Informações do Triângulo ===");
        System.out.printf("Lados: %.2f, %.2f, %.2f%n", lado1, lado2, lado3);
        System.out.printf("Perímetro: %.2f%n", calcularPerimetro());
        System.out.printf("Área: %.2f%n", calcularArea());
        System.out.println("Tipo (lados): " + identificarTipo());
        System.out.println("Tipo (ângulos): " + identificarTipoAngulos());
        System.out.printf("Ângulos: %.2f°, %.2f°, %.2f°%n", 
                         calcularAngulo1(), calcularAngulo2(), calcularAngulo3());
    }
}
