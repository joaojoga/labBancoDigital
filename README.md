# Banco Digital

Este é um projeto de um sistema bancário digital desenvolvido em Java, utilizando conceitos de Programação Orientada a Objetos (POO). O sistema permite a criação de contas, realização de transações bancárias e impressão de extratos.

## Tecnologias Utilizadas
- **Java 17**
- **Paradigma Orientado a Objetos**
- **Herança e Polimorfismo**

## Estrutura do Projeto

O projeto está organizado da seguinte maneira:

```
├── src/
│   ├── Conta.java (classe abstrata base para as contas)
│   ├── ContaCorrente.java (extende Conta, representa uma conta corrente)
│   ├── ContaPoupanca.java (extende Conta, representa uma conta poupança)
│   ├── Cliente.java (representa um cliente do banco)
│   ├── IConta.java (interface que define os métodos das contas)
│   ├── Banco.java (classe principal que gerencia as contas e clientes)
│   ├── Main.java (classe principal que executa o sistema)
```

## Funcionalidades
- Criar contas bancárias (Conta Corrente e Conta Poupança).
- Realizar operações bancárias como saque, depósito e transferência entre contas.
- Gerar extrato bancário com informações do cliente, número da conta e saldo.

## Como Executar o Projeto
1. Certifique-se de ter o **Java 17** instalado.
2. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/banco-digital.git
   ```
3. Acesse a pasta do projeto:
   ```sh
   cd banco-digital
   ```
4. Compile o projeto:
   ```sh
   javac src/*.java
   ```
5. Execute o programa:
   ```sh
   java src.Main
   ```

## Exemplo de Uso

```java
Cliente cliente = new Cliente("João");
Conta contaCorrente = new ContaCorrente(cliente);
contaCorrente.depositar(1000);
contaCorrente.sacar(200);
contaCorrente.imprimirExtrato();
```

Saída esperada:
```
=== Extrato da Conta Corrente ===
Titular: João
Agência: 1
Número: 1
Saldo: 800.00
```

## Contribuição
Se você quiser contribuir, fique à vontade para abrir um Pull Request ou relatar problemas na aba de issues.


