CREATE OR REPLACE FUNCTION anom.cria_conta()
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
	DECLARE
    novaConta VARCHAR;
    numeroConta INT;
	tamanho INT = 0;

	BEGIN

    novaConta = '';
    
    WHILE tamanho < 15 LOOP

	SELECT INTO numeroConta floor(random()*(10));
	novaConta = novaConta || numeroConta;
	tamanho = tamanho + 1;
    END LOOP;

    RETURN novaConta||'-'||numeroConta||numeroConta;
END;
$BODY$;