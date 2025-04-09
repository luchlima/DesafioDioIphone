public class Main {
    public static void main(String[] args) {
        Musical musical = new Musical();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorInternet navegadorInternet = new NavegadorInternet();

        System.out.println(musical.tocar());
        System.out.println(musical.pausar());
        System.out.println(musical.selecionarMusica("Nobody Knows"));

        System.out.println(aparelhoTelefonico.ligar("232442424"));
        System.out.println(aparelhoTelefonico.atender());
        System.out.println(aparelhoTelefonico.iniciarCorreioVoz());

        System.out.println(navegadorInternet.exibirPagina("dio.com.br"));
        System.out.println(navegadorInternet.adicionarNovaAba());
        System.out.println(navegadorInternet.atualizarPagina());
    }
}