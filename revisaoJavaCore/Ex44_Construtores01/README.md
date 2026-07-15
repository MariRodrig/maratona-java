# Exercício 44 - Conta Bancária

## Objetivo

Desenvolver um sistema simples de cadastro de conta bancária utilizando os conceitos de Programação Orientada a Objetos em Java.

## Requisitos

O sistema deve permitir cadastrar uma conta bancária informando:

- Número da conta
- Nome do titular
- Depósito inicial (opcional)

Caso o usuário não informe um depósito inicial, a conta deverá ser criada com saldo igual a **0.00**.

## Regras de Negócio

- O número da conta não poderá ser alterado após o cadastro.
- O nome do titular poderá ser alterado.
- O saldo não poderá ser alterado diretamente.
- O saldo deverá ser atualizado apenas pelos métodos:
    - Depósito
    - Saque
- Cada saque deverá descontar uma taxa fixa de **R$ 5,00**.
- A conta poderá ficar com saldo negativo caso não haja saldo suficiente para realizar o saque e pagar a taxa.

## Funcionalidades

- Cadastro da conta bancária
- Escolha de depósito inicial
- Realização de depósitos
- Realização de saques
- Exibição dos dados da conta após cada operação

## Estrutura

### Classe `ContaBancaria`

Atributos:

- Número da conta
- Nome do titular
- Saldo

Métodos:

- Construtor sem depósito inicial
- Construtor com depósito inicial
- Método `deposito()`
- Método `saque()`
- Getters
- Setter apenas para o nome
- Sobrescrita do método `toString()`

## Conceitos praticados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Sobrecarga de construtores
- Métodos
- Getters e Setter
- Scanner
- Estruturas condicionais (`if/else`)
- Sobrescrita do método `toString()`
- Criação e manipulação de objetos
- Escopo de variáveis

## Aprendizados

Durante este exercício pratiquei:

- Proteção dos atributos utilizando encapsulamento.
- Utilização de construtores sobrecarregados para permitir cadastro com ou sem depósito inicial.
- Manipulação do saldo apenas através de métodos da classe.
- Sobrescrita do método `toString()` para exibição personalizada dos dados da conta.
- Entrada de dados utilizando a classe `Scanner`.