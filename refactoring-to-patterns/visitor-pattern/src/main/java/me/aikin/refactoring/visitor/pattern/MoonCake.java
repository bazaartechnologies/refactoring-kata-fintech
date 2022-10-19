package me.aikin.refactoring.visitor.pattern;

import java.util.List;
import java.util.stream.Collectors;

public class MoonCake implements MenuItem {
    private List<Ingredient> ingredients;

    public MoonCake(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public List<Integer> getHealthRating() {
        return ingredients.stream()
                .map(Ingredient::getHealthRating)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getProtein() {
        return ingredients.stream()
                .map(Ingredient::getProtein)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getCalory() {
        List<String> calories = ingredients.stream()
                .map(Ingredient::getCalory)
                .collect(Collectors.toList());
        calories.add("Cooking will double calories!!!");
        return calories;
    }


}
