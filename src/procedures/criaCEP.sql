CREATE OR REPLACE FUNCTION anom.cria_cep()
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
	DECLARE
    novoCEP CHARACTER VARYING;
    numeroCEP INT;

BEGIN
	SELECT INTO numeroCEP count(*) FROM anom.ceps;
	
	select into novoCEP 
	cep FROM anom.ceps
	OFFSET numeroCEP * random()
	LIMIT 1;
	
	return novoCEP;
	END;
$BODY$;