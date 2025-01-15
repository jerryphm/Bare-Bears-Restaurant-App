package com.example.bearbearsrestaurant.data

object DataSource {
    val mainDishes: List<Dish> = listOf(
        Dish("Grilled Chicken", "Smoky, juicy, and bursting with flavor—your taste buds will thank you!", 10.0),
        Dish("Spaghetti Bolognese", "A classic Italian dish with rich, meaty sauce and tender pasta.", 12.0),
        Dish("Beef Stew", "Slow-cooked beef in a savory broth with vegetables, perfect for a cozy meal.", 14.0),
        Dish("Vegetable Stir-Fry", "A mix of fresh vegetables sautéed in a flavorful sauce, light and healthy.", 9.0),
        Dish("Salmon Fillet", "Pan-seared salmon with a crispy skin, complemented by a tangy lemon sauce.", 16.0),
        Dish("Chicken Caesar Salad", "Crisp romaine lettuce, grilled chicken, parmesan, and a creamy Caesar dressing.", 11.0)
    )

    val sideDishes: List<Dish> = listOf(
        Dish("Garlic Bread", "Crispy, buttery bread topped with a garlic and herb spread.", 4.0),
        Dish("Mashed Potatoes", "Creamy mashed potatoes with butter and a touch of garlic.", 5.0),
        Dish("Coleslaw", "Fresh cabbage slaw with a tangy dressing, perfect for balancing rich dishes.", 3.5),
        Dish("Grilled Vegetables", "A mix of seasonal veggies grilled to perfection with olive oil and herbs.", 6.0)
    )

    val drinks: List<Drink> = listOf(
        Drink("Soda", 2.0),
        Drink("Iced Tea", 3.0),
        Drink("Lemonade", 2.5),
        Drink("Coffee", 2.8),
        Drink("Smoothie", 4.0),
        Drink("Water", 1.0)
    )
}