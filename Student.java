package ExercicioDeFixacaoEstudante;

    class Student {
        String nome;
        private final double nota1;
        private final double nota2;
        private final double nota3;


        public Student(String nome, double nota1, double nota2, double nota3){
            this.nome = nome;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

        public double calcularNotaFinal() {
            return (nota1 * 30 / 100) + (nota2 * 35 / 100) + (nota3 * 35 / 100);
        }

        public boolean estaAprovado () {
            return calcularNotaFinal() >= 60;
        }

        public double pontoFaltado () {
            double notaFinal = calcularNotaFinal();
            return (notaFinal < 60) ? 60 - notaFinal : 0;
        }

        public String getNome () {
            return nome;
        }

    }

