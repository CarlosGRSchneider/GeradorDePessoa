CREATE OR REPLACE FUNCTION anom.cria_rg()
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
DECLARE
    rg CHARACTER VARYING;
    numero INT;
    tamanho INTEGER = 0;
BEGIN
    rg = '';
    
    WHILE tamanho < 10 LOOP

	SELECT INTO numero floor(random()*(10));
	rg = rg || numero;
	tamanho = tamanho + 1;
    END LOOP;

    RETURN rg;
END;
$BODY$;