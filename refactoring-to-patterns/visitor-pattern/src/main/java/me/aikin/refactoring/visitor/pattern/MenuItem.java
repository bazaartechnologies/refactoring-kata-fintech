package me.aikin.refactoring.visitor.pattern;

import java.util.List;

public interface MenuItem {
    List<Integer> getHealthRating();
    List<String> getProtein();
    List<String> getCalory();
}
