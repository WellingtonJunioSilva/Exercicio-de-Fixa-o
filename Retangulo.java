package ExercicioFixacaoRetangulo;

    class Retangulo {
        private double largura;
        private double altura;

        // Construtor da classe Retangulo
        public Retangulo(double largura, double altura) {
            this.largura = largura;
            this.altura = altura;
        }

        // Método para calcular a área do retângulo

        public double calcularArea() {
            return largura * altura;
        }

        // Método para calcular o perímetro do retângulo
        public double calcularPerimetro() {
            return 2 * (largura + altura);
        }

        // Método para calcular a diagonal do retângulo
        public double calcularDiagonal() {
            return Math.sqrt(largura * largura + altura * altura);
        }
    }

