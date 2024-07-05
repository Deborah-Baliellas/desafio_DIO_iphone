package smartphone;

import funcionalidades.ReprodutorMusical;
import smartphone.SmartPhone;
import funcionalidades.AparelhoTelefonico;
import funcionalidades.Navegador;

public class IPhone {
    public static void main(String[] args) throws Exception {
        IPhone iphone = new IPhone();
        SmartPhone smartPhone = new SmartPhone();
        
        System.out.println("Iniciando o reprodutor do iPhone...");
        smartPhone.tocar();
        smartPhone.selecionarMusica();
        smartPhone.pausar();
        System.out.println(" ");
        
        System.out.println("Abrindo o navegador de internet do iPhone...");
        smartPhone.exibirPagina();
        smartPhone.adicionarNovaAba();
        smartPhone.atualizarPagina();
        System.out.println(" ");

        System.out.println("Acessando o telefone...");
        smartPhone.atender();
        smartPhone.iniciarCorreioVoz();
        smartPhone.ligar();

    }

}
