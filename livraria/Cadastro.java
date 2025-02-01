import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Livro livro1 = new Livro();

        Autor autor1 = new Autor();

        
    
        // Entrada de dados com Scanner
        // System.out.println("Digite o nome do livro: ");
        // livro1.nome = input.nextLine();

        // System.out.println("Digite a descricao do livro: ");
        // livro1.descricao = input.nextLine();

        // System.out.println("Digite o isbn do livro: ");
        // livro1.isbn = input.nextLine();

        // System.out.println("Digite o valor do livro: ");
        // livro1.valor = input.nextDouble();

        //Dados fixado em código
        // livro1.nome = "Olha o Livro 1 ai!";
        // livro1.descricao = "Um livro ai pra tu ver";
        // livro1.isbn = "100-200-3000";
        // livro1.valor = 199.90;
        livro1.aplicaDesconto(0.5);
        // livro1.mostrarDados();

        livro1.autor = autor1;
        livro1.autor.nome = "K1";
        livro1.autor.email = "kauan.santos@discente.ufma.br";
        livro1.autor.cpf = "123.456.789-0000";
        livro1.mostrarDados();

        // Livro livro2 = new Livro();
        // Autor autor2 = new Autor();

        // livro2.nome = "Livro 2";
        // livro2.descricao = "aaaaaaaaaaaaaaaa";
        // livro2.isbn = "220-300-4000";
        // livro2.valor = 20.00;
        // // livro2.mostrarDados();
        // livro2.aplicaDesconto(0.5);

        // livro2.autor = autor2;
        // livro2.autor.nome = "K1";
        // livro2.autor.email = "kauan.santos@discente.ufma.br";
        // livro2.autor.cpf = "123.456.789-0000";
        // livro2.mostrarDados();
     
        // if(autor1 == autor2){
        //     System.out.println("Iguais!");
        // } else System.out.println("Diferentes!");
    }
}
