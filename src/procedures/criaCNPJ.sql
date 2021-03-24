CREATE OR REPLACE FUNCTION anom.cria_cnpj()
    RETURNS character varying
    LANGUAGE 'plpgsql'
    VOLATILE
    COST 100
AS $BODY$
	DECLARE
	novoCNPJ VARCHAR;
	numero INT = 0;
	tamanho INT = 0;
	posicaoCNPJ VARCHAR;
	posicaoCNPJInt INT = 0;
	digitoVerificador1 INT = 0;
	digitoVerificador2 INT = 0;
	tamanhoCNPJ INT = 12;
	multiplicador INT = 5;
	looper INT = 1;
	resto INT;
	
	BEGIN
	
	novoCNPJ = '';
	WHILE tamanho < 12 LOOP
		SELECT INTO numero floor(random()*(10));
		novoCNPJ = novoCNPJ || numero;
		tamanho = tamanho + 1;
	END LOOP;

	posicaoCNPJ = '';
	WHILE looper <> tamanhoCNPJ + 1 LOOP
		SELECT INTO posicaoCNPJ SUBSTRING(novoCNPJ, looper, 1);
		SELECT INTO posicaoCNPJInt CAST (posicaoCNPJ as INT);
		digitoVerificador1 = digitoVerificador1 + (posicaoCNPJInt * multiplicador);
		
		IF multiplicador = 2 THEN
			multiplicador = 9;
		ELSE
			multiplicador = multiplicador - 1;
		END IF;
		
		looper = looper + 1;
	END LOOP;
	
	resto = MOD(digitoVerificador1, 11);
	IF resto < 2 THEN
		novoCNPJ = novoCNPJ || '0';
	ELSE
		novoCNPJ = novoCNPJ || (11 - resto);
	END IF;
	
	posicaoCNPJ = '';
	multiplicador = 6;
	looper = 1;
	WHILE looper <> tamanhoCNPJ + 2 LOOP
		SELECT INTO posicaoCNPJ SUBSTRING(novoCNPJ, looper, 1);
		SELECT INTO posicaoCNPJInt CAST (posicaoCNPJ as INT);
		digitoVerificador2 = digitoVerificador2 + (posicaoCNPJInt * multiplicador);
		
		IF multiplicador = 2 THEN
			multiplicador = 9;
		ELSE
			multiplicador = multiplicador - 1;
		END IF;
		
		looper = looper + 1;
	END LOOP;
		
	resto = MOD(digitoVerificador2, 11);
	IF resto < 2 THEN
		novoCNPJ = novoCNPJ || '0';
	ELSE
		novoCNPJ = novoCNPJ || (11 - resto);
	END IF;
	
	RETURN novoCNPJ;
	END;
$BODY$;