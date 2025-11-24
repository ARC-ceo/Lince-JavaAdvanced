![Logo](logo.png)
# Lince - API em Spring Boot

O **Lince** é um sistema completo para **monitoramento, análise e gestão
de EPIs** (Equipamentos de Proteção Individual), integrando dados em
tempo real de sensores instalados em estações e ambientes operacionais.\
A plataforma permite acompanhar uso, conformidade, alertas de segurança
e comportamento operacional, garantindo maior proteção para
colaboradores e maior controle para equipes de supervisão e segurança.

Nosso objetivo é oferecer uma solução moderna e confiável para
**monitoramento inteligente de EPIs**, reduzindo riscos, prevenindo
acidentes e centralizando informações essenciais para os times de
segurança corporativa.

## Problemas que a aplicação resolve
-   Falta de visibilidade sobre **uso correto** de EPIs.
-   Dificuldade em monitorar automaticamente **violação de áreas
    restritas**.
-   Baixa eficiência em auditorias e checklists de segurança.
-   Falta de relatórios centralizados para tomada de decisão.
-   Integração limitada entre sensores físicos e aplicações
    administrativas.

## Sobre o time

- **Arthur Algate RM:560109**: Responsável pelo banco de dados e Compliance QA.  
- **Carlos Clementino RM:561187**: Responsável pelo desenvolvimento da API em Java Spring Boot e .NET, infraestrutura e práticas de DevOps, e pela integração com dispositivos IoT.  
- **Eder Silva RM:559647**: Responsável pela criação do APP mobile.

## Como rodar a aplicação

### Pré-requisitos
- Java 21 ou superior  
- Maven 3.8+  
- IDE recomendada: IntelliJ IDEA ou VSCode  

### Perfis de execução
A aplicação possui dois **profiles** de configuração de banco de dados:

1. **local**: utiliza o banco em memória H2, ideal para testes e desenvolvimento local.  
2. **prod**: conecta com o Oracle Database, utilizado para produção.

### Passos para executar

1. Clone o repositório:  
```bash
git clone https://github.com/ARC-ceo/Lince-JavaAdvanced.git
```

2. Execute a aplicação com o profile desejado:

**Para local (H2):**
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=local
```

**Para produção (Oracle):**
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=prod
```

3. A API estará disponível em: `http://localhost:8080`

### Testando a API
A documentação dos endpoints está disponível via **Swagger UI**:  
`http://localhost:8080/swagger-ui/index.html`

Além disso, disponibilizamos no repositório uma **collection do Insomnia** contendo todas as requisições da API prontas para uso, facilitando os testes e a integração durante o desenvolvimento.

## Apresentação
Assista ao vídeo explicando a proposta tecnológica, o público-alvo e os problemas que a aplicação resolve:  
[Apresentação Lince](https://mega.nz/file/wuowCKCI#9oVsDlWlh2ehUqFIBXNfO8108JufTlr685RoGP4-sBk)

## Video demonstrativo
Assista ao vídeo para a demonstração e teste da API na prática:  
[Demonstração da API](https://youtu.be/4lUS9TB6UOM)

## Endpoints da API

A API foi documentada com **Swagger / OpenAPI**, oferecendo exemplos completos de requisição e resposta.  

### Endpoints principais

| Método | Endpoint       | Descrição                                    |
|--------|----------------|---------------------------------------------|
| GET    | /supervisor       | Listar todos supervisores cadastrados       |
| PUT    | /supervisor       | Atualizar cadastro do supervisor            |
| POST   | /supervisor       | Criar cadastro de supervisor                |
| GET    | /supervisor/{id}  | Buscar cadastro do supervisor               |
| DELETE | /supervisor/{id}  | Deletar cadastro do supervisor              |

> Para todos os endpoints, exemplos detalhados de request e response estão disponíveis no **Swagger UI** e **Collection para o Insomnia** presente aqui no repositório.

## Deploy em Nuvem (Docker)

O repositório já inclui um **Dockerfile** configurado para construir e
executar a aplicação em um ambiente conteinerizado. Isso facilita o
deploy em serviços de nuvem como **Azure**, **AWS**, **Google Cloud**,
**Oracle Cloud** ou qualquer plataforma que suporte Docker.

### 📦 Gerando a imagem Docker

No diretório raiz do projeto, execute:

``` bash
docker build -t lince-api .
```

### ▶️ Executando o container

``` bash
docker run -p 8080:8080 lince-api
```

## Tecnologias utilizadas
- Java 21  
- Spring Boot 3.x  
- Spring Data JPA  
- Hibernate  
- H2 Database (local)  
- Oracle Database (prod)  
- Swagger / OpenAPI  

---

**Lince** — Visão total. Risco mínimo. 🦁
