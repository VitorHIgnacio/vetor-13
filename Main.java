import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);



    int linha = 12;
    int coluna = 4;
    int mes = 0;
    int ano =0;

    int matriz[][] = new int[linha][coluna];
    int vetor[] = new int[linha];



    System.out.println("\n\n:::Receber Matriz:::\n");

    for (int l = 0; l < linha; l++) {// recebe matriz
      for (int c = 0; c < coluna; c++) {
        System.out.print("Digite a venda do mês " + (l + 1) + " da semena " + (c + 1) + ":");
        matriz[l][c] = leitor.nextInt();
      }
    }



    for (int l = 0; l < linha; l++) {// imprimi vetor
      for (int c = 0; c < coluna; c++) {
        System.out.print("|" + matriz[l][c] + "|\t");
      }
      System.out.println();
    }



    for (int l = 0; l < linha; l++) {// soma dos meses
      for (int c = 0; c < coluna; c++) {
        vetor[l] = matriz[l][c] + vetor[l];
        

      }
    }


    for (int l = 0; l < linha; l++) {// total ano
      ano = vetor[l] + ano;
   }
   



    System.out.println("\n\n:::Total de venda no ano::: "+ano+"R$");

    System.out.println("\n:::Digite o número do mês que deseja saber o valor ou digite 0 para sair:::");

    do {//Saida
      mes = leitor.nextInt();
      System.out.println("\n\n");
      switch (mes) {

        case 1:
          System.out.print("Total de vendas no mês de janeiro");
          break;

        case 2:
          System.out.print("Total de vendas no mês de fevereiro");
          break;

        case 3:
          System.out.print("Total de vendas no mês de março");
          break;

        case 4:
          System.out.print("Total de vendas no mês de abril");
          break;

        case 5:
          System.out.print("Total de vendas no mês de maio");
          break;

        case 6:
          System.out.print("Total de vendas no mês de junho");
          break;

        case 7:
          System.out.print("Total de vendas no mês de julho");
          break;

        case 8:
          System.out.print("Total de vendas no mês de agosto");
          break;

        case 9:
          System.out.print("Total de vendas no mês de setembro");
          break;

        case 10:
          System.out.print("Total de vendas no mês de outubro");
          break;

        case 11:
          System.out.print("Total de vendas no mês de novembro");
          break;

        case 12:
          System.out.print("Total de vendas no mês de dezembro");
          break;

      }
      
      System.out.println(" foi: " + vetor[mes-1] + "R$");
      System.out.print("E suas vendas por semana nesse mês foram :");

      for (int i = 0; i < 4; i++) {
        System.out.print("|" + matriz[mes - 1][i] + "R$|");
      }


      System.out.println("\n\n_||Se deseja sair aperte 0|| ou para ||continuar digite mês um válido||_ \n\n\n");



    } while (mes != 0);

  }
}