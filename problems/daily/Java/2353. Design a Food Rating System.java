class FoodRatings {
    private Map<String, Pair<String,Integer>> foodMap = new HashMap<>();
    private Map<String, SortedSet<Pair<Integer,String>>> cuisineMap = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i = 0; i<foods.length; i++){
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];
            foodMap.put(food, new Pair<>(cuisine, rating));
            cuisineMap.computeIfAbsent(cuisine, k -> new TreeSet<>(Comparator
            .<Pair<Integer,String>,Integer>comparing(Pair::getKey)
            .reversed()
            .thenComparing(Pair::getValue)))
            .add(new Pair<>(rating, food));
        }
    }
    
    public void changeRating(String food, int newRating) {
        Pair<String,Integer> foodPair = foodMap.get(food);
        String cuisine = foodPair.getKey();
        int oldRating = foodPair.getValue();
        SortedSet<Pair<Integer,String>> cuisineSet = cuisineMap.get(cuisine);
        cuisineMap.get(cuisine).remove(new Pair<>(oldRating, food));
        cuisineMap.get(cuisine).add(new Pair<>(newRating, food));
        foodMap.put(food, new Pair<>(cuisine, newRating));
    }
    
    public String highestRated(String cuisine) {
        SortedSet<Pair<Integer,String>> cuisineSet = cuisineMap.get(cuisine);
        return cuisineSet.isEmpty() ? "" : cuisineSet.first().getValue();
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */