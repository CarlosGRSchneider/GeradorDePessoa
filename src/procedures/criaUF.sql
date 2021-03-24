CREATE OR REPLACE FUNCTION anom.cria_uf()
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
	DECLARE
	numeroUF INT;
	novoUF VARCHAR;
	
	BEGIN
	SELECT INTO numeroUF COUNT(*) FROM anom.unidades_federativas;
	
	SELECT INTO novoUF 
	uf FROM anom.unidades_federativas
	OFFSET floor(numeroUF * random())
	LIMIT 1;
	
	RETURN novoUF;
	END;
$BODY$;