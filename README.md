# Entendendo Java

<div align="center">

![image](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

</div>



## Hello World

A linguagem de programação Java é baseada em classes. Na qual, a partir das classes, pode-se criar objetos (instâncias das classes).

A seguir vemos um exemplo de código em Java.

```java
class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Para rodar scripts em Java, deve-se ter instalado o Java JDK (Java Develoment Kit) na máquina. É importante destacar que o nome da classe deve ser idêntica ao nome do arquivo.

Para compilar o código acima, deve-se digitar o seguinte comando no terminal:

```
javac HelloWorld.java
```

Em seguida, deve-se executar o programa, digitando o seguinte comando:

```
java HelloWorld
```

Assim, após a execução do programa, é esperado que imprima ```Hello, World!``` no terminal.

O método ```main``` é um método especial responsável por executar tudo que está em seu escopo.

A seguir temos os seguintes alguns nomes que acompanham o método ```main```:

- ```public```: modificador de acesso, na qual qual um pode acessar o método ```main```;
- ```static```: significa que o método pertence a classe e não está associado a nenhuma outra instância da classe;
- ```void```: indica que o método é uma função que não retorna valor.

O nome de um método junto com a lista de parâmetros é chamado de ```Assinatura do método```. Enquanto a Assinatura, os modificadores de acesso, o tipo de retorno e as exceções são o ```Cabeçalho do método```.

![Cabeçalho e Assinatura](./img/cabecalho.png)

Após declaração corretamente o cabeçalho, temos o bloco de comando ```System.out.println("Hello, World!");``` que imprime "Hello, World!".