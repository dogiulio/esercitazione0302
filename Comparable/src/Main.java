import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;
public class Main {
	public static void main(String[] args) {
		
		ArrayList<Giocatore> squadra = new ArrayList<>();
		
		Giocatore giocatore1 = new Giocatore(59, "Ronaldo", "Cristiano", 36);
		Giocatore giocatore2 = new Giocatore(67, "Messi", "Lionel", 34);
		Giocatore giocatore3 = new Giocatore(45, "Ibrahimovic", "Zlatan", 40);
		
		squadra.add(giocatore1);
		squadra.add(giocatore2);
		squadra.add(giocatore3);

	    System.out.println("Prima dell'ordinamento: ");
	   
        Iterator <Giocatore> iterator = squadra.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().getCognome() + " ");
        }
      
	    Collections.sort(squadra);
	    System.out.println("\n");
	    System.out.println("Dopo l'ordinamento: ");
	    
        Iterator <Giocatore> iterator2 = squadra.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next().getCognome() + " ");
        }
        
     	System.out.println("\n");
    
    	JSONObject oggettoJson = new JSONObject();
    	oggettoJson.put("nome", "rocco");
    	oggettoJson.put("eta", "18");
    	oggettoJson.put("citta", "casamassima");
    
    	//System.out.println(oggettoJson);	
    	JSONObject oggettoJson2 = new JSONObject(squadra.get(2));
    	System.out.println(oggettoJson2);
    	JSONArray arrayJson = new JSONArray(squadra);
     
    	System.out.println("\n"+arrayJson);    
	}	
}
