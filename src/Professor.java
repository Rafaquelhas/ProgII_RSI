public class Professor {
    private String nome;
    private int idade;
    private String tipo;

    public Professor(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = validarTipo(tipo);
    }

    public Professor(String nome, int idade) {
        this(nome, idade, "integral");
    }

    private String validarTipo(String tipo) {
        if (tipo.equals("parcial") || tipo.equals("integral") || tipo.equals("exclusivo")) {
            return tipo;
        }
        return "integral";
    }


    public void mostrarInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Tipo: " + tipo);
    }

    public static void main(String[] args) {
        Professor prof1 = new Professor("Carlos Silva", 40, "exclusivo");
        Professor prof2 = new Professor("Ana Sousa", 35);

        prof1.mostrarInfo();
        prof2.mostrarInfo();
    }
}
