package randomizador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomizadorDePessoaFisica implements Irandomizador {

	@Override
	public String geraNome() {

		List<String> nomeLote1 = Arrays.asList( "Jasper", "Bob", "August", "James", "Hazel", "Oscar", "Henry", "Theo", "Alexander", "Levi", "Benjamin", "Sebastian", "Elijah", "Nathaniel", "Josiah", "Louis", "Ferdinand", "Samuel", "Olive", "Phineas", "Calvin", "Walter", "Theodore", "Charles", "Julian", "Winfred", "Frederick", "Ralph", "Chester", "Philip", "George", "Ivan", "Vladimir", "Edward", "Liu", "Joseph", "William", "Ronald", "Gerald", "Richard", "John", "Herbert", "Warren", "James", "Andrew", "Zachary", "Thomas", "Leopold", "Maximilian", "Rudolf" );
		List<String> nomeLote2 = Arrays.asList( "Megan", "Ariane", "Elanor", "Cora", "Willow", "Claire", "Adelaide", "Josephine", "Florence", "Beatrice", "Matilda", "Anna", "Liana", "Sarah", "Edith", "Rose", "Lydia", "Nora", "Martha", "Morgan", "Maisa", "Kathy", "Leela", "Juliane", "Larissa", "Laila", "Kely", "Samantha", "Isis", "Hild", "Grace", "Helga", "Savannah", "Doris", "Betty", "Agnes", "Louise", "Maude", "Lucinda", "Cecily", "Lavinia", "Yolanda", "Ilana", "Ida", "Harriet", "Jezebel", "Rachel", "Sophia", "Catherine", "Ella" );
		List<String> nomeLote3 = Arrays.asList( "Daniel", "Bruna", "Denise", "Lucas", "Leandro", "Henrique", "Carlos", "Matheus", "Ricardo", "Reinaldo", "Ofelia", "Wanderson", "Guilherme", "Bianca", "Yuri", "Cecilia", "Raíssa", "Fernando", "Andreia", "Andrei", "Edgar", "Samuel", "Carolina", "Luan", "Gilson", "Kaue", "Robson", "Marcos", "Silvana", "Janaina", "Gilnei", "Luana", "Isadora", "Isabela", "Karine", "Vanderlei", "Antonio", "Gabriel", "Gabriela", "Sandra", "Soraya", "Helena", "Eliseu", "Thiago", "José", "Maria", "Pedro", "Cássio", "Marlon", "Homero" );
		List<String> nomeLote4 = Arrays.asList( "Ariel", "Muriel", "Clarisse", "Dominique", "Andreia", "Elliot", "Ryan", "Zélia", "Alison", "Azor", "Kim", "Bertrand", "Arthur", "Raven", "Eloá", "Dioneia", "Serafim", "Carlos Henrique", "Marco Antonio", "Adelaide", "Liam", "Naomi", "Naiara", "Sasha", "Tomaz", "Thaís", "Taís", "Elaine", "Ana Maria", "Luís", "Claudio", "Maria Clara", "Julio Cesar", "Paola", "Pauline", "Ana Paula", "Enzo", "Enzo Gabriel", "Jussara", "Thuane", "Luis Carlos", "Edimeia", "Phoebe", "Dilan", "Lee", "Dakota", "Judy", "Ross", "Turin", "Noah" );
		List<String> nomeLote5 = Arrays.asList( "Chiara", "Rosita", "Jeronimo", "Roger", "Franchesca", "Gleisi", "Ash", "Viola", "Penélope", "Estela", "Sonya", "Pietra", "Jamal", "Fabricio", "Robson", "Serafina", "Alba", "Elba", "Moises", "Rollo", "Sabrinna", "Quirino", "Celeste", "Jupiter", "Matteo", "Ruby", "Santiago", "Vivian", "Silas", "June", "Trinity", "Kamila", "Daiana", "Marcus", "Regina", "Roselaine", "Miranda", "Renata", "Isaias", "Leona", "Marilda", "Monica", "Aurelia", "Aurelio", "Abel", "Catia", "Jade", "Kalil", "Kareem", "Cid" );
		List<String> nomeLote6 = Arrays.asList( "Logan", "Lily", "Linus", "Rebecca", "Maria Isabel", "Paulo", "Paris", "Maria Clara", "Dora", "Ramon", "Cora", "Danielle", "Jon", "Summer", "Jessica", "Joshua", "Nestor", "Matthew", "Jean", "Lester", "Elisabeth", "Hollie", "Neveah", "Philliph", "Filipe", "Rodrigo", "Ulysses", "Vladimir", "Milene", "Millicent", "Rachel", "Harley", "Ethan", "Joana", "Victor Hugo", "Silas", "Isaque", "Bento", "André Carlos", "Giovane", "Virgilio", "Dalia", "Lucas Daniel", "Daniel Alves", "Valentin", "Lauri Ann", "Hope", "Sandrine", "Tony", "Homero" );
		List<String> nomeLote7 = Arrays.asList( "Bento", "Francisco", "Iago", "Dakota", "Manuel", "Fabricio Antunes", "Cirio", "Laercio", "Charles", "Denzel", "Naomi", "Ashton", "Jake", "Nia", "Leah", "Reginaldo", "Michael", "Min-ji", "Chae-won", "Mi-suk", "Min-ji", "Martin", "Clint", "Trent", "Ricardo Veloso", "Mel", "Ned", "Morgana", "Lee-Sang", "Ho-Chin-Mi", "Jian", "Jheremy", "Yara", "Isaque", "Zander", "Henry", "Luís Paulo", "Nicholas", "Gael", "Roland", "Ruben", "Ketlin", "Sarai", "Celine", "Gustav", "Kristoffer", "Gavin", "Estela", "Yan", "Yasin" );

		List<String> listaFinal = new ArrayList<>();
		listaFinal.addAll( nomeLote1 );
		listaFinal.addAll( nomeLote2 );
		listaFinal.addAll( nomeLote3 );
		listaFinal.addAll( nomeLote4 );
		listaFinal.addAll( nomeLote5 );
		listaFinal.addAll( nomeLote6 );
		listaFinal.addAll( nomeLote7 );

		return listaFinal.get( random.nextInt( listaFinal.size() ) );
	}
	
	@Override
	public String geraSobrenome() {

		List<String> sobrenomeLote1 = Arrays.asList( "Smith", "Jones", "Williams", "Tayor", "Davies", "Thomas", "Johnson", "Roberts", "Walker", "Wright", "Robinson", "Thompson", "White", "Black", "Hughes", "Edwards", "Green", "Lewis", "Wood", "Harris", "Martin", "Jackson", "Clarke", "May", "Abner", "Alder", "Bagg", "Chaplin", "Croft", "Deville", "Dyer", "Esco", "Everard", "Avery", "Flemmings", "Fletcher", "Ford", "Folley", "Gibert", "Hamill", "Hancock", "Hanke", "Kay", "Lancaster", "Lawrence", "Lockwood", "Longwell", "Cornwell", "Nevis", "Patridge" );
		List<String> sobrenomeLote2 = Arrays.asList( "Almeida", "Alves", "Andrade", "Barbosa", "Barros", "Batista", "Borges", "Campos", "Cardoso", "Carvalho", "Castro", "Costa", "Dias", "Duarte", "Freitas", "Fernandes", "Ferreira", "Garcia", "Gomes", "Gonçalves", "Lima", "Lopes", "Machado", "Marques", "Martins", "Medeiros", "Melo", "Mendes", "Miranda", "Monteiro", "Moraes", "Moreira", "Moura", "Nascimento", "Nunes", "Oliveira", "Pereira", "Ramos", "Reis", "Ribeiro", "Rocha", "Santana", "Santos", "Silva", "Soares", "Souza", "Teixeira", "Vieira", "De Melo", "Da Silva" );
		List<String> sobrenomeLote3 = Arrays.asList( "Weber", "Klein", "Scherer", "Schmidt", "Hoffmann", "Becker", "Wagner", "Muller", "Schneider", "Rech", "Kuhn", "Brand", "Ritter", "LudWig", "Graf", "Gruber", "Jung", "Ruschel", "Krause", "Wener", "Fischer", "Meyer", "Schulz", "Schafer", "Koch", "Bauer", "Richter", "Neumann", "Zimmermann", "Hartmann", "Kruger", "Lange", "Lehmann", "Huber", "Vogel", "Gunther", "Berger", "Baumann", "Albrecht", "Vogt", "Berwald", "Ammer", "Ehrenberg", "Falkenberg", "Boehler", "Kurtz", "Mann", "Schiller", "Seifer", "Bach" );
		List<String> sobrenomeLote4 = Arrays.asList( "Rossi", "Bernardi", "De Luca", "Lombardi", "Fontana", "Valente", "Ferrari", "Esposito", "Bianchi", "Romano", "Ricci", "Bellini", "Ferragni", "Lancellotti", "Savoia", "Gonzaga", "Collalto", "Galaretto", "Vacchiano", "Caccini", "Macerata", "Pagano", "Panazzolo", "Santoro", "Pellegrini", "Greco", "Gallo", "Silvestri", "Benedetti", "Mazza", "Giuliani", "Rizzi", "Basile", "Neri", "Romeo", "Sorrentino", "Ferrara", "Fabiani", "Fabbri", "Farina", "Fiore", "Colombo", "Coppola", "Conti", "Caruso", "Carbone", "Moretti", "Luvizzoto", "Regio", "Trevisano" );
		List<String> sobrenomeLote5 = Arrays.asList( "Ruchaid", "Abdallah", "Ayad", "Aziz", "Badawi", "Bakir", "Bashar", "Faez", "Faheem", "Ghazawwi", "Hadi", "Hadid", "Hariri", "Ibrahim", "Hijazi", "Maluf", "Jalal", "Jameel", "Kashif", "Kassab", "Mohammed", "Mustafa", "Nabih", "Nadji", "Ramzi", "Reza", "Rashid", "Shariq", "Saqqaf", "Sultan", "Yasin", "Feguri", "Haddad", "Gastin", "Abdo", "Al-Abadi", "Al-Kudsi", "Al-Sabbah", "Al-Makki", "Al-Amari", "Al-Haroon", "Al-Attar", "Elmahdy", "Arafa", "Cohen", "Mesbah", "Mubarak", "Fakhry", "Bazzi", "Tawil" );
		List<String> sobrenomeLote6 = Arrays.asList( "Adamis", "Carvalho", "Alejos", "Arzola", "Aybar", "Baeza", "Balma", "Barrios", "Bosque", "Busano", "Bonilla", "Calzada", "Camacho", "Casco", "Cuevas", "Darcia", "De Prado", "Duval", "De Rayo", "Espinoza", "Faba", "Fabregat", "Freyre", "Rodrigues", "Lopes", "Costa", "Fonseca", "Balboa", "Bulhão", "Coruja", "Guedes", "Leão", "Leal", "Morales", "Medina", "Matoso", "Oliveira", "Neves", "Nogueira", "Perdigão", "Pinto", "Pires", "Pizarro", "Quadros", "Queiroz", "Ruiz", "Roldão", "De Sa", "Souto", "Villella" );
		List<String> sobrenomeLote7 = Arrays.asList( "Martin", "Martel", "Bernard", "Durand", "Dubois", "Moreau", "Da Vinci", "Laurent", "Chapelle", "Fay", "Gerard", "Guillaume", "Heroux", "Laframboise", "Plessis", "Poirot", "Renouard", "Renoir", "Simon", "Vaux", "Bascher", "Bazelaire", "Beauffort", "Bachelet", "Bonaparte", "Bontemps", "Bourbon", "Chateaubriant", "Corse", "Couppel", "Dauphiné", "Flandre", "Froissard", "Gabaret", "Giraud", "Goulaine", "Goyon", "Larminat", "Lyonnais", "Maillard", "Monicault", "Montberon", "Orléans", "Picardie", "Zola", "Sand", "Baudelaire", "Verne", "Rostand", "Diderot" );
		List<String> sobrenomeLote8 = Arrays.asList( "Van der Vaart", "Van Gogh", "Van der Sar", "Sneijder", "de Boer", "Kuyt", "Van Bronckhorst", "Robben", "Cocu", "Seedorf", "Heitinga", "Van Persie", "BergKamp", "Van Nistelrooy", "Crujiff", "Van Hasselt", "Chadwick", "Hogan", "Reynolds", "Kaufman", "Donenfeld", "Knobel", "Beenhakker", "Advocaat", "Hiddink", "Rijkaard", "Van Gaal", "Van Marwijk", "Hiddin", "Bidloo", "Van Boxsel", "De Vries", "Rookmaaker", "Lemmens", "Hoet", "Hollander", "Kraan", "Van Lierde", "Schouten", "Nooteboom", "Van Schurman", "Dagelet", "Stadius", "Van der Vat", "Drucker", "Verhoeven", "Van Wageningen", "Hepburn", "Vab Dijk", "Rijker" );

		List<String> listaFinal = new ArrayList<>();
		listaFinal.addAll( sobrenomeLote1 );
		listaFinal.addAll( sobrenomeLote2 );
		listaFinal.addAll( sobrenomeLote3 );
		listaFinal.addAll( sobrenomeLote4 );
		listaFinal.addAll( sobrenomeLote5 );
		listaFinal.addAll( sobrenomeLote6 );
		listaFinal.addAll( sobrenomeLote7 );
		listaFinal.addAll( sobrenomeLote8 );

		return listaFinal.get( random.nextInt( listaFinal.size() ) );
	}


	public String geraCNS() {

		List<String> digitoInicialValido = Arrays.asList( "1", "2", "7", "8", "9" );
		String digitoInicial = digitoInicialValido.get( random.nextInt( digitoInicialValido.size() ) );
		StringBuilder geradorDeCNS = new StringBuilder( digitoInicial );

		while( geradorDeCNS.length() < 11 ) {
			geradorDeCNS.append( random.nextInt( 10 ) );
		}

		int soma = 0;
		int multiplicador = 15;
		String cns = geradorDeCNS.toString();

		for( int i = 0; i < cns.length(); i++ ) {
			soma = soma + ( Integer.parseInt( cns.substring( i, i + 1 ) ) * multiplicador );
			multiplicador--;
		}

		String result = "";
		int resto = soma % 11;
		int digitoVerificador = 11 - resto;

		if( digitoVerificador == 11 ) {
			digitoVerificador = 0;
		}

		if( digitoVerificador == 10 ) {
			soma += 2;

			resto = soma % 11;
			digitoVerificador = 11 - resto;

			result = cns + "001" + digitoVerificador;
		} else {
			result = cns + "000" + digitoVerificador;
		}

		return result;
	}
	
	public String geraCPF() {

		StringBuilder geradorDeCPF = new StringBuilder();
		while( geradorDeCPF.length() < 11 ) {
			geradorDeCPF.append( random.nextInt( 10 ) );
		}

		int digitoVerificador1 = 0;
		int digitoVerificador2 = 0;
		int digitoCPF;
		for( int i = 1; i < geradorDeCPF.length() - 1; i++ ) {
			digitoCPF = Integer.parseInt( geradorDeCPF.substring( i - 1, i ) );
			digitoVerificador1 = digitoVerificador1 + ( 11 - i ) * digitoCPF;
			digitoVerificador2 = digitoVerificador2 + ( 12 - i ) * digitoCPF;
		}

		Integer digito1 = 0;
		Integer digito2 = 0;
		int resto = 0;
		resto = ( digitoVerificador1 % 11 );
		if( resto < 2 ) {
			digito1 = 0;
		} else {
			digito1 = 11 - resto;
		}
		digitoVerificador2 += 2 * digito1;
		resto = ( digitoVerificador2 % 11 );
		if( resto < 2 ) {
			digito2 = 0;
		} else {
			digito2 = 11 - resto;
		}

		return geradorDeCPF.toString().substring( 0, 9 ).concat( digito1.toString() ).concat( digito2.toString() );
	}

	public String geraRG() {

		StringBuilder rg = new StringBuilder();

		while( rg.length() < 10 ) {
			rg.append( random.nextInt( 10 ) );
		}

		return rg.toString();
	}
	
}
