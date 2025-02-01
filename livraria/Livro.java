public class Livro {
    String nome;
    String descricao;
    String isbn;
    double valor;
    Autor autor; // Chama classe autor

    void mostrarDados(){
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Isbn: " + isbn);
        System.out.println("Valor: " + valor);
        autor.mostrarDadosAutor();
    }

    void aplicaDesconto(double porcentagem){
        this.valor = this.valor - (this.valor*porcentagem); // this referencia valor da classe
    }
}
