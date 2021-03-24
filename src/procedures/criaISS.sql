CREATE OR REPLACE FUNCTION anom.cria_iss()
    RETURNS VARCHAR
    LANGUAGE 'plpgsql'

AS $BODY$
DECLARE
    iss CHARACTER VARYING;
    numero INT;
    tamanho INTEGER = 0;
BEGIN
    iss = '';
    
    WHILE tamanho < 9 LOOP

	SELECT INTO numero floor(random()*(10));
	iss = iss || numero;
	tamanho = tamanho + 1;
    END LOOP;

    RETURN iss;
END;
$BODY$;