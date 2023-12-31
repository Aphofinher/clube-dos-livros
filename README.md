
# Clube dos Livros

O Clube dos Livros é um projeto que está em desenvolvimento e que o objetivo seria os usuários a se interagirem através dos livros e suas respectivas categorias. 

### 1. Funcionalidades 

Para funcionalidades, teremos: 
- Uma tela não logada, com um design do nosso site que vamos desenvolver com foco na atenção dos usuários. 
- Uma tela logada, para criação de perfil dos usuários, e interação com outros usuários. 
- Uma tela de login, com usuário e senha. 
- Uma tela de cadastro com as informações necessárias dos futuros usuários. 
- Aba para inclusão dos desenvolvedores responsáveis pela aplicação. 

### 2. Ferramentas que utilizamos 

- Banco de dados (Postman ou SQL Server) 
- Backend (Java) 
- FrontEnd (HTML, CSS e Java Script)
- Extensão com Bootstrap 
- Git (para versionamento de Código) 


### 3. Ajuste nosso projeto do jeito que quiser!
Talvez queria ajustar nosso projeto de acordo com sua criatividade, então:
- É necessário criar um "fork" para fazer um clone do nosso projeto 
- Após isso, "git clone" para clonar seu fork remotamente, e seja feliz! 


### Desenvolvido por: 
- Murilo Santos Cunha 
- Ygor Bezerra Gomes 
- Pedro Paulo da Silva 
- Kelvin Oliveira
- Lucas Freire Lopes

0bs: Importante lembrar que em breve estará disponível o site do nosso projeto para acessarem!

### Informações - Marco 1 

### Tela Principal - Não logada
![Tela Principal](./bookish/src/main/webapp/images-index/tela%202.jpg)

### Tela Principal - Logada
![Tela de Login](./bookish/src/main/webapp/images-index/Desktop%20-%208.png)

### Tela de Login 
![Tela de Login](./bookish/src/main/webapp/images-index/Frame%2011.png)

### Tela de Cadastro 
![Tela de Cadastro](./bookish/src/main/webapp/images-index/Tela_3.png)

### Tela de atualização de Perfil 
![Tela de atualização de Perfil](./bookish/src/main/webapp/images-index/Tela%204.png)

### Modelagem Diagrama MER 
![Modelagem Diagrama MER](./bookish/src/main/webapp/images-index/mer.jpg)


### Script BD
CREATE TABLE USUARIO (
EMAIL VARCHAR(50) PRIMARY KEY,
NOME VARCHAR(50),
SENHA VARCHAR(20),
REDESOCIAL VARCHAR(30)
);


CREATE TABLE CATEGORIA (
ID INT PRIMARY KEY,
NOME_CATEGORIA VARCHAR(50)
);

CREATE TABLE COMENTARIO (
ID INT PRIMARY KEY AUTO_INCREMENT,
COMENTARIO VARCHAR(300),
USUARIO_EMAIL VARCHAR(50),
CATEGORIA_ID VARCHAR(50),
FOREIGN KEY (USUARIO_EMAIL) REFERENCES USUARIO(EMAIL),
FOREIGN KEY (CATEGORIA_ID) REFERENCES CATEGORIA(ID)
);



