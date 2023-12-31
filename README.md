# Tela de Login TDD

## Descrição

Classe de login para autenticação com simulação de consulta no banco de dados. Testes desenvolvidos utilizando a JUnit 5.

## Funcionalidades 

A classe ```TelaDeLogin``` possuí os seguintes métodos:
- ```public TelaDeLogin()```: Método construtor. Inicializa uma nova instância LoginScreen e inicializa o banco de dados do usuário.
- ```public boolean login(String username, String password)```: Realiza a consulta das credenciais informadas no banco de dados.
- ```public void addUser(String username, String password)```: Adiciona um novo usuário ao banco de dados.

## Requisitos

Para a utilização do projeto e a realização de seus testes são necessários alguns requisitos:
- Possuir Java instalado em sua máquina
- Possuir Maven instalado em sua máquina

## Testes 

Para garantir o correto funcionamento da classe, foram criados testes unitários automatizados utilizando a biblioteca de testes unitários JUnit 5.

## Como executar
- Clonar este repositório:
```
git clone https://github.com/mateusmaranhaogit/TelaDeLoginTDD.git
```
- Clonar este repositório:
```
mvn test
```
