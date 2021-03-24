CREATE OR REPLACE FUNCTION anom.cria_crm()
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
DECLARE
    numeroCRM INT;  
BEGIN

	SELECT INTO numeroCRM floor(random()*(100000));

    RETURN CAST(numeroCRM as VARCHAR);
END;
$BODY$;