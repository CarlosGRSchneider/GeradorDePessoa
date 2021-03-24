CREATE OR REPLACE FUNCTION anom.cria_telefone()
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
	DECLARE
	ddd VARCHAR;
	numeroDDD INT = 0;
	telefone VARCHAR;
	numeroTelefone INT = 0;
	tamanho INT = 0;
	
	BEGIN
	SELECT INTO numeroDDD floor((random()*90) + 10);
	ddd = '(' || numeroDDD ||')';	
	telefone = ddd || ' 9';
    
    WHILE tamanho < 8 LOOP
		SELECT INTO numeroTelefone floor(random()*(10));
		telefone = telefone || numeroTelefone;
		tamanho = tamanho + 1;
    END LOOP;
	
	RETURN telefone;
	END;
$BODY$;