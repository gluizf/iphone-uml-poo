// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe que representa o iPhone
class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos da interface ReprodutorMusical
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Pausando música...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    public void ligar() {
        System.out.println("Ligando para um número...");
    }

    public void atender() {
        System.out.println("Atendendo uma chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos da interface NavegadorInternet
    public void exibirPagina() {
        System.out.println("Exibindo página na Internet...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página na Internet...");
    }
}

// Classe principal para testar o iPhone
public class Interface {
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

        // Testando os diferentes comportamentos do iPhone
        System.out.println("### Reprodutor Musical ###");
        meuiPhone.tocar();
        meuiPhone.pausar();
        meuiPhone.selecionarMusica();

        System.out.println("\n### Aparelho Telefônico ###");
        meuiPhone.ligar();
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        System.out.println("\n### Navegador na Internet ###");
        meuiPhone.exibirPagina();
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}

