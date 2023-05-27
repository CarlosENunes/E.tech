#language: pt
#enconding: UTF-8
#author: Carlos Nunes
#date: 15/03/2022
#version 1.0

Funcionalidade: Login
  Com essa funcionalidade iremos conseguir realizar um login na aplicação com um usuario já cadastrado

  Como um usuário já cadastrado na aplicação
  Eu quero inserir meus dados cadastrais
  Para realizar login na aplicação

  Contexto: entrar na tela de login
    Dado estiver na tela de login
  Cenário: Validar o login na aplicação
    Quando inserir os dados do usuário "carlostesteqa@teste.com"
    Então devo visualizar o nome "carlos testeqa"

  Esquema do Cenario: : Validar o login na aplicação
    Quando inserir os dados do usuário <dados_usuarios>
    Então deve visualizar a mensagem de erro "Authentication failed."

    Exemplos:
      |  dados_usuarios   |
      |  email_incorreto  |
      |  senha_incorreta  |
      |  dados_incorretos |