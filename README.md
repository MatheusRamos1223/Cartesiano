# Cartesiano (Plano Cartesiano em Java)

Projeto de estudo em Programação Orientada a Objetos (POO) usando Java.
Permite criar pontos nomeados no plano cartesiano e operar sobre eles via menu no console.

## Funcionalidades
- Criar coordenadas nomeadas
- Trocar coordenada atual
- Listar coordenadas cadastradas
- Deslocar e escalar coordenadas
- Calcular distância entre dois pontos
- Origem fixa e imutável (0,0)
- Remoção de coordenadas (exceto a origem)

## Conceitos de Programação Orientada a Objetos aplicados

Este projeto foi desenvolvido com foco em praticar conceitos fundamentais de POO em Java:

- **Herança**
  - `PontoNomeado` herda de `Ponto`
  - `PontoOrigem` herda de `PontoNomeado`

- **Polimorfismo**
  - A classe `PontoOrigem` sobrescreve métodos para impedir alteração da origem.

- **Sobrecarga de métodos**
  - `distance()`
  - `distance(Ponto pt)`
  - `distance(double x, double y)`

- **Encapsulamento**
  - A lista de pontos é controlada pelo `PontosRepositorio`.

- **Uso de Iterator**
  - Utilizado para remover elementos da lista com segurança.

- **Objeto especial imutável**
  - A origem `(0,0)` é representada por um objeto fixo (`PontoOrigem`) que não pode ser modificado ou removido.

## Como executar
1. Compile e execute a classe `PlanoCartesiano`
2. Use o menu no console para criar e manipular coordenadas

## Próximos passos
- Se Deus quiser implementar um sistema simples de rota entre pontos (ex.: sequência de pontos e cálculo de distância total)

## Autor
Ramos
