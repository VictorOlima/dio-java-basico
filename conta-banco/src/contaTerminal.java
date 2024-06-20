import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Todo conhecer e importar a classe scanner
        Scanner sc = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o numero da conta");
        // Obter pelo scanner os valores digitados no terminal
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o numero da agencia");
        String agencia = sc.next();

        System.out.println("Por favor, digite o Nome ");
        String cliente = sc.next();
        
        System.out.println("Por favor, digite o Saldo");
        double saldo = sc.nextDouble();
        sc.nextLine();
        // Exibir a mensagem conta criada
        System.out.print("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + 
        " e seu saldo , " + saldo + " já está disponível para saque");
        sc.close();      

    }
}
