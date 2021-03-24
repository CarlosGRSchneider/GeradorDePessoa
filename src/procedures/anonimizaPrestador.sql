CREATE OR REPLACE FUNCTION anom.anonimiza_prestadores()
    RETURNS integer
    LANGUAGE 'plpgsql'
AS $BODY$
  DECLARE
  	contador INTEGER = 0;
	rPrestador RECORD;
	novoCNPJ VARCHAR;
	novoNome VARCHAR;
	novoEmail VARCHAR;
	novoUF VARCHAR;
	novocdAgencia VARCHAR;
	cdBanco VARCHAR;
	nrContaCorrente VARCHAR;
	nrCRM VARCHAR;
	novoNomeDiretorTecnico VARCHAR;
	novoINSS VARCHAR;
	novoISS VARCHAR;
	BEGIN
	
	FOR rPrestador IN select cd_prestador, cd_unimed  FROM prestadores
	LOOP
  	
	novoCNPJ := anom.cria_cnpj();
	novoNome := anom.cria_nome('F');
	novoNomeDiretorTecnico := anom.cria_nome('M');
	novoEmail := anom.cria_email(novoNome);
	novoUF := anom.cria_uf();
	novocdAgencia := anom.cria_agencia();
	cdBanco := anom.cria_codigo_banco();
	nrContaCorrente := anom.cria_conta();
	nrCRM := anom.cria_crm();
	novoINSS := anom.cria_inss();
	novoISS := anom.cria_iss();
	
	UPDATE prestadores 
	   SET nr_cnpj = novoCNPJ,
	   nm_prestador = novoNome,
	   nm_fantasia = substring(novoNome, 1, 40),
	   ds_nome_diretor_tecnico = novoNomeDiretorTecnico,
	   ds_e_mail = novoEmail,
	   uf_crm = novoUF,
	   cd_banco = cdBanco,
	   cd_agencia = novocdAgencia,
	   nr_conta_corrente = nrContaCorrente,
	   uf_crm_diretor_tecnico = novoUF,
	   nr_crm = cast(nrCRM as INTEGER),
	   nr_crm_diretor_tecnico = nrCRM,
	   nr_inss = novoINSS,
	   nr_iss = novoISS
	   WHERE cd_prestador = rPrestador.cd_prestador AND cd_unimed = rPrestador.cd_unimed;
	contador := contador + 1;
	END LOOP;
	RETURN contador;
	END;
$BODY$;