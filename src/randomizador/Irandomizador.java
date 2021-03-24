package randomizador;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public interface Irandomizador {

	static Random random = new SecureRandom();
	
	default String geraDtNascimentoFormatoSQL() {

		LocalDate dataMinima = LocalDate.of( 1950, Month.JANUARY, 01 );
		long dataInicial = dataMinima.toEpochDay();

		LocalDate dataMaxima = LocalDate.now();
		long dataFinal = dataMaxima.toEpochDay();

		long dataRandom = ThreadLocalRandom.current().nextLong( dataInicial, dataFinal );

		return LocalDate.ofEpochDay( dataRandom ) + " 00:00:00";
	}

	default String geraTelefone() {

		StringBuilder ddd = new StringBuilder();
		StringBuilder telefone = new StringBuilder( "9" );
		
		while( ddd.length() < 2 ) {
			ddd.append( random.nextInt( 10 ) );
		}

		
		while( telefone.length() < 9 ) {
			telefone.append( random.nextInt( 10 ) );
		}

		return "("+ ddd +") " + telefone;
	}
	
	default String geraCEP() {

		List<String> listaCEP1 = Arrays.asList( "65880000", "69315335", "41620500", "69313002", "58038060", "57608320", "51335350", "77017142", "69020101", "49041116", "60872685", "55155370", "59094550", "68554180", "88352370", "68904715", "88161032", "88343109", "71884514", "64213144", "64212200", "64076038", "69914344", "91430750", "69092110", "76824102", "60741750", "69101260", "77817748", "21532360", "79073210", "68908802", "76907808", "64025440", "59114740", "71697041", "88035050", "69074103", "77820372", "58051020", "59122537", "68902200", "69055741", "77441020", "29010035", "68700395", "32186040", "69900679", "65905360", "65914133" );
		List<String> listaCEP2 = Arrays.asList( "29118455", "69317444", "71693001", "41120380", "40387185", "72925009", "97105362", "86300970", "59122770", "49015010", "76870726", "60531030", "97110250", "29111863", "78040600", "64032540", "40451250", "85907450", "44076768", "91420250", "76810604", "49043721", "64090550", "78735306", "87111190", "72002030", "69905596", "40435860", "58062160", "12340614", "29165550", "29047468", "79621442", "93285020", "65140970", "89809790", "66015010", "68906162", "81900580", "58407391", "30421223", "57014615", "65059874", "69098088", "07180970", "69901824", "59042008", "68909135", "79086123", "77433393" );

		List<String> listaFinal = new ArrayList<>();
		listaFinal.addAll( listaCEP1 );
		listaFinal.addAll( listaCEP2 );

		return listaFinal.get( random.nextInt( listaFinal.size() ) );

	}

	default String geraEmail() {
		String ladoEsquerdoEmail = geraNome() + geraSobrenome();

		return geraEmail( ladoEsquerdoEmail );
	}

	default String geraEmail( String ladoEsquerdoEmail ) {

		List<String> ladoDireitoEmail = Arrays.asList( "@gmail.com", "@hotmail.com", "@outlook.com", "@terra.com", "@myemail.com", "@bol.com", "@uol.com", "@yahoo.com", "@msn.com", "@netscape.net", "@terra.com", "@comcast.net", "@free.fr", "@yandex.ru", "@libero.it", "@gmx.de", "@live.co.uk", "@rocketmail.com", "@facebook.com", "@sky.com" );

		return ladoEsquerdoEmail.replace( "-", "" ).replace( " ", "" ) + random.nextInt( 1000 ) + ladoDireitoEmail.get( random.nextInt( ladoDireitoEmail.size() ) );
	}
	
	default String geraUF() {

		List<String> listaUF = Arrays.asList( "RO", "AC", "AM", "RR", "PA", "AP", "TO", "MA", "PI", "CE", "RN", "PB", "PE", "AL", "SE", "BA", "MG", "ES", "RJ", "SP", "PR", "SC", "RS", "MS", "MT", "GO", "DF" );

		return listaUF.get( random.nextInt( listaUF.size() ) );
	}
	
	default String geraCidade() {

		List<String> cidadesAsia = Arrays.asList( "Shanghai", "Mumbai", "Karachi", "Istanbul", "Nova Delhi", "Manila", "Dhaka", "Seoul", "Jakarta", "Tokyo", "Zhumadian", "Taipei", "Beijing", "Tehran", "Nanchong", "Hong Kong", "Lahore", "Baghdad", "Bangkok", "Busan", "Singapura", "Ho Chi Minh", "Saigon", "Kabul", "Nanjing", "Pune", "Surat", "Jeddah", "Kanpur", "Jaipur", "Incheon", "Osaka", "Izmir", "Mosul", "Changsha", "Al Basrah", "Beirut", "Jilin", "Hangzhou", "Medan", "Moscow", "Ufa", "Sait Petersburg", "Kazan", "Sochi", "Aleppo", "Bandung", "Patna", "Damascus", "Qingdao" );
		List<String> cidadesAmerica = Arrays.asList( "Jaboatão dos Guararapes", "Merico City", "Lima", "New York", "Bogota", "Rio de Janeiro", "Santiago", "Los Angeles", "Caracas", "Salvador", "Buenos Aires", "Brasilia", "Toronto", "Chicago", "Fortaleza", "Quito", "Belo Horizonte", "Medellín", "Cali", "Houston", "Havana", "Manaus", "Curitiba", "Montreal", "Ectapec de Morelos", "Recife", "Macaibo", "Santa Cruz de la Sierra", "Philadelphia", "Phoenix", "San Antonio", "Guadalajara", "Puebla", "Goiania", "Cordoba", "San Diego", "Ciudad Juárez", "Motevideo", "León", "Guarulhos", "Dallas", "Tijuana", "Calgary", "Barranquilla", "Tegucigalpa", "Zapopan", "Campinas", "Acre", "Rosario", "Bariloche" );
		List<String> cidadesEuropa = Arrays.asList( "Istanbul", "Londres", "Berlin", "Madrid", "Kiev", "Roma", "Paris", "Minsk", "Vienna", "Hamburgo", "Bucharest", "Varsovia", "Cracovia", "Budapeste", "Barcelona", "Munique", "Milan", "Belgrado", "Prague", "Nizhny Novgorod", "Sofia", "Birmingham", "Bruxelas", "Transilvania", "Samara", "Rostov", "Cologne", "Voronezh", "Perm", "VolgoGrad", "Odessa", "Vienna", "Stockholm", "Napoles", "Turin", "Amsterdan", "Marseille", "Zagreb", "Copenhagen", "Valencia", "Frankfurt", "Sevilha", "Granada", "Lutz", "Zaragoza", "Atenas", "Palermo", "Helsinki", "Rotterdam", "Stuttgart" );
		List<String> cidadesOceania = Arrays.asList( "Sydney", "Melbourne", "Brisbane", "Perth", "Auckland", "Adelaide", "Gold Coast", "Newcastle", "Canberra", "Honolulu", "Christchurch", "Port Moresby", "Sunshine Coast", "Central Coast", "Wollongong", "Geelong", "Hobart", "Wellington", "Townsville", "Nouméa", "Hamilton", "Cairns", "Tauranga", "Toowoomba", "Papeete", "Darwin", "Lower Hutt", "Ballarat", "Dunedin", "Bendigo", "Lae", "Albury", "Launceston", "Suva", "Nelson", "Honiara", "Palmerston", "Mackay", "Niue", "Port Principe", "Edimburgh", "Apia", "Nicosia", "Madeira", "Antananarivo", "Java", "Salamina", "Sparta", "Nucualofa", "McMurdo Station" );
		List<String> cidadesAfrica = Arrays.asList( "Kinshasa", "Lagos", "Cairo", "Giza", "Johannesburg", "Dar es Salaam", "Alexandria", "Abidjan", "Nairobi", "Cape Town", "Casablanca", "Accra", "East Rand", "Durban", "Pretoria", "Algiers", "Kumasi", "Tripoli", "Addis Ababa", "Kano", "Luanda", "Ibadan", "Douala", "Omdurman", "Yaoundý", "Bamako", "Lusaka", "Conakry", "Mogadishu", "Kampala", "Mombasa", "Harare", "Lomé", "Ougadougou", "Khartoum", "Brazzaville", "Lubumbashi", "Kisumu", "Porth Elizabeth", "Dakar", "Benin", "Kigali", "Fez", "Bujumbura", "Freetown", "Maputo", "Monrovia", "Port Harcourt", "Lilongew", "Marrakesh" );

		List<String> listaFinal = new ArrayList<>();
		listaFinal.addAll( cidadesAsia );
		listaFinal.addAll( cidadesAmerica );
		listaFinal.addAll( cidadesAfrica );
		listaFinal.addAll( cidadesOceania );
		listaFinal.addAll( cidadesEuropa );

		return listaFinal.get( random.nextInt( listaFinal.size() ) );
	}

	default String geraLogradouro() {

		StringBuilder nomeDaRua = new StringBuilder();

		while( nomeDaRua.length() == 0 ) {

			int sorteadorDeSobrenome = random.nextInt( 2 );
			int sorteadorDeNome = random.nextInt( 2 );

			if( sorteadorDeSobrenome == 1 ) {
				String sobrenome = geraSobrenome();

				if( sorteadorDeNome == 1 ) {
					String nome = geraNome();
					nomeDaRua.append( nome );
					nomeDaRua.append( " " + sobrenome );
				} else {
					nomeDaRua.append( sobrenome );
				}
			}
		}

		return "Rua " + nomeDaRua.toString() + ", " + random.nextInt( 3000 );
	}
	
	default String geraBairro() {

		List<String> bairros1 = Arrays.asList( "Centro", "Bela Vista", "São José", "Santo Antônio", "São Francisco", "Vila Nova", "Boa Vista", "Industrial", "São Cristóvão", "Planalto", "Santa Cruz das Palmeiras", "Tambaú", "Alto alegre", "Areal", "Bela Floresta", "Bom Jardim", "Cristal", "Cruzeiro", "Dez de Abril", "Duque de Caxias", "Eldorado", "Edson Queiroz", "Flores", "Florença", "Guanabara", "Granjeiro", "Herval", "Humaitá", "Ipiranga", "Ingá", "Serraria", "Santa Felicidade", "Zélia Barbosa", "Zona Militar", "Ytacoatiara", "Xodo-Marize", "XV de Novembro", "Weber", "Vila Costa", "Vila França", "Vitória Régia", "Una", "Universidade", "Tancredo Neves", "Treze de Setembro", "Santa Luzia", "São Judas Tadeu", "São Jorge", "Roque", "Riachuelo" );
		List<String> bairros2 = Arrays.asList( "Quintas", "Quinta da Barra", "Primavera", "Paulo Correa", "Orquídeas", "Ouro Branco", "Novo Horizonte", "Nova Esperança", "Maresia", "Miramar", "Lago Novo", "Lago Verde", "Km 50", "Kennedy", "Jardim das Esmeraldas", "Juscelino Kubitschek", "Ilhotas", "Itaperi", "Horto", "Helena Maria", "Galo da Serra", "Glória", "Garrote", "Flores", "Flor do Campo", "Entre Rios", "Estação", "Dos Ulisses", "Diamantino", "Da Paz", "Doutor Afonso Walter", "Coimbra", "Cohab", "Correnteza", "Barra do rio", "Bentos", "Bento Golçalves", "Barzan", "Areia Branca", "Alto Do Prado", "Laranjeiras", "Silva Paes", "General Random", "Águas Novas", "Antão Jovem", "Taim", "Cidreira", "Terra Nova", "Jardim do Mar", "Sevilha" );

		List<String> listaFinal = new ArrayList<>();
		listaFinal.addAll( bairros1 );
		listaFinal.addAll( bairros2 );

		return listaFinal.get( random.nextInt( listaFinal.size() ) );
	}
	
	default String geraBanco() {
		
		StringBuilder cdBanco = new StringBuilder();
		
		while( cdBanco.length() < 3) {
			cdBanco.append( random.nextInt(10) );
		}
		
		return cdBanco.toString();
	}

	default String geraAgencia() {
		
		StringBuilder cdAgencia = new StringBuilder();
		
		while( cdAgencia.length() < 10) {
			cdAgencia.append( random.nextInt(10) );
		}
		
		return cdAgencia.toString() + "-" + random.nextInt(100);
	}

	default String geraGeraConta() {
		
		StringBuilder cdBanco = new StringBuilder();
		
		while( cdBanco.length() < 15) {
			cdBanco.append( random.nextInt(10) );
		}
		
		return cdBanco.toString() + "-" + random.nextInt(500);
	}
	
	public String geraNome();

	public String geraSobrenome();

}
