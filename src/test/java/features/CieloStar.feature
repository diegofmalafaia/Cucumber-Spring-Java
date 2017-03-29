#language:pt

  Funcionalidade: Inclusão de vendas

       Cenário: Verificar que o debito de uma venda esta sendo incluido ao saldo
         Dado que eu saiba o saldo de um cliente
         Quando eu incluo uma venda para este cliente
         Então eu verifico que o saldo deste cliente foi acrescido do valor da venda
