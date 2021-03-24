CREATE OR REPLACE FUNCTION anom.cria_nome(IN tiponome character)
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
  DECLARE
  	qtNomes INTEGER;
	qtSobreNomes INTEGER;
	nome1 VARCHAR;
	nome2 VARCHAR;
	sobrenome VARCHAR;
  BEGIN

	SELECT INTO qtNomes count(*) from anom.nomes where tpNome = tipoNome;
	qtNomes := qtNomes - 1;
	SELECT INTO qtSobreNomes count(*) from anom.nomes where tpNome = 'S';
	qtSobreNomes := qtSobreNomes - 1;
	
	SELECT INTO nome1 dsNome 
	  FROM anom.nomes
 	 WHERE tpNome = tipoNome
    OFFSET ( qtNomes ) * random()
 	LIMIT 1;

	SELECT INTO sobrenome dsNome 
	  FROM anom.nomes
 	 WHERE tpNome = 'S'
    OFFSET ( qtSobreNomes ) * random()
 	LIMIT 1;

	SELECT INTO nome2 dsNome 
	  FROM anom.nomes
 	 WHERE tpNome = tipoNome
	   AND dsNome <> nome1
    OFFSET ( qtNomes - 1 ) * random()
 	LIMIT 1;
	
	
	RETURN nome1 || ' ' || nome2 || ' ' || sobrenome;
  END;
$BODY$;