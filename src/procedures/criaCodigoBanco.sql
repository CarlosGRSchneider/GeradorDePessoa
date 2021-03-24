CREATE OR REPLACE FUNCTION anom.cria_codigo_banco()
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
	DECLARE
    novoBanco VARCHAR;
    numeroBanco INT;
	tamanho INT = 0;

	BEGIN

    novoBanco = '';
    
    WHILE tamanho < 3 LOOP

	SELECT INTO numeroBanco floor(random()*(10));
	novoBanco = novoBanco || numeroBanco;
	tamanho = tamanho + 1;
    END LOOP;

    RETURN novoBanco;
END;
$BODY$;