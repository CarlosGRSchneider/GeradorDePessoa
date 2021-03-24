CREATE OR REPLACE FUNCTION anom.cria_email(IN nome character varying)
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
	DECLARE
	qtEmails INT = 0;
	direitaEmail VARCHAR;
	substituiEmail VARCHAR;
	numeroQualquer INT = 0;
	
	BEGIN
		SELECT INTO numeroQualquer floor(random()*(999));
	
		nome = REPLACE(nome, ' ', '' );
		nome = REPLACE(nome, '-', '' );
		substituiEmail = nome;
		
		SELECT INTO qtEmails count(*) from anom.emails;
		
		SELECT INTO direitaEmail endereco 
		FROM anom.emails 
		OFFSET (qtEmails) * random()
		LIMIT 1;
		
		RETURN substituiEmail ||numeroQualquer|| direitaEmail;
	END;
$BODY$;