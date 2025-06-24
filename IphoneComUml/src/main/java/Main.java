public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone("iPhone 15 Pro", "ABC123456");

        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("11999998888");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

    }
}
