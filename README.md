# tortuga

Tortuga Collecting é um aplicativo para facilitar a comunicação entre cidadãos e empresa(s) de coleta seletiva.
Um usuário cadastra seu endereço, seus dados pessoais com usuário(email) e senha. A partir daí ele escolhe o(s) tipo(s) de material a ser coletado e um dia disponibilizado pela(s) empresa(s) para coleta.  

## Telas elecadas
 ### T0 - Splash
 ### T1 - Login
 ### T2 - Cadastro Localidade   
 ### T3 - Cadastro Cliente
 ### T4 - Update cliente
 ### T5 - Material da coleta
 ### T6 - Agendamento de coleta

## Design Pattern
 #### Gateway (DbGateway):
 Se responsabiliza pelas conexões com o banco;
 #### Singleton (DbGateway):
 Garante instância única de banco pro APP;
 #### DAO Data Access Object([model]DAO):
 Responsável pela interação dos objetos com o db;
