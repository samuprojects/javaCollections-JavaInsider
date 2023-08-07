package arrays;

@SuppressWarnings("ALL")
public class CmdLineArgsApp {

    // é possível passar parametros pela linha de comando que são capturadas pelo famoso main(String[] args)
    public static void main(String[] args) {
        // para isso no terminal podemos, por exemplo, digitar java arrays.CmdLineArgsApp a b c d
        // após isso na ide se incluirmos para imprimir no console e rodar novamente poderá observar a passagem e impressãona tela
        System.out.println(args);

        // para inserir pela IDE intellij basta clicar no nome da classe ao lado do botão de execução e Edit configuration
        // abaixo da info do java SDK tem a caixa para inserção dos argumentos
    }
}
