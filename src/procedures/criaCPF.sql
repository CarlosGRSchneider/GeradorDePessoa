CREATE OR REPLACE FUNCTION anom.cria_cpf()
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
	DECLARE
	novoCPF VARCHAR;
	posicaoCPF VARCHAR;
	posicaoCPFInt INT;
	digitoVerificador1 INT = 0;
	digitoVerificador2 INT = 0;
	digito1 INT = 0;
	digito2 INT = 0;
	resto INT = 0;
	digitoCPF INT;
	looper INT = 1;
	tamanhoCPF INT = 11;
	tamanho INT = 0;
	numero INT = 0;
	
BEGIN
	
	novoCPF = '';
	WHILE tamanho < 11 LOOP
		SELECT INTO numero floor(random()*(10));
		novoCPF = novoCPF || numero;
		tamanho = tamanho + 1;
	END LOOP;
	
	posicaoCPF = '';
	WHILE looper <> tamanhoCPF - 1 LOOP
		SELECT INTO posicaoCPF SUBSTRING(novoCPF, looper, 1);
		SELECT INTO posicaoCPFInt CAST (posicaoCPF as INT);
		digitoVerificador1 = digitoVerificador1 + (11 - looper) * posicaoCPFInt;
		digitoVerificador2 = digitoVerificador2 + (12 - looper) * posicaoCPFInt;	
		looper = looper + 1;
	END LOOP;
	
	resto = MOD(digitoVerificador1, 11);
	IF resto < 2 THEN
		digito1 = 0;
	ELSE
		digito1 = 11 - resto;
	END IF;
	
	digitoVerificador2 = digitoVerificador2 + (2 * digito1);
	resto = MOD(digitoVerificador2, 11);
	IF resto < 2 THEN
		digito2 = 0;
	ELSE
		digito2 = 11 - resto;
	END IF;
	
	SELECT into novoCPF SUBSTRING(novoCPF, 1, 9);
	 novoCPF = novoCPF || digito1 || digito2;
	
	RETURN novoCPF;
	END;
$BODY$;