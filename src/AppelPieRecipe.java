public class AppelPieRecipe
{

    //stap 1
    public static void ovenOpwarmen()
    {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte).\n");
    }

    //stap 2
    public static void eiOpkloppen()
    {
        System.out.println("\tKlop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.\n");
    }

    //stap 3
    public static void mengenEnVerdelen()
    {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.\n");
    }

    //stap 4
    public static void appelsSchillenEnVermengenMetSuikerEnKaneel()
    {
        System.out.println("\tSchil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.\n");
    }

    //stap 5
    public static void springVormVetten()
    {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.\n");
    }

    //stap 6
    public static void deegGebruik()
    {
        System.out.println("\tGebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.\n");
    }

    //stap 7
    public static void mengsuikerAppelsEnKaneel()
    {
        System.out.println("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.\n");
    }

    //stap 8
    public static void deegOprollenTotDunneLap()
    {
        System.out.println("\tRol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.\n");
    }

    //stap 9
    public static void strokenOpleggen()
    {
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken\n");
    }

    //stap 10
    public static void taartInDeOven()
    {
        System.out.println("\tZet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.\n");
    }

    //ingredienten uitprinten
    public static void printIngredients(Ingredient ingredient)
    {
        System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
    }

    //stappen uitprinten
    public static void printStappenUit()
    {
        ovenOpwarmen();
        eiOpkloppen();
        mengenEnVerdelen();
        appelsSchillenEnVermengenMetSuikerEnKaneel();
        springVormVetten();
        deegGebruik();
        mengsuikerAppelsEnKaneel();
        deegOprollenTotDunneLap();
        strokenOpleggen();
        taartInDeOven();
    }


    //tagliatelle & tomaatjes
    // stap 1
    public static void hetMengeselToevoegen()
    {
        System.out.println("Verhit de olie in een hapjespan en pers de knoflook erboven. Fruit 1 min. en voeg dan de bevroren groenten en oregano toe. Roerbak 4 min. tot de groenten zijn ontdooid. Schenk de passata erbij en laat 5 min. zachtjes koken. Breng op smaak met peper en eventueel zout.");
    }

    public static void tagiatelleEnTotmaat()
    {
        System.out.println("Kook ondertussen de tagliatelle volgens de aanwijzingen op de verpakking. Halveer de snoeptomaten. Verdeel de pasta over 4 borden. Verdeel de saus, snoeptomaten en het basilicum erover.");
    }

    public static void displayTagiatelleMetTomaatjes()
    {
        hetMengeselToevoegen();
        tagiatelleEnTotmaat();
    }
}
