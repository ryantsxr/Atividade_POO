package atividades;

public class quadrado {
    private double lado;
    
    // Construtor
    public quadrado(double lado) {
        this.lado = lado;
    }
    
    // Getters e Setters
    public double getLado() {
        return lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    // Método para calcular área
    public double calcularArea() {
        return lado * lado;
    }
    
    // Método para calcular perímetro
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    // Método para calcular diagonal
    public double calcularDiagonal() {
        return Math.sqrt(2) * lado;
    }
    
    // Método para verificar se é um quadrado válido
    public boolean isValido() {
        return lado > 0;
    }
    
    // Método para exibir informações do quadrado
    public void exibirInformacoes() {
        if (isValido()) {
            System.out.println("=== Informações do Quadrado ===");
            System.out.println("Lado: " + lado);
            System.out.printf("Área: %.2f%n", calcularArea());
            System.out.printf("Perímetro: %.2f%n", calcularPerimetro());
            System.out.printf("Diagonal: %.2f%n", calcularDiagonal());
        } else {
            System.out.println("Quadrado inválido! O lado deve ser maior que zero.");
        }
    }
}
