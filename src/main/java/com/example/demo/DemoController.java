package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entitlement")
public class DemoController {
	
	@Autowired
	EntitlementRepositery entitlementRepositery;

	@GetMapping("/sample")
	String sample() {
        StringBuilder dietFoods = new StringBuilder();
        dietFoods.append("<html><head><style>");
        dietFoods.append("body { font-family: Arial, sans-serif; line-height: 1.6; padding: 20px; }");
        dietFoods.append("h1, h2, h3 { color: #333; }");
        dietFoods.append("p { margin-bottom: 10px; }");
        dietFoods.append("img { display: block; margin: 10px auto; }");
        dietFoods.append("</style></head><body>");
        dietFoods.append("<h1 style='text-align: center;'>Different Kinds of Diet Foods</h1>");

        dietFoods.append("<h2>1. Ketogenic Diet Foods</h2>");
        dietFoods.append("<p>Focuses on high-fat, moderate-protein, and low-carb foods.</p>");
        dietFoods.append("<img src='https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.britannica.com%2Ftopic%2Fketogenic-diet&psig=AOvVaw0_aVLPwvGD5nBWwg5w_Sc3&ust=1721137828034000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPiw7pmYqYcDFQAAAAAdAAAAABAE' width='400'/>");

        dietFoods.append("<h2>2. Mediterranean Diet Foods</h2>");
        dietFoods.append("<p>Emphasizes fruits, vegetables, whole grains, olive oil, fish, and nuts.</p>");
        dietFoods.append("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Mediterranean_food.jpg/800px-Mediterranean_food.jpg' alt='Mediterranean Diet' width='400'/>");

        dietFoods.append("<h2>3. Paleo Diet Foods</h2>");
        dietFoods.append("<p>Based on foods presumed to have been eaten by early humans, including lean meats, fish, fruits, and vegetables.</p>");
        dietFoods.append("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Paleo_meal.jpg/800px-Paleo_meal.jpg' alt='Paleo Diet' width='400'/>");

        dietFoods.append("<h2>4. Vegan Diet Foods</h2>");
        dietFoods.append("<p>Excludes all animal products, focusing on plant-based foods like fruits, vegetables, grains, and nuts.</p>");
        dietFoods.append("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Vegan_lunch_with_chickpea_patties.jpg/800px-Vegan_lunch_with_chickpea_patties.jpg' alt='Vegan Diet' width='400'/>");

        dietFoods.append("<h2>5. Gluten-Free Diet Foods</h2>");
        dietFoods.append("<p>Avoids foods containing gluten, found in wheat, barley, and rye; includes gluten-free grains, fruits, vegetables, and proteins.</p>");
        dietFoods.append("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Gluten-Free_Pancakes_with_Berries.jpg/800px-Gluten-Free_Pancakes_with_Berries.jpg' alt='Gluten-Free Diet' width='400'/>");

        dietFoods.append("</body></html>");
        return dietFoods.toString();
    }
	
	@PostMapping("/add")
	EntitlementEntity add(@RequestBody EntitlementEntity entitlementEntity ) {
		return entitlementRepositery.save(entitlementEntity);
	}
	@GetMapping("/getAll")
	List<EntitlementEntity> getAll() {
		return entitlementRepositery.findAll();
	}
}
