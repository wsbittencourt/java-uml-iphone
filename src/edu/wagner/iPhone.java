package edu.wagner;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musica;
    private String ligacao;
    private String paginaAtual;

    @Override
    public void tocar() {
      System.out.println("Tocar música");
    }

    @Override
    public void pausar() {
      System.out.println("Pausar música");
    }

    @Override
    public void selecionarMusica(String musica) {
      System.out.println("Selecionar música");
    }

    @Override
    public void ligar(String numero) {
      System.out.println("Fazer ligação");
    }

    @Override
    public void atender() {
      System.out.println("Atender ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
      System.out.println("Iniciar correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
      System.out.println("Exibir página web");
    }

    @Override
    public void adicionarNovaAba() {
      System.out.println("Adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
      System.out.println("Atualizar página web");
    }
}

