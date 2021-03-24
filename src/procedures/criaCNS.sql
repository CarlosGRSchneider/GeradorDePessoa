CREATE OR REPLACE FUNCTION anom.cria_cns()
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
	DECLARE
	numeroInicialContador INT;
	numeroInicial INT;
	numeroCNS VARCHAR;
	tamanho INT = 0;
	digitoCNS INT;
	soma INT = 0;
	multiplicador INT = 15;
	looper INT = 0;
	tamanhoCNS INT = 11;
	substringCNS VARCHAR;
	substringCNSINT INT;
	resto INT = 0;
	digitoVerificador INT = 0;
	
BEGIN
	
	SELECT INTO numeroInicialContador COUNT(*) FROM anom.numeros_que_nunca_mais_serao_usados;
		
	SELECT INTO numeroInicial 
	numero FROM anom.numeros_que_nunca_mais_serao_usados
	OFFSET floor(numeroInicialContador * random())
	LIMIT 1;
	
	numeroCNS = '';
	WHILE tamanho < 10 LOOP
		SELECT INTO digitoCNS floor(random()*(10));
		numeroCNS = numeroCNS || digitoCNS;
		tamanho = tamanho + 1;
	END LOOP;
	numeroCNS = numeroInicial || numeroCNS;
	
	substringCNS = '';
	WHILE looper < tamanhoCNS LOOP
	SELECT INTO substringCNS SUBSTRING(numeroCNS, looper + 1, 1);
	SELECT INTO substringCNSINT  CAST (substringCNS as INT);
	soma = soma + (substringCNSINT * multiplicador);
	multiplicador = multiplicador - 1;
	looper = looper + 1;
	END LOOP;
	
	resto = MOD(soma, 11);
	digitoVerificador = 11 - resto;
	IF digitoVerificador = 11 THEN
		digitoVerificador = 0;
	END IF;
	
	IF digitoVerificador = 10 THEN
		soma = soma + 2;
		resto = MOD(soma, 11);
		digitoVerificador = 11 - resto;
		
		numeroCNS = numeroCNS || '001' || digitoVerificador;
	ELSE
		numeroCNS = numeroCNS || '000' || digitoVerificador;
	END IF;
	
	RETURN numeroCNS;
	END;
$BODY$;