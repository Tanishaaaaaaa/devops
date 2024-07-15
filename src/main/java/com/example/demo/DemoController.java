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
        StringBuilder shortStories = new StringBuilder();
        shortStories.append("<html><head><style>");
        shortStories.append("body { font-family: Arial, sans-serif; line-height: 1.6; padding: 20px; }");
        shortStories.append("h1, h2, h3 { color: #333; }");
        shortStories.append("p { margin-bottom: 10px; }");
        shortStories.append("</style></head><body>");
        shortStories.append("<h1 style='text-align: center;'>Short Stories for Kids</h1>");

        shortStories.append("<h2>The Tortoise and the Hare</h2>");
        shortStories.append("<p>Once upon a time, there was a speedy hare who bragged about how fast he could run. Tired of hearing him boast, a tortoise challenged him to a race. The hare laughed at such a slow creature competing against him, but he accepted the challenge.</p>");
        shortStories.append("<p>The race began, and the hare, confident in his speed, took a nap halfway through. Meanwhile, the tortoise kept plodding along, slow and steady. To the hare's surprise, when he woke up and dashed to the finish line, he found the tortoise already there, patiently waiting for him.</p>");

        shortStories.append("<h2>The Lion and the Mouse</h2>");
        shortStories.append("<p>One day, a lion was sleeping peacefully when a little mouse accidentally woke him up. Furious, the lion caught the mouse and was about to eat him when the mouse begged for mercy, promising to help the lion one day in return.</p>");
        shortStories.append("<p>The lion laughed at such a small creature offering help, but he let the mouse go. Some time later, the lion found himself trapped in a hunter's net. Unable to free himself, he roared for help. Hearing the lion's roar, the mouse recognized his chance to repay the lion's kindness. With his sharp teeth, he gnawed through the net, setting the lion free.</p>");

        shortStories.append("<h2>The Boy Who Cried Wolf</h2>");
        shortStories.append("<p>In a village, a mischievous boy was assigned to watch over the sheep. Bored and seeking attention, he thought it would be amusing to cry out, 'Wolf! Wolf!' The villagers rushed to his aid, only to find him laughing at their gullibility.</p>");
        shortStories.append("<p>Some time later, a real wolf approached the flock. The boy cried out for help, but this time, no one believed him. The wolf attacked the sheep, and the boy learned a hard lesson about honesty and the consequences of lying.</p>");

        shortStories.append("<h2>The Gingerbread Man</h2>");
        shortStories.append("<p>Once, a kind old woman baked a gingerbread man cookie. As soon as she opened the oven door, the gingerbread man jumped out and ran away. The old woman and her husband chased him, but the gingerbread man taunted them, saying, 'Run, run, as fast as you can! You can't catch me, I'm the gingerbread man!'</p>");
        shortStories.append("<p>Along the way, he met various animals who wanted to eat him, but he outran them all. Finally, he met a cunning fox who offered to help him cross a river. The gingerbread man trusted the fox, but as they reached the middle of the river, the fox snapped and ate him in one gulp.</p>");

        shortStories.append("<h2>The Ugly Duckling</h2>");
        shortStories.append("<p>In a barnyard, a mother duck sat on her eggs, waiting for them to hatch. When they did, she was surprised to see an ugly duckling among the fluffy ducklings. The other animals teased him for his appearance, and he felt sad and lonely.</p>");
        shortStories.append("<p>As he grew older, the ugly duckling realized he was not a duck at all but a beautiful swan. He joined a flock of swans and discovered his true identity, realizing that he was always meant to be graceful and elegant.</p>");

        shortStories.append("</body></html>");
        return shortStories.toString();
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
