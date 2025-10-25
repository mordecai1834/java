import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileIOPart2{
    private static int getLineCount(String path) throws IOException {
        File file = new File("First-Generation-Pokemon.csv");
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("First-Generation-Pokemon.csv"))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            
            throw e;
        }

        return lineCount;
    }

    private static Pokemon[] readGameFromFile(String path) throws IOException {
    int numPokemons = getLineCount(path) - 1; 
    Pokemon[] pokemons = new Pokemon[numPokemons];
    
    try(BufferedReader reader = new BufferedReader(new FileReader("First-Generation-Pokemon.csv"))) {
    String line = reader.readLine(); 
    
    for(int i = 0; i<numPokemons; i++){
        line = reader.readLine(); 
        String[] columns = line.split(",");
        String name = columns[1].trim();
        String type1 = columns[2].trim();
        String type2 = columns[3].trim();
        int HP = Integer.parseInt(columns[4].trim());
        int Attack = Integer.parseInt(columns[5].trim());
        int Defense = Integer.parseInt(columns[6].trim());
        int Special = Integer.parseInt(columns[7].trim());
        int Speed = Integer.parseInt(columns[8].trim());

        
        pokemons[i] = new Pokemon(name,  type1,  type2,  HP,  Attack,  Defense,  Special,  Speed); 
    }
    
    
    
    
    }catch(IOException e){
    throw e; 
    }
    return pokemons;
    }
    private static void sortByAttack(Pokemon[] pokemons) {
    int n = pokemons.length; 
    for (int i = 0; i < n - 1; i++) {
        int min_index = i; 
        for (int j = i + 1; j < n; j++) {
            if (pokemons[j].getAttack() < pokemons[min_index].getAttack()) {
                min_index = j;
            }
        }
        
        if (min_index != i) {
            Pokemon temp = pokemons[i];
            pokemons[i] = pokemons[min_index];
            pokemons[min_index] = temp;
        }
    }
}
private static void writePokemonToFile(Pokemon pokemons, String path ) throws IOException{ 
try(BufferedWriter writer = new BufferedWriter(new FileWriter ("First-Generation-Pokemon.csv",true)))
{ String line = String.format( "%-12s %-10s %-10s HP:%3d Atk:%3d Def:%3d Spc:%3d Spd:%3d%n", 
    pokemons.getName(), pokemons.gettype1(), pokemons.gettype2(), pokemons.getHP(), pokemons.getAttack(), pokemons.getDefense(), pokemons.getSpecial(), pokemons.getSpeed() ); writer.write(line); } 
    catch(IOException e){ throw e; } }

public static void main(String[] args) {
    String filePath = "First-Generation-Pokemon.csv";
    Pokemon[] pokemons = null; 
    
    try {
        pokemons = readGameFromFile("First-Generation-Pokemon.csv");
        sortByAttack(pokemons);
    }
    catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
        return;
    }
    catch (NumberFormatException e) {
        System.out.println("Error parsing number: " + e.getMessage());
        return; 
    }
    catch (Exception e) {
        System.out.println("An unexpected error occurred: " + e.getMessage());
        return;

    
    
    }
    if (pokemons != null){
    
    for (int i = 0; i<pokemons.length; i++) {
    System.out.println(pokemons[i]);
}
    
}
Pokemon Snivy = new Pokemon("Snivy", "Grass", "cheese", 100,200,300,400,500);
 try { writePokemonToFile(Snivy, "First-Generation-Pokemon.csv"); } 
 catch (IOException e) { System.out.println("Error writing Pokemon: " + e.getMessage()); }



}





    
    
    }
