package randomizador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomizadorDePessoaJuridica implements Irandomizador {

	@Override
	public String geraNome() {

		List<String> profissoes = Arrays.asList( "Vereador", "Vereadora", "Senadora", "Senador", "Doutor", "Doutora", "Enfermeiro", "Enfermeira", "Professor", "Professora", "Engenheiro", "Engenheira", "Advogado", "Advogada", "Jardineiro", "Jardineira", "Reporter", "Biologo", "Biologa", "Veterinario", "Veterinaria", "Alfaiate", "Cozinheiro", "Cozinheira", "Engraxate", "Domador", "Domadora", "Detetive", "Solador", "Soldadora", "Sapateiro", "Sapateira", "Tintureiro", "Tintureira", "Arquiteto", "Arquiteta", "Cabelereiro", "Cabelereira", "Barbeiro", "Corretor", "Corretora", "Agente", "Encanador", "Encanadora", "Biomedico", "Biomedica", "Acupunturista", "Economista", "Calculista", "Auditor" );
		List<String> profissoes2 = Arrays.asList( "Programador", "Programadora", "Contador", "Contadora", "Auditora", "Bailarino", "Bailarina", "Coletor", "Pesquisadora", "Pesquisador", "Estudante", "Costureiro", "Costureira", "Cervejeiro", "Cervejeira", "Sommelier", "Barista", "Atendente", "Superintendente", "Filosofo", "Filosa", "Dramaturgo", "Promotor", "Promotora", "Datilografo", "Datilografa", "Telefonista", "Auxiliar", "Fiscal", "Motorista", "Eletricista", "Coordenador", "Coordenadora", "Administrador", "Administradora", "Sociologo", "Sociologa", "Nutricionista", "Piloto", "Motorista", "Coreografo", "Palestrante", "Treinador", "Treinadora", "Estivador", "Pescador", "Sindicalista", "DJ", "Pintor", "Pintora" );
		List<String> lugares = Arrays.asList( "Sorveteria", "Escritorio", "Consultorio", "Advocacia", "Estudio", "Centro Comercial", "Galeria", "Farmacia", "Academia", "Madereira", "Central", "Central de Costura", "Vila", "Montadora", "Salão", "Centro de Eventos", "Consultoria", "Coletivo", "Transportadora", "Lojas", "Estadio", "Casa", "Papelaria", "Clinica Veterinaria", "Hospital", "Teatro", "Fazenda", "Hotel", "Atacado", "Joalheria", "Relojoaria", "Mecanica", "Borracharia", "Feira", "Funilaria", "Escola", "Universidade", "Sindicato", "Palacio", "Imobiliaria", "Concessionaria", "Supermercado", "Restaurante", "Banco", "Instituto", "Livraria", "Tabacaria", "Agropecuaria", "Clube", "Ferragem", "Choperia", "Bar" );

		List<String> listaFinal = new ArrayList<>();
		listaFinal.addAll( profissoes );
		listaFinal.addAll( profissoes2 );
		listaFinal.addAll( lugares );

		return listaFinal.get( random.nextInt( listaFinal.size() ) );

	}

	@Override
	public String geraSobrenome() {

		List<String> nomeLote1 = Arrays.asList( "Chiara", "Rosita", "Jacinto", "Roger", "Franchesca", "Gleisi", "Ash", "Viola", "Pavarotti", "Lira", "Sonya", "Thais", "Jamal", "Fabricio", "Robson", "Serafina", "Alba", "Elba", "Moises Rabelo", "Rollo", "Sahbrynna", "Samantha", "Celeste", "Jupiter", "Matteo", "Ruby", "Santiago", "Vivian", "Silas", "June", "Trinity", "Kamila", "Daiana", "Marcus", "Regina", "Roselaine", "Miranda", "Renata", "Isaias", "Leona", "Marilda", "Monica", "Aurelia", "Aurelio", "Abel", "Colmeia", "Jade", "Kali", "Kareem", "Cid" );
		List<String> nomeLote2 = Arrays.asList( "Megan", "Ariane", "Elanor", "Cora", "Willow", "Claire", "Adelaide", "Josephine", "Florence", "Beatrice", "Matilda", "Anna", "Liana", "Sarah", "Edith", "Rose", "Lydia", "Nora", "Martha", "Morgan", "Maisa", "Kathy", "Leela", "Juliane", "Larissa", "Laila", "Kely", "Samantha", "Isis", "Hild", "Grace", "Helga", "Savannah", "Doris", "Betty", "Agnes", "Louise", "Maude", "Lucinda", "Cecily", "Lavinia", "Yolanda", "Ilana", "Ida", "Harriet", "Jezebel", "Rachel", "Sophia", "Catherine", "Ella" );
		List<String> nomeLote3 = Arrays.asList( "Daniel", "Bruna", "Denise", "Lucas", "Leandro", "Henrique", "Carlos", "Matheus", "Ricardo", "Reinaldo", "Ofelia", "Wanderson", "Guilherme", "Bianca", "Yuri", "Cecilia", "Raíssa", "Fernando", "Andreia", "Andrei", "Edgar", "Samuel", "Carolina", "Luan", "Gilson", "Kaue", "Robson", "Marcos", "Silvana", "Janaina", "Gilnei", "Luana", "Isadora", "Isabela", "Karine", "Vanderlei", "Antonio", "Gabriel", "Gabriela", "Sandra", "Soraya", "Helena", "Eliseu", "Thiago", "José", "Maria", "Pedro", "Cássio", "Marlon", "Homero" );
		List<String> sobrenomeHolandes = Arrays.asList( "Van der Vaart", "Van Gogh", "Van der Sar", "Sneijder", "de Boer", "Kuyt", "Van Bronckhorst", "Robben", "Cocu", "Seedorf", "Heitinga", "Van Persie", "BergKamp", "Van Nistelrooy", "Crujiff", "Van Hasselt", "Chadwick", "Hogan", "Reynolds", "Kaufman", "Donenfeld", "Knobel", "Beenhakker", "Advocaat", "Hiddink", "Rijkaard", "Van Gaal", "Van Marwijk", "Hiddin", "Bidloo", "Van Boxsel", "De Vries", "Rookmaaker", "Lemmens", "Hoet", "Hollander", "Kraan", "Van Lierde", "Schouten", "Nooteboom", "Van Schurman", "Dagelet", "Stadius", "Van der Vat", "Drucker", "Verhoeven", "Van Wageningen", "Hepburn", "Vab Dijk", "Rijker" );
		List<String> sobrenomeAlemao = Arrays.asList( "Weber", "Klein", "Scherer", "Schmidt", "Hoffmann", "Becker", "Wagner", "Muller", "Schneider", "Rech", "Kuhn", "Brand", "Ritter", "LudWig", "Graf", "Gruber", "Jung", "Ruschel", "Krause", "Wener", "Fischer", "Meyer", "Schulz", "Schafer", "Koch", "Bauer", "Richter", "Neumann", "Zimmermann", "Hartmann", "Kruger", "Lange", "Lehmann", "Huber", "Vogel", "Gunther", "Berger", "Baumann", "Albrecht", "Vogt", "Berwald", "Ammer", "Ehrenberg", "Falkenberg", "Boehler", "Kurtz", "Mann", "Schiller", "Seifer", "Bach" );
		List<String> sobrenomeItaliano = Arrays.asList( "Rossi", "Bernardi", "De Luca", "Lombardi", "Fontana", "Valente", "Ferrari", "Esposito", "Bianchi", "Romano", "Ricci", "Bellini", "Ferragni", "Lancellotti", "Savoia", "Gonzaga", "Collalto", "Galaretto", "Vacchiano", "Caccini", "Macerata", "Pagano", "Panazzolo", "Santoro", "Pellegrini", "Greco", "Gallo", "Silvestri", "Benedetti", "Mazza", "Giuliani", "Rizzi", "Basile", "Neri", "Romeo", "Sorrentino", "Ferrara", "Fabiani", "Fabbri", "Farina", "Fiore", "Colombo", "Coppola", "Conti", "Caruso", "Carbone", "Moretti", "Luvizzoto", "Regio", "Trevisano" );

		List<String> listaFinal = new ArrayList<>();
		listaFinal.addAll( nomeLote1 );
		listaFinal.addAll( nomeLote2 );
		listaFinal.addAll( nomeLote3 );
		listaFinal.addAll( sobrenomeHolandes );
		listaFinal.addAll( sobrenomeAlemao );
		listaFinal.addAll( sobrenomeItaliano );

		return listaFinal.get( random.nextInt( listaFinal.size() ) );
	}

	public String geraCNPJ() {

		StringBuilder geradorDeCNPJ = new StringBuilder();
		while( geradorDeCNPJ.length() < 12 ) {
			geradorDeCNPJ.append( random.nextInt( 10 ) );
		}

		int digitoVerificador1 = 0;
		int digitoCNPJ = 0;
		int multiplicador = 5;
		for( int i = 1; i <= geradorDeCNPJ.length(); i++ ) {
			digitoCNPJ = Integer.parseInt( geradorDeCNPJ.substring( i - 1, i ) );
			digitoVerificador1 = digitoVerificador1 + digitoCNPJ * multiplicador;

			if( multiplicador == 2 ) {
				multiplicador = 9;
			} else {
				multiplicador--;
			}
		}

		int resto = ( digitoVerificador1 % 11 );
		if( resto < 2 ) {
			geradorDeCNPJ.append( 0 );
		} else {
			geradorDeCNPJ.append( 11 - resto );
		}

		int digitoVerificador2 = 0;
		multiplicador = 6;
		for( int i = 1; i < geradorDeCNPJ.length() + 1; i++ ) {
			digitoCNPJ = Integer.parseInt( geradorDeCNPJ.substring( i - 1, i ) );
			digitoVerificador2 = digitoVerificador2 + digitoCNPJ * multiplicador;

			if( multiplicador == 2 ) {
				multiplicador = 9;
			} else {
				multiplicador--;
			}
		}

		resto = ( digitoVerificador2 % 11 );
		if( resto < 2 ) {
			geradorDeCNPJ.append( 0 );
		} else {
			geradorDeCNPJ.append( 11 - resto );
		}

		return geradorDeCNPJ.toString();
	}
	
	public int geraCRM() {
		return random.nextInt( 100000 );
	}

	public String geraINSS() {

		StringBuilder inss = new StringBuilder();

		while( inss.length() < 12 ) {
			inss.append( random.nextInt( 10 ) );

		}

		return inss.toString();
	}

	public String geraISS() {

		StringBuilder iss = new StringBuilder();

		while( iss.length() < 9 ) {
			iss.append( random.nextInt( 10 ) );

		}

		return iss.toString();

	}

}
