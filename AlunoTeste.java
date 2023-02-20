import java.util.Random;
import java.util.Scanner;

public class AlunoTeste {

    public static int geraridade(){
        int idades;
        Random aleatorio = new Random();
        idades = aleatorio.nextInt(3)+10;
        return idades;
    }
    public static int[] gerarnotadisciplina(){
        int[] disciplina = new int[8];
        Random aleatorio = new Random();

        for(int i = 0; i < disciplina.length; i++)
        disciplina[i] = aleatorio.nextInt(100)+1;
        return disciplina;
    }
    
    public static void exibiralunos(Aluno alunos){
        System.out.printf("Nome:%s\nIdade:%d\nRegistro Academico:%d\n", alunos.getNome(), alunos.getIdade(), alunos.getRa());
        for(int j=0;j<8;j++)
        System.out.printf("Nota %d: %d   \n", j+1, alunos.getNotas(j));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ra=0;
        Aluno[] alunos = new Aluno[10]; 
        String[] nomes = {"Vinicius", "Maria", "Henrique", "Gustavo", "Arthur", "Joao", "Helder","Miguel", "Pedro", "Jackson"};
        for(int i=0;i<alunos.length;i++){
            ra ++;
            alunos[i] = new Aluno(nomes[i], geraridade(), ra, gerarnotadisciplina());
        }
        System.out.println();
        int saida = 1;
        
        do{
        System.out.printf("\nO que deseja fazer:\n1)Modificar aluno\n2)Consultar boletim\n3)Sair\n");
        int opc = input.nextInt();
        int i = 0;
        switch(opc){
            case 1:
            System.out.printf("\nO que deseja alterar\n1)Nome\n2)Idade\n3)Nota\n4)Voltar\n");
            int opc1 = input.nextInt();
            input.nextLine();

            switch(opc1){
                case 1:
                System.out.printf("De qual aluno: ");
                 i = input.nextInt();
                System.out.printf("%s\n", nomes[i-1]);
                input.nextLine();
                System.out.printf("Digite o novo nome: ");
                String nomenovo = input.nextLine();

                alunos[i-1].setNome(nomenovo);
                System.out.println();
                exibiralunos(alunos[i-1]);
                break;

                case 2:
                System.out.printf("De qual aluno:");
                 i = input.nextInt();
                System.out.printf("%d\n", alunos[i-1].getIdade());
                input.nextLine();
                System.out.printf("Digite a nova idade:");
                int novaidade = input.nextInt();
                alunos[i-1].setIdade(novaidade);
                exibiralunos(alunos[i-1]);
                break;

                case 3:
                System.out.printf("De qual aluno:");
                 i = input.nextInt();
                for(int j=0;j<8;j++)
                System.out.printf("Nota %d: %d\n", j+1, alunos[i].getNotas(j));
                System.out.printf("Qual nota:\n");
                int j = input.nextInt();
                System.out.printf("Nota %d: %d\n", j, alunos[i].getNotas(j-1));
                System.out.printf("Digite a nova nota:\n");
                int novanota = input.nextInt();
                alunos[i-1].setNotas(novanota, j-1);
                exibiralunos(alunos[i-1]);
                System.out.println();
                break;
                case 4:
                break;
            }
            break;

            case 2:
            System.out.printf("De qual aluno:");
            i = input.nextInt();
            exibiralunos(alunos[i-1]);
            System.out.println();
            break;

            case 3:
            System.out.printf("Fechando o programa");
            saida = 0;
            break;
        }
    }while(saida==1);


     }
 }