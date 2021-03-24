CREATE OR REPLACE FUNCTION anom.cria_logradouro()
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
	DECLARE
	nomeLogradouro VARCHAR;
	tipoNome CHAR;
	numeroSorteador INT = 0;
	numeroLogradouro INT = 0;
	BEGIN
	SELECT INTO numeroLogradouro floor((random()* (5000 - 1) + 1 )); 
	SELECT INTO numeroSorteador floor((random()* (3 - 1) + 1 ));
	
	IF numeroSorteador = 2 THEN
		tipoNome = 'F';
	ELSE
		tipoNome = 'M';
	END IF;
	
	nomeLogradouro := 'Rua '|| anom.cria_nome(tipoNome) || ' ' || numeroLogradouro;
	RETURN nomeLogradouro;
	END;
$BODY$;