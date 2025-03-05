package com.bridgelabz.generics.levelone;

import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    void mealDetails();
}

class VegetarianMeal implements MealPlan {
    public void mealDetails() {
        System.out.println("Vegetarian Meal: Salad, Paneer, Lentils");
    }
}

class VeganMeal implements MealPlan {
    public void mealDetails() {
        System.out.println("Vegan Meal: Tofu, Quinoa, Vegetables");
    }
}

class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    void addMeal(T meal) {
        meals.add(meal);
    }

    void showMeals() {
        for (T meal : meals) {
            meal.mealDetails();
        }
    }

    static <T extends MealPlan> void generateMealPlan(List<T> mealList) {
        for (T meal : mealList) {
            meal.mealDetails();
        }
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianPlan = new Meal<>();
        Meal<VeganMeal> veganPlan = new Meal<>();

        VegetarianMeal vegMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();

        vegetarianPlan.addMeal(vegMeal);
        veganPlan.addMeal(veganMeal);

        System.out.println("\n--- Individual Meal Plans ---");
        vegetarianPlan.showMeals();
        veganPlan.showMeals();

        List<MealPlan> allMeals = new ArrayList<>();
        allMeals.add(vegMeal);
        allMeals.add(veganMeal);

        System.out.println("\n--- Generated Personalized Meal Plan ---");
        Meal.generateMealPlan(allMeals);
    }
}
