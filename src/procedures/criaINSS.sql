
CREATE OR REPLACE FUNCTION anom.cria_inss()
    RETURNS VARCHAR
    LANGUAGE 'plpgsql'

AS $BODY$
DECLARE
    inss CHARACTER VARYING;
    numero INT;
    tamanho INTEGER = 0;
BEGIN
    inss = '';
    
    WHILE tamanho < 12 LOOP

	SELECT INTO numero floor(random()*(10));
	inss = inss || numero;
	tamanho = tamanho + 1;
    END LOOP;

    RETURN inss;
END;
$BODY$;