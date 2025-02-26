# Módulo 36: Multi-Database Client Management

Este projeto tem como objetivo a criação e manipulação de tabelas de clientes em diferentes bancos de dados simultaneamente, utilizando DAO (Data Access Object) para a abstração do acesso aos dados.

## Tecnologias Utilizadas
- Java
- JPA (Java Persistence API)
- JUnit para testes
- PostgreSQL, DB2 e outro banco de dados adicional

## Funcionalidades
- Cadastro, consulta, atualização e remoção de clientes em múltiplos bancos de dados
- Uso de DAOs separados para cada banco de dados
- Implementação de testes automatizados para validar as operações

## Estrutura
- `ClienteDAO`, `ClienteDAO2`, `ClienteDAO3`: Classes responsáveis pelo gerenciamento de clientes em diferentes bancos de dados.
- `ClienteDAOTest3`: Testes unitários para validar as operações CRUD nos diferentes bancos.
- `Cliente` e `Cliente2`: Entidades representando os clientes armazenados.

## Testes Implementados
- **Cadastro e consulta de clientes**
- **Atualização de dados**
- **Exclusão de registros**
- **Busca de todos os clientes cadastrados**

## Como Executar
1. Configure as conexões para os bancos de dados desejados.
2. Execute os testes via JUnit para validar o funcionamento das operações CRUD.
3. Expanda conforme necessário para suportar mais bancos ou novas funcionalidades.

