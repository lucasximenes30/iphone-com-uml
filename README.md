classDiagram
direction TB
    class Iphone {
	    - modelo: String
	    - numeroSerie: String
    }

    class NavegadorInternet {
	    + exibirPagina(String url) :void
	    + adicionarNovaAba() : void
	    + atualizarPagina() : void
    }

    class ReprodutorMusical {
	    + tocar() : void
	    + pausar() : void
	    + selecionarMusica(String musica) :void
    }

    class AparelhoTelefonico {
	    + ligar(String numero) :void
	    + atender() : void
	    + atualizarPagina() : void
    }

	<<Class>> Iphone
	<<Interface>> NavegadorInternet
	<<Interface>> ReprodutorMusical
	<<Interface>> AparelhoTelefonico

    Iphone <|-- ReprodutorMusical
    Iphone <|-- NavegadorInternet
    Iphone <|-- AparelhoTelefonico
