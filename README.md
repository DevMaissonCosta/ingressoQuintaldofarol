# Ingressos Quintal do Farol

Backend de um sistema de venda automatizada de ingressos antecipados via WhatsApp, desenvolvido para o bar Quintal do Farol.

## Visao geral

O objetivo do projeto e permitir que um cliente compre ingressos para eventos do bar diretamente pelo WhatsApp, sem a necessidade de atendimento humano. O fluxo esperado e:

1. O cliente envia uma mensagem no WhatsApp do bar manifestando interesse em comprar um ingresso.
2. O sistema identifica o lote de ingressos disponivel no momento e responde automaticamente.
3. E gerada uma cobranca (PIX ou cartao) atraves do Mercado Pago.
4. Apos a confirmacao do pagamento, o sistema gera um ingresso com codigo unico.
5. O ingresso e enviado de volta ao cliente pelo WhatsApp.

## Tecnologias

- Java
- Spring Boot
- Spring Data JPA / Hibernate
- PostgreSQL
- Maven

## Estrutura do banco de dados

O banco `ingressos_bar` possui tres tabelas principais:

- **lote**: representa um lote de ingressos, com nome, preco, quantidade total e quantidade vendida. Quando um lote esgota, o proximo lote passa a ser vendido automaticamente.
- **pedido**: representa uma tentativa de compra, vinculada a um lote, contendo dados do comprador, valor, forma de pagamento e status do pagamento.
- **ingresso**: representa o ingresso gerado apos a confirmacao do pagamento de um pedido, com codigo unico e controle de uso na entrada do evento.

## Endpoints atuais

- `POST /lotes` - cria um novo lote de ingressos
- `POST /pedidos` - cria um novo pedido
- `POST /ingressos` - cria um novo ingresso

## Status do projeto

Em desenvolvimento. Ja implementado:

- Modelagem e criacao do banco de dados
- Entidades JPA (Lote, Pedido, Ingresso) e seus relacionamentos
- Repositories e Controllers basicos para as tres entidades

Ainda pendente:

- Regras de negocio para controle de lotes e geracao automatica de codigo de ingresso
- Integracao com o Mercado Pago para pagamentos via PIX e cartao
- Integracao com a API do WhatsApp para automacao do atendimento

## Autor

Maisson Costa
