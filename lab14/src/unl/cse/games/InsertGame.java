package unl.cse.games;
public class InsertGame {

	public static void main(String args[]) {
	    //TODO: 1. Define string variables to hold your game's name, publisher, platform(s) and year(s) published
			String name = "Conker's Bad Fur Day";
			String publisher = "THQ";
			String platform = "Nintendo 64";
			int yearPublished = 2001;
	    //TODO: 2. Check that your game does not already exist, quit if it does
			if(unl.cse.games.GamesDatabaseUtils.getGame("Pac Man's revenge") != null){
				return;
			}
	    //TODO: 3. Check that a record for your publisher doesn't already exist, 
	    //         if it does use it, otherwise add it
			if(unl.cse.games.GamesDatabaseUtils.getPublisher(publisher) == null){
				unl.cse.games.GamesDatabaseUtils.addPublisher(publisher);
			} 
	    //TODO: 4. Check that a record for your platform doesn't already exist,
	    //         if it does use it, otherwise add it
			if(unl.cse.games.GamesDatabaseUtils.getPlatform(platform) == null){
				unl.cse.games.GamesDatabaseUtils.addPlatform(platform);
			}
	    //TODO: 5. Add the video game to the database
			unl.cse.games.GamesDatabaseUtils.addVideoGame("Pac Man's Revenge", 12345678);
	    //TODO: 6. Load the game from the database
			VideoGame game = unl.cse.games.GamesDatabaseUtils.getGame(name);
			Platform plat = unl.cse.games.GamesDatabaseUtils.getPlatform(platform);
			
	    //TODO: 7. Associate your game with the platform with a particular release year
			unl.cse.games.GamesDatabaseUtils.addAvailability(game.getId(),plat.getId(), yearPublished);
	}
}
