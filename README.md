# 🏦 Sistema Bancário em Java (POO)

Este projeto consiste em um **sistema bancário simples**, desenvolvido em **Java puro**, com o objetivo de **praticar Programação Orientada a Objetos (POO)** e **lógica de programação**, sem uso de frameworks.

O sistema simula operações básicas de um banco, como criação de contas, depósitos, saques, consulta de saldo e listagem de contas.

---

## 🎯 Objetivo do Projeto

* Fixar os conceitos fundamentais de **POO**:

    * Classes e objetos
    * Encapsulamento
    * Herança
    * Polimorfismo
* Praticar **CRUD** em memória
* Trabalhar com **menu interativo no terminal**

---

## 🛠️ Tecnologias Utilizadas

* **Java (Java SE)**
* Entrada de dados com **Scanner**
* Controle de dados em memória (List)
* Git e GitHub para versionamento

---

## 🧱 Estrutura do Projeto

```
sistema-bancario-java
│
├── model
│   ├── Cliente.java
│   ├── Conta.java
│   ├── ContaCorrente.java
│   ├── ContaPoupanca.java
│
├── service
│   ├── ClienteService.java
│   └── ContaService.java
│
├── menu
│   └── Menu.java
│
└── Main.java
```

---

## 📌 Funcionalidades Implementadas

### 👤 Cliente

* Cadastro de clientes
* Listagem de clientes

### 💳 Conta Bancária

* Criar conta corrente
* Criar conta poupança
* Depósito
* Saque
* Consulta de saldo
* Listagem de contas (mostrando tipo da conta)

---

## 🧠 Conceitos de POO Aplicados

### ✔ Encapsulamento

Atributos protegidos e acesso controlado por métodos `get`.

### ✔ Herança

* `ContaCorrente` e `ContaPoupanca` herdam de `Conta`

### ✔ Polimorfismo

* Uso de métodos abstratos como `getTipo()`

### ✔ Interface

* `OperacoesBancarias` define o contrato para operações bancárias

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:

```bash
git clone git@github.com:SEU_USUARIO/sistema-bancario-java.git
```

2. Acesse a pasta do projeto:

```bash
cd sistema-bancario-java
```

3. Compile os arquivos:

```bash
javac Main.java
```

4. Execute o programa:

```bash
java Main
```

---

## 📚 Observações

* O sistema utiliza **armazenamento em memória**, ou seja, os dados são perdidos ao encerrar o programa.
* Projeto desenvolvido exclusivamente para **fins educacionais**.

---

## 🚀 Próximas Melhorias (Ideias)

* Transferência entre contas
* Histórico de movimentações
* Login de cliente
* Persistência em arquivo ou banco de dados
* Testes unitários

---

## 👨‍💻 Autor

Projeto desenvolvido para estudo de **Programação Orientada a Objetos em Java**.

📌 Sinta-se à vontade para clonar, estudar e evoluir este projeto.
