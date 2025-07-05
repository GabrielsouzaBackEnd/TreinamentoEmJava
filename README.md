# TreinamentoEmJava
# 🎬 Simulador de Streaming em Java

Este é um projeto de simulação de um **aplicativo de streaming**, desenvolvido em Java, com foco no uso de **Programação Orientada a Objetos (POO)**. O sistema permite gerenciar e simular o consumo de conteúdos como **filmes, séries, músicas e podcasts**, além de implementar funcionalidades como **classificação, recomendação e cálculo de tempo total de exibição**.

---

## 🧩 Organização do Projeto

O projeto está dividido em três pacotes principais:

### 📁 `modelos/`
Contém as classes principais de mídia audiovisual:

- `Titulo` — Classe base para conteúdos de vídeo
- `Filme` — Representa um filme com diretor e duração
- `Serie` — Representa uma série com temporadas, episódios e status
- `Episodio` — Representa um episódio dentro de uma série

### 📁 `audio/`
Agrupa as classes de conteúdo em áudio:

- `Audio` — Classe genérica de áudio
- `Musica` — Subclasse para músicas (com cantor e gênero)
- `Podcast` — Subclasse para podcasts (com tema e apresentador)

### 📁 `util/`
Contém funcionalidades auxiliares:

- `CalculadoraDeTempo` — Soma o tempo total de consumo de mídia
- `FiltroRecomendacao` — Sugere conteúdos com base em classificações

---

## 🚀 Funcionalidades

- 🎵 Reproduzir, curtir e classificar músicas e podcasts
- 🎬 Exibir ficha técnica de filmes e séries
- 🕒 Calcular tempo total de reprodução com base nos títulos assistidos
- 🌟 Sistema de recomendação simples com base na classificação do conteúdo
- 📦 Estrutura modular e de fácil expansão

---

## 💡 Exemplo de Uso

```java
Musica musica = new Musica();
musica.setTitulo("Imagine");
musica.setCantor("John Lennon");
musica.curte();
musica.reproduz();
System.out.println("Classificação: " + musica.getClassificacao());

Filme filme = new Filme();
filme.setNome("A Origem");
filme.setDuracaoEmMinutos(148);
filme.setDiretor("Christopher Nolan");

CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
calculadora.inclui(filme);
calculadora.inclui(musica);

System.out.println("Tempo total: " + calculadora.getTempoTotal() + " minutos");
