# GeradorDePessoa
Este é um projeto que eu criei para resolver um problema que estavamos tendo na Unimed, mas como eu gostei do resultado, resolvi reescrever com alterações aqui. 
Com a LGPD, algumas tabelas do nosso banco de dados precisavam ser anonimizadas. Quando eu recebi o projeto, minha ideia era fazer uma classe randomizadora que gerava dados de uma pessoa ficcional, e depois fazia um update no banco de dados.
Logo ficou claro que haveria bastante duplicação de codigo, então fiz uma interface com metodos default, a fim de deixar o codigo menor e mais coeso. 
Os geradores de CPF, CNPJ e CNS devolvem valores validos, segundo o calculo do governo para validar estes dados.

Os geradores funcionaram bem, mas devido ao tamanho das tabelas, atualizar todo nosso banco de dados com os valores randomicos se tornou bastante lento. Então desenvolvi procedures, que são apenas os codigos transcritos de java para plpgsql. Isso diminuiu o tempo de anonimização em mais ou menos 35%, por isso decidi incluir as procedures no github.
