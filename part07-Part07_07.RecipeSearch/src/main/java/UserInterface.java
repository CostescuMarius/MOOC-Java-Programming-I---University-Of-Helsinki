
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coste
 */
public class UserInterface {
    Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.recipes = new ArrayList<>();
    }
    
    public void start() {
         
        readRecipe();
        
        System.out.println("Commands:\n" + 
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient");
        
        while(true) {
            System.out.println("Enter command: ");
            String input = scanner.nextLine();
            
            if(input.equals("stop")) {
                break;
            }
            
            if(input.equals("list")) {
                list();
            } else if(input.equals("find name")) {
                findName();
            } else if(input.equals("find cooking time")) {
                findCookingTime();
            } else if(input.equals("find ingredient")) {
                findIngredient();
            }
        }
    }
    
    public void readRecipe() {
        System.out.println("File to read: ");

        String input = scanner.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(input))) {
            int partOfReading = 0;
            String name = "";
            int cookingTime = 0;
            ArrayList<String> readIngredients = new ArrayList<>();
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                
                if(line.isEmpty()) {
                    partOfReading = 3;
                }
                
                if(partOfReading == 0) {
                    name = line;
                    partOfReading++;
                } else if(partOfReading == 1) {
                    cookingTime = Integer.valueOf(line);
                    partOfReading++;
                } else if(partOfReading == 2) {
                    readIngredients.add(line);
                } else if(partOfReading == 3) {
                    recipes.add(new Recipe(name, cookingTime, readIngredients));
                    readIngredients = new ArrayList<>();
                    partOfReading = 0;
                }
                
                if(!fileScanner.hasNextLine()) {
                    recipes.add(new Recipe(name, cookingTime, readIngredients));
                    readIngredients = new ArrayList<>();
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void list() {
        System.out.println("Recipes:");
        for(Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
    
    public void findName() {
        System.out.println("Searched word: ");
                
        String name = scanner.nextLine();
                
        System.out.println("Recipes:");
        
        for(Recipe recipe : recipes) {
            if(recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }        
    }
    
    public void findCookingTime() {
        System.out.println("Max cooking time: ");
                
        int cookingTime = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Recipes:");  
        
        for(Recipe recipe : recipes) {
            if(recipe.getCookingTime() <= cookingTime) {
                System.out.println(recipe);
            }
        }        
    }
    
    public void findIngredient() {
        System.out.println("Ingredient: ");
                
        String ingredient = scanner.nextLine();
        
        System.out.println("Recipes:");  
        
        for(Recipe recipe : recipes) {
            if(recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }        
    }
}
