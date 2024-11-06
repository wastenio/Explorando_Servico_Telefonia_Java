import java.util.Scanner;

public class Concessionaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Primeira linha de entrada: nome do serviço a ser verificado
        String servico = scanner.nextLine();
        
        // Segunda linha de entrada: nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine();
        
        // Separando a entrada do cliente usando vírgulas
        String[] dadosCliente = entradaCliente.split(",");
        
        // O primeiro elemento é o nome do cliente
        String nomeCliente = dadosCliente[0];
        
        // Os serviços contratados estão no restante do array
        boolean servicoContratado = false;
        
        // Verificando se o serviço está entre os contratados
        for (int i = 1; i < dadosCliente.length; i++) {
            if (dadosCliente[i].equals(servico)) {
                servicoContratado = true;
                break;
            }
        }
        
        // Imprimir a resposta
        if (servicoContratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

        scanner.close();
    }
}
