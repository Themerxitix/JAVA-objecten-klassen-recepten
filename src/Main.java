public class Main
{
    public static void main(String[] args)
    {
        AppelPieRecipe.ovenOpwarmen();
        AppelPieRecipe.eiOpkloppen();
        AppelPieRecipe.mengenEnVerdelen();
        AppelPieRecipe.appelsSchillenEnVermengenMetSuikerEnKaneel();
        AppelPieRecipe.springVormVetten();
        AppelPieRecipe.deegGebruik();
        AppelPieRecipe.mengsuikerAppelsEnKaneel();
        AppelPieRecipe.deegOprollenTotDunneLap();
        AppelPieRecipe.strokenOpleggen();
        AppelPieRecipe.taartInDeOven();

        Ingredient kaneel = new Ingredient(170, 2, "kaneel");
        AppelPieRecipe.printIngredients(kaneel);

        //alle stappen in een keer
        AppelPieRecipe.printStappenUit();

        //recept tagiatelle met tomattjes
        AppelPieRecipe.displayTagiatelleMetTomaatjes();
    }
}
