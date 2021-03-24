CREATE OR REPLACE FUNCTION anom.cria_dt_nascimento()
    RETURNS timestamp without time zone
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
	DECLARE
	dia INT;
	mes INT;
	ano INT;
	dataCompleta TIMESTAMP;
	
	BEGIN
	SELECT INTO dia floor((random()* (28 - 1) + 1 ));
	SELECT INTO mes floor((random()* (12 - 1) + 1 ));
	SELECT INTO ano floor((random()* (99 - 60 + 1) + 60 ));
	
	dataCompleta = '19'||ano ||'-'||mes ||'-'|| dia||' 00:00:00';
	RETURN dataCompleta;
	END;
$BODY$;