package me.aikin.refactoring.visitor.pattern;

public class Yolk implements Ingredient {
    private NutritionInfo Nutrition;

    public Yolk(NutritionInfo nutrition) {
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
