public class Principal {
    public static void main(String[] args) {
        menu(); // Chama o menu para torná-lo funcional
    }
    
    public static void exemploCC(){
        ContaCorrente cc1 = new ContaCorrente(500, "Leleo amoroso", 1230, 500);
    
        System.out.println(cc1);
    
        cc1.sacar(1200);
        cc1.sacar(500);
    
        System.out.println(cc1);
    
        cc1.sacar(600);
        cc1.sacar(500);
    
        System.out.println(cc1);
    
        cc1.sacar(1);
    
        System.out.println(cc1);
    
        cc1.depositar(750);
    
        System.out.println(cc1); 
    }

    public static void exemploCP(){
        ContaPoupanca cp1 = new ContaPoupanca(0.06f, 0,
                                             "Léo eng do amor", 5363, 10000);

        cp1.setTempoRendimento(10);
        cp1.sacar(20000);
        cp1.sacar(1200);

        System.out.println(cp1);
    }

    public static void menu() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1.Conta Corrente");
            System.out.println("2.Conta Poupança");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exemploCC();
                    break;
                case 2:
                    exemploCP();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}