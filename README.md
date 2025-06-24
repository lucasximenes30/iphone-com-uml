# [DIO](www.dio.me) - Trilha Java Básico

## Autores
- [Gleyson Sampaio](https://github.com/glysns)

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

### Diagrama UML (Mermaid)
```mermaid
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

```
