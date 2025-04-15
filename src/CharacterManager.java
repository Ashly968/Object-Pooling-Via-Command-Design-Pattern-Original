import java.util.ArrayList;
import java.util.List;

public class CharacterManager {
    private final List<Character> characters = new ArrayList<>();

    // Method to create a new character
    public Character createCharacter(String name, Position position, ResourcePoints resourcePoints) {
        Character newCharacter = new Character(name, position, resourcePoints);
        characters.add(newCharacter);
        return newCharacter;
    }

    // Method to get a list of all characters
    public List<Character> getCharacters() {
        return characters;
    }

    // Other management methods (e.g., removeCharacter, findCharacterByName, etc.)
}
