public class principal {
    public static void main(String[] args) {
        tv tv = new tv();

        // adicionar canais (exemplo)
        tv.adicionarCanal(new canal(1, "Globo"));
        tv.adicionarCanal(new canal(2, "SBT"));
        tv.adicionarCanal(new canal(3, "Record"));
        tv.adicionarCanal(new canal(4, "Band"));
        tv.adicionarCanal(new canal(5, "CNN"));

        // exemplo de uso do sistema da TV sem interação:
        System.out.println("Estado inicial:");
        tv.infoTv();

        System.out.println();
        System.out.println("Ligando a TV e ajustando volume...");
        tv.ligarDesligar(); // liga
        tv.aumentarVolume();
        tv.aumentarVolume();

        System.out.println();
        System.out.println("Mudando para o canal 5 e avançando um canal...");
        tv.mudarCanal(5);
        tv.proximoCanal();

        System.out.println();
        System.out.println("Listando canais disponíveis:");
        tv.listaCanais();

        System.out.println();
        tv.infoTv();

        System.out.println();
        System.out.println("Desligando a TV...");
        tv.ligarDesligar(); // desliga
        System.out.println("Fim do demo.");
    }
}
