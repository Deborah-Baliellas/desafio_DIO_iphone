package smartphone;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.Navegador;
import funcionalidades.ReprodutorMusical;

public class SmartPhone implements AparelhoTelefonico, ReprodutorMusical, Navegador {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página de internet.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba criada no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da internet.");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecinando música.");
    }

    @Override
    public void ligar() {
        System.out.println("Efetuando ligação...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Verificando correio de Voz.");
    }

}
