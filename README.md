# IIKH: Interactive Intelligent Kitchen Helper 

#Problem Statement : 
The Interactive Intelligent Kitchen Helper (IIKH) is a PC-based application that will replace the index-card system of recipes found in the average kitchen. But more than simply maintaining a database of recipes, the kitchen helper assists in the planning of meals for an extended period, say a week. The user of the IIKH can sit down at a terminal, browse the database of recipes, and interactively create a series of menus. The IIKH will automatically scale the recipes to any number of servings and will print out menus for the entire week, for a particular day, or for a particular meal. And it will print an integrated grocery list of all the items needed for the recipes for the entire period.<br />

#Approach:
Here we are using the Model View Controller approach. The Database Manager which is our model interacts with the database and gets us the list of recipes which are then modified, added etc… by the Recipe Browser which is our controller and this finally displays our output via the IIKH Main to the Screen. Similar is the case with Meal Manager, Meal database and Meal Browser. The Data is stored in a text file in form of a string which has separations using -- and ,,<br />

#Explanation:
The objects of the Recipe Class have three parameters, name, ingredient list and method list in them. These objects have two methods edit and view which are self-explanatory from their name. The DatabaseManager makes a list of all the data available in the database in form of an Array List of Recipe Objects. This list is used for all the display, edit, add, and delete operations by the RecipeBrowser . The objects of the Meal Class have two parameters, Recipe List of the day and the day number. The Recipe list of the day consists of four recipes corresponding to breakfast, lunch, snacks and dinner. The MealManager makes a list of all the data available in the meal database in form of an array list of objects of class meal. This list is then used by the MealBrowser for manipulation and display purposes.<br />
 
#NOTE: 
The recipe list in the objects of meal class can only have those recipes which are present in the recipe database and hence, when one adds a meal , he is given a choice to choose from the list of recipes present in the recipe database via the recipe browser.
