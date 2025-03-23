public class Ingredient
{
    private int amount ;
    private int unit;
    private String name;

    //constructor zonder variabelen
    public Ingredient()
    {

    }

    //constructor met variabelen
    public Ingredient(int amount, int unit, String name)
    {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }
    // getters en setter
    public int getAmount()
    {
        return amount;
    }

    public int getUnit()
    {
        return unit;
    }

    public String getName()
    {
        return name;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public void setUnit(int unit)
    {
        this.unit = unit;
    }

    public void setName(String name)
    {
        this.name = name;
    }


}
