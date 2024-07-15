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
		StringBuilder landmarks = new StringBuilder();
        landmarks.append("<html><body>");
        landmarks.append("<h1>Famous Landmarks of India</h1>");
        landmarks.append("<h2>1. Taj Mahal, Agra</h2>");
        landmarks.append("<p>A symbol of love and one of the Seven Wonders of the World.</p>");
        landmarks.append("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/Taj_Mahal%2C_Agra%2C_India_edit3.jpg/640px-Taj_Mahal%2C_Agra%2C_India_edit3.jpg' alt='Taj Mahal' width='300'/><br><br>");

        landmarks.append("<h2>2. Qutub Minar, Delhi</h2>");
        landmarks.append("<p>A UNESCO World Heritage Site and the tallest brick minaret in the world.</p>");
        landmarks.append("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Qutb_Minar%2C_Delhi%2C_India.jpg/640px-Qutb_Minar%2C_Delhi%2C_India.jpg' alt='Qutub Minar' width='300'/><br><br>");

        landmarks.append("<h2>3. Gateway of India, Mumbai</h2>");
        landmarks.append("<p>A grand arch overlooking the Arabian Sea.</p>");
        landmarks.append("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Gateway_of_India%2C_Mumbai.jpg/640px-Gateway_of_India%2C_Mumbai.jpg' alt='Gateway of India' width='300'/><br><br>");

        landmarks.append("<h2>4. Red Fort, Delhi</h2>");
        landmarks.append("<p>A historic fort and a symbol of India's rich past.</p>");
        landmarks.append("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Red_Fort_in_Delhi_03-2016_img3.jpg/640px-Red_Fort_in_Delhi_03-2016_img3.jpg' alt='Red Fort' width='300'/><br><br>");

        landmarks.append("<h2>5. Hawa Mahal, Jaipur</h2>");
        landmarks.append("<p>Also known as the Palace of Winds, with its unique five-storey exterior.</p>");
        landmarks.append("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Hawa_Mahal_2011.jpg/640px-Hawa_Mahal_2011.jpg' alt='Hawa Mahal' width='300'/><br><br>");

        landmarks.append("</body></html>");
        return landmarks.toString();
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
