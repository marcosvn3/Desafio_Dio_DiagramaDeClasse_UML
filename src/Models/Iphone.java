package Models;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    private List<Musica>musicas;
    private List<Contato>agenda;
    private Boolean internet;

    public Iphone( Boolean internet) {
        this.musicas = new ArrayList<>();
        this.agenda = new ArrayList<>();
        this.internet = internet;
    }



    @Override
    public void tocar() {
        System.out.println("Tocando musica: " );
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolhar uma musica...");
    }


    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz ativo...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Pagina sendo exibida... ");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova pagina adicionada...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }
}
