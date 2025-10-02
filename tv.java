
import java.util.ArrayList;


public class tv {
    private boolean ligada;
    private int volume; 
    private canal canalAtual;
    private ArrayList<canal> listaCanais;

    public tv() {
        this.ligada = false;
        this.volume = 10; 
        this.listaCanais = new ArrayList<>();
        this.canalAtual = null;
    }
    public void adicionarCanal(canal canal) {
        listaCanais.add(canal);
        if (canalAtual == null) {
            canalAtual = canal;
        }
    }

    public void ligarDesligar() {
        ligada = !ligada;
        System.out.println("TV " + (ligada ? "ligada" : "desligada"));
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
            System.out.println("Volume: " + volume);
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
            System.out.println("Volume: " + volume);
        }
    }

    public void mudarCanal(int numero) {
        if (ligada) {
            for (canal c : listaCanais) {
                if (c.getNumero() == numero) {
                    canalAtual = c;
                    System.out.println("Canal atual: " + canalAtual);
                    return;
                }
            }
            System.out.println("Canal " + numero + " n\u00e3o encontrado.");
        }
    }

    public void proximoCanal() {
        if (ligada && !listaCanais.isEmpty() && canalAtual != null) {
            int index = listaCanais.indexOf(canalAtual);
            index = (index + 1) % listaCanais.size();
            canalAtual = listaCanais.get(index);
            System.out.println("Canal atual: " + canalAtual);
        }
    }

    public void canalAnterior() {
        if (ligada && !listaCanais.isEmpty() && canalAtual != null) {
            int index = listaCanais.indexOf(canalAtual);
            index = (index - 1 + listaCanais.size()) % listaCanais.size();
            canalAtual = listaCanais.get(index);
            System.out.println("Canal atual: " + canalAtual);
        }
    }

    public void listaCanais(){
        if(ligada){
            System.out.println("Canais disponíveis:");
            for(canal c : listaCanais){
                System.out.println(c);
            }
        }
    }
    public void infoTv(){
        System.out.println("TV está " + (ligada ? "ligada" : "desligada"));
        System.out.println("Volume: " + volume);
        System.out.println("Canal atual: " + (canalAtual != null ? canalAtual : "Nenhum canal selecionado"));
    }
    
}
