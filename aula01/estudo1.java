import java.util.Scanner;

public class Estudo {
    private String materia;
    private String tarefa;
    private int duracaoHoras;

    public void registrarTarefa(String materia, String tarefa, int duracaoHoras) {
        this.materia = materia;
        this.tarefa = tarefa;
        this.duracaoHoras = duracaoHoras;
    }

    public void mostrarTarefa() {
        System.out.println("Tarefa Registrada");
        System.out.println("Matéria: " + materia);
        System.out.println("Tarefa: " + tarefa);
        System.out.println("Duração prevista (horas): " + duracaoHoras);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudo minhaTarefa = new Estudo();

        System.out.println("Bem-vindo ao Organizador de Estudos!");

        System.out.print("Digite a matéria: ");
        String materia = scanner.nextLine();

        System.out.print("Digite a tarefa: ");
        String tarefa = scanner.nextLine();

        System.out.print("Digite a duração prevista (em horas): ");
        int duracao = scanner.nextInt();

        minhaTarefa.registrarTarefa(materia, tarefa, duracao);
        minhaTarefa.mostrarTarefa();

        scanner.close();
    }
}
