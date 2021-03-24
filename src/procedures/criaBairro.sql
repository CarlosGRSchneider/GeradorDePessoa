CREATE OR REPLACE FUNCTION anom.cria_bairro()
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
	DECLARE
	novoBairro VARCHAR;
	numeroBairro INT;
	
BEGIN
	SELECT INTO numeroBairro count(*) FROM anom.bairros;
	
	select into novoBairro
	bairro FROM anom.bairros
	OFFSET numeroBairro * random()
	LIMIT 1;
	
	RETURN novoBairro;
	END;
$BODY$;