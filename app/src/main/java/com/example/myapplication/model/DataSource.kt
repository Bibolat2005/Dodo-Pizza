package com.example.myapplication.model
import com.example.myapplication.R

object DataSource {
    val PizzaList = arrayListOf<Pizza>(
        Pizza(
          title = "Kebab",
          description = "Beef kebab, ranch sauce, cheddar cheese, sweet pepper, tomatoes, red onion, marinara sauce",
          image = R.drawable.img,
          price = 2900,
          check = false
        ),
        Pizza(
          title = "Pesto Pizza",
          description = "Chicken, pesto sauce, bryndza cheese, tomatoes, mozzarella cheese, Alfredo sauce",
          image = R.drawable.img_1,
          price = 2700,
            check = false
        ),
        Pizza(
            title = "Dodo",
            description = "Chicken ham, beef meatballs, chicken pepperoni, tomatoes, mushrooms, sweet pepper, red onion, mozzarella cheese, marinara sauce, garlic",
            image = R.drawable.img_2,
            price = 2900,
            check = false
        ),
        Pizza(
            title = "Diablo",
            description = "Beef meatballs, spicy chorizo, jalapenos, tomatoes, sweet pepper, red onion, mozzarella cheese, barbecue sauce, marinara sauce",
            image = R.drawable.img_3,
            price = 2900,
            check = false
        ),
        Combo(
            title = "combo for 3900",
            description = "Only one person. Small pizza, appetizer, drink and sauce. The price of the combo depends on the selected products and may be increased",
            image = R.drawable.img_10,
            price = 3900,
            check = true
        ),
        Pizza(
            title = "Pizza Halves",
            description = "Create your own 35cm pizza from two",
            image = R.drawable.img_4,
            price = 3600,
            check = false
        ),
        Pizza(
            title = "Ham & Mushroom",
            description = "Chicken ham, extra mozzarella cheese, mushrooms, marinara sauce",
            image = R.drawable.img_5,
            price = 2400,
            check = false
        ),

        Pizza(
            title = "Four seasons",
            description = "Extra mozzarella cheese, chicken ham, chicken pepperoni, bryndza cheese, tomatoes, mushrooms, marinara sauce, Italian seasoning",
            image = R.drawable.img_6,
            price = 2400,
            check = false
        ),
        Combo(
            title = "3 pizzas",
            description = "Three 30cm pizzas for every taste. Serves 5-10 people. Pizza selection is limited",
            image = R.drawable.img_11,
            price = 7300,
            check = true
        ),
        Pizza(
            title = "BBQ Chicken",
            description = "Chicken, chicken ham, barbecue sauce, red onion, mozzarella cheese, marinara sauce",
            image = R.drawable.img_7,
            price = 2700,
            check = false
        ),
        Pizza(
            title = "Vegetarian",
            description = "Mushrooms, bryndza cheese, tomatoes, sweet pepper, red onion, mozzarella cheese, marinara sauce, Italian seasoning",
            image = R.drawable.img_12,
            price = 2400,
            check = false
        )
    )
}