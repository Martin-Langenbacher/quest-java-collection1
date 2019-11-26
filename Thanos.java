import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    	ArrayList<Hero> heroes = new ArrayList<>();
   	
    	
        // TODO 2 : Add those heroes to the list
    	Hero blackWidow = new Hero ("Black Widow", 34);
    	Hero captainAmerica = new Hero ("Captain America", 100);
    	Hero vision = new Hero ("Vision", 3);
    	Hero ironMan = new Hero ("Iron Man", 48);
    	Hero scarletWitch = new Hero ("Scarlet Witch", 29);
    	Hero thor = new Hero ("Thor", 1500);
    	Hero spiderMan = new Hero ("Spider-Man", 18);
    	Hero hulk = new Hero ("Hulk", 49);
    	Hero doctorStrange = new Hero ("Doctor Strange", 42);
    	
    	heroes.add(blackWidow);
    	heroes.add(captainAmerica);
    	heroes.add(vision);
    	heroes.add(ironMan);
    	heroes.add(scarletWitch);
    	heroes.add(thor);
    	heroes.add(spiderMan);
    	heroes.add(hulk);
    	heroes.add(doctorStrange);
    	    	
    	
        // TODO 3 : It's Thor birthday, now he's 1501
    	thor.setAge(1501);
    	   	

        // TODO 4 : Shuffle the heroes list
    	 // shuffle or randomize
        Collections.shuffle(heroes);
    	

        // TODO 5 : Keep only the half (top half) of the list
        for (int i = 8; i >= 4; i--) {
        	heroes.remove(i);
        	}
        

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (int i = 0; i < 4; i++) {
        	Hero standingHero = heroes.get(i); // Get the item i from the list
        	System.out.println(standingHero.getName()); // This will display the remaining list.
        	}
        
    }
}