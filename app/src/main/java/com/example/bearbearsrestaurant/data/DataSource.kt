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

    val drinks: List<Dish> = listOf(
        Dish("Coca-Cola", "Classic refreshing soda to complement your meal.", 2.5),
        Dish("Iced Tea", "Chilled tea with a hint of lemon, served over ice.", 3.0),
        Dish("Lemonade", "Freshly squeezed lemons with a touch of sweetness, served cold.", 3.5),
        Dish("Espresso", "Rich and bold shot of coffee for a quick pick-me-up.", 2.8),
        Dish("Milkshake", "Thick and creamy shake in chocolate, vanilla, or strawberry flavor.", 4.5),
        Dish("Mineral Water", "Pure, refreshing, and hydrating bottled water.", 1.5)
    )
}