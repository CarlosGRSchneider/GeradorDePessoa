CREATE OR REPLACE FUNCTION anom.cria_agencia()
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
	DECLARE
    novaAgencia VARCHAR;
    numeroAgencia INT;
	tamanho INT = 0;

	BEGIN

    novaAgencia = '';
    
    WHILE tamanho < 10 LOOP

	SELECT INTO numeroAgencia floor(random()*(10));
	novaAgencia = novaAgencia || numeroAgencia;
	tamanho = tamanho + 1;
    END LOOP;

    RETURN novaAgencia||'-'||numeroAgencia||numeroAgencia;
END;
$BODY$;