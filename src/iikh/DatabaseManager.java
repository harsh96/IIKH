package iikh;

import java.io.*;
import java.util.*;

public class DatabaseManager
{
    private String databaseName = "recipe.txt";

    private String convertToString(Recipe recipe)
    {
        //This method is used for converting the data into string for writing into text file
        //Ingridients and method have an internal separation with ',,'
        //name , ingridients and method is seperated by '--'
        String recipeName = recipe.name;
        ArrayList <String> ingredients = recipe.ingredients;
        ArrayList <String> method = recipe.method;
        String output = recipeName + "--";
        output = ingredients.stream().map((i) -> (i + ",,")).reduce(output, String::concat);
        output += "--";
        output = method.stream().map((i) -> (i + ",,")).reduce(output, String::concat);
        return output;
    }

    public ArrayList<Recipe> readRecipeDatabase() throws Exception
    {
        String line;
        ArrayList<Recipe> recipeList = new ArrayList<>();
        Recipe tempRecipe;
        ArrayList<String> tempList;
        BufferedReader br;
        br = new BufferedReader(new FileReader(databaseName));
        while ((line = br.readLine()) != null)
        {
            tempRecipe = new Recipe();
            String[] temp = line.split("--");
            tempRecipe.name = temp[0];
            tempList = new ArrayList<>(Arrays.asList(temp[1].split(",,")));
            tempRecipe.ingredients = tempList;
            tempList = new ArrayList<>(Arrays.asList(temp[2].split(",,")));
            tempRecipe.method = tempList;
            recipeList.add(tempRecipe);
        }
        return recipeList;
    }
    public void writeRecipeDatabase(ArrayList<Recipe> recipeList) throws Exception
    {
        String output = "";
        for(Recipe recipe : recipeList)
        {
            output += convertToString(recipe);
            output += '\n';
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(databaseName));
        writer.write(output);
        writer.close();
    }
}
