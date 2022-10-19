package me.aikin.refactoring.visitor.pattern;

import java.util.List;
import java.util.stream.Collectors;

public class MenuItemClass {
    private List<IngredientClass> ingredientClasses;

    public MenuItemClass(List<IngredientClass> ingredientClasses) {
        this.ingredientClasses = ingredientClasses;
    }

    public void AddToPot() {
    }

    public void AddWater() {
    }

    public void AddOil() {
    }

    public void Smell() {
    }

    public void Taste() {
    }

    public void Cook() {
    }

    public List<Integer> getHealthRating() {
        return ingredientClasses.stream()
                .map(IngredientClass::getHealthRating)
                .collect(Collectors.toList());
    }

    public List<String> getProtein() {
        return ingredientClasses.stream()
                .map(IngredientClass::getProtein)
                .collect(Collectors.toList());
    }

    public List<String> getCalory() {
        List<String> calories = ingredientClasses.stream()
                .map(IngredientClass::getCalory)
                .collect(Collectors.toList());
        calories.add("Cooking will double calories!!!");
        return calories;
    }
}
