package me.aikin.refactoring.visitor.pattern;

public class Flour implements Ingredient {
    private NutritionInfo Nutrition;

    public Flour(NutritionInfo nutrition) {
        Nutrition = nutrition;
    }

    public void smell() {
    }

    @Override
    public int getHealthRating() {
        smell();
        return Nutrition.getHealthRating();
    }

    @Override
    public String getProtein() {
        return Nutrition.getProtein() + " g";
    }

    @Override
    public String getCalory() {
        return Nutrition.getCalory() + " J";
    }
}
