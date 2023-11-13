# Gerencia Users
Backend criado para cadastro e gerenciamento de usuários.


## Diagrama de Classes
```mermaid
classDiagram
    class User {
        - id: Long
        - nome: String
        - senha: String
        - email: String
        - dataDeCriacao: LocalDate
    }
```


## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Lombok
- Postgres SQL (Prod)
- H2 (Dev)
- Imsomnia
- Spring Doc


## Organização das classes
![Organização de Classes](https://github.com/brielsene/gerencia_user/assets/87671071/0a217b98-2bd6-4f33-b938-afdb323da95c)

## Requisições HTTP
![Imsomnia HTTP Requests](https://github.com/brielsene/gerencia_user/assets/87671071/42ff3cf3-79ee-4d22-893b-82dcf885516e)

## Documentação dos Endpoints
![Documentação Endpoints (SpringDoc)](https://github.com/brielsene/gerencia_user/assets/87671071/2685e3a5-c2ad-4dca-b5d2-cc8ce6f2f907)


## Demonstração
Criação de um usuário
<br>
![Demonstração Criação de um Usuário + Select](https://github.com/brielsene/gerencia_user/assets/87671071/39016dad-19e2-45b1-815d-3ac0e19adeab)



## Funcionalidades
- Criar um usuário
- Visualizar todos os usuários
- Visualizar usuário pelo seu ID
- Editar dados de um usuário
- Deletar um usuário pelo seu ID

## Estrutura do Projeto

O projeto tem a seguinte model principal:

- `User`: Representa um usuário na aplicação.


## Implementações Futuras
O Projeto está apenas com implementações simples de cada recursos que temos, logo será atualizado com mais métodos relacionados a usuário.
Além da adição de Spring Security, para que possamos ter autenticação e autorização para os usuários. também penso na impletação de email service,
para que possamos enviar um e-mail de confirmação para o usuário a cada requisição concluída com sucesso

## Como Usar

1. Clone o repositório:

   ```bash
   [git clone https://github.com/brielsene/dio-bank.git](https://github.com/brielsene/gerencia_user.git)

## Redes Sociais
- Linkedin
  <br>
https://www.linkedin.com/in/gabrielsenec




