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

## Conceitos de POO aplicados
- Herança: `PontoNomeado extends Ponto`
- Sobrecarga: `distance()`, `distance(Ponto)`, `distance(double, double)`
- Polimorfismo: regras diferentes na origem via `PontoOrigem`
- Encapsulamento: repositório controla a coleção e protege a origem

## Como executar
1. Compile e execute a classe `PlanoCartesiano`
2. Use o menu no console para criar e manipular coordenadas

## Próximos passos
- Implementar um sistema simples de rota entre pontos (ex.: sequência de pontos e cálculo de distância total)

## Autor
Ramos
