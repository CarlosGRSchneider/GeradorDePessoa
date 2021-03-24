CREATE OR REPLACE FUNCTION anom.anonimiza_beneficiarios()
    RETURNS integer
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
  DECLARE
    rBenef RECORD;
    contador INTEGER;
	novoNome VARCHAR;
	nomeMae VARCHAR;
	nomePai VARCHAR;
	novoRG VARCHAR;
	novoEmail VARCHAR;
	novoTelefone VARCHAR;
	novoDtNascimento TIMESTAMP;
	novoUF VARCHAR;
	novoLogradouro VARCHAR;
	novoCEP VARCHAR;
	novoBairro VARCHAR;
	novoCPF VARCHAR;
	novoCNS VARCHAR;
  BEGIN

	contador := 0;

	FOR rBenef IN select id_beneficiario, tp_sexo from beneficiarios
	LOOP
		
		novoNome := anom.cria_nome( rBenef.tp_sexo );
		nomePai := anom.cria_nome( 'M' );
		nomeMAE := anom.cria_nome( 'F' );
		novoEmail := anom.cria_email(novoNome);
		novoRG := anom.cria_rg();
		novoTelefone := anom.cria_telefone();
		novoDtNascimento := anom.cria_dt_nascimento();
		novoUF := anom.cria_uf();
		novoLogradouro := anom.cria_logradouro();
		novoCEP := anom.cria_cep();
		novoBairro := anom.cria_bairro();
		novoCPF := anom.cria_cpf();
		novoCNS := anom.cria_cns();

		UPDATE beneficiarios 
		   SET ds_nome = novoNome, 
			   ds_nome_abreviado = substring( novoNome, 1, 25 ),
			   nm_social = novoNome,
			   nm_social_cartao = substring( novoNome, 1, 25 ),
			   ds_email = novoEmail,
			   cd_rg = novoRG,
			   ds_telefone = novoTelefone,
			   ds_telefone_alternativo = novoTelefone,
			   dt_nascimento = novoDtNascimento,
			   id_cidade_residencia = 4300703,
			   id_cidade_atendimento = 4300703,
			   cd_estado_atendimento = novoUF,
			   cd_estado_residencia = novoUF,
			   ds_nome_da_mae = nomeMae,
			   ds_nome_do_pai = nomePai,
			   ds_complemento_logradouro = null,
			   ds_logradouro = novoLogradouro,
			   cd_cep_residencia = novoCEP,
			   ds_bairro = novoBairro,
			   cd_cpf = novoCPF,
			   cd_cns = novoCNS
		 WHERE id_beneficiario = rBenef.id_beneficiario;
	    contador := contador + 1;
	END LOOP;

	RETURN contador;
  END;
$BODY$;