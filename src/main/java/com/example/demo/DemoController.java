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
	 return """
                <html>
                <body>
                    <h1>Simple Java Quiz</h1>
                    <form id="quizForm">
                        <div>
                            <h3>1. What is the size of int in Java?</h3>
                            <input type="radio" name="q1" value="A"> 16 bits<br>
                            <input type="radio" name="q1" value="B"> 32 bits<br>
                            <input type="radio" name="q1" value="C"> 64 bits<br>
                            <input type="radio" name="q1" value="D"> Depends on the platform<br>
                        </div>

                        <div>
                            <h3>2. Which of the following is not a Java keyword?</h3>
                            <input type="radio" name="q2" value="A"> static<br>
                            <input type="radio" name="q2" value="B"> Boolean<br>
                            <input type="radio" name="q2" value="C"> void<br>
                            <input type="radio" name="q2" value="D"> private<br>
                        </div>

                        <div>
                            <h3>3. What is the default value of a boolean variable?</h3>
                            <input type="radio" name="q3" value="A"> true<br>
                            <input type="radio" name="q3" value="B"> false<br>
                            <input type="radio" name="q3" value="C"> null<br>
                            <input type="radio" name="q3" value="D"> undefined<br>
                        </div>

                        <div>
                            <h3>4. What does the expression float a = 35 / 0 return?</h3>
                            <input type="radio" name="q4" value="A"> 0<br>
                            <input type="radio" name="q4" value="B"> Infinity<br>
                            <input type="radio" name="q4" value="C"> NaN<br>
                            <input type="radio" name="q4" value="D"> throws an exception<br>
                        </div>

                        <div>
                            <h3>5. Which of the following is a marker interface?</h3>
                            <input type="radio" name="q5" value="A"> Runnable<br>
                            <input type="radio" name="q5" value="B"> Serializable<br>
                            <input type="radio" name="q5" value="C"> Comparable<br>
                            <input type="radio" name="q5" value="D"> Cloneable<br>
                        </div>

                        <div>
                            <h3>6. Which keyword is used to prevent inheritance in Java?</h3>
                            <input type="radio" name="q6" value="A"> super<br>
                            <input type="radio" name="q6" value="B"> static<br>
                            <input type="radio" name="q6" value="C"> final<br>
                            <input type="radio" name="q6" value="D"> this<br>
                        </div>

                        <div>
                            <h3>7. Which method must be implemented by all threads?</h3>
                            <input type="radio" name="q7" value="A"> start()<br>
                            <input type="radio" name="q7" value="B"> run()<br>
                            <input type="radio" name="q7" value="C"> stop()<br>
                            <input type="radio" name="q7" value="D"> main()<br>
                        </div>

                        <div>
                            <h3>8. What is the size of long variable?</h3>
                            <input type="radio" name="q8" value="A"> 8 bits<br>
                            <input type="radio" name="q8" value="B"> 16 bits<br>
                            <input type="radio" name="q8" value="C"> 32 bits<br>
                            <input type="radio" name="q8" value="D"> 64 bits<br>
                        </div>

                        <div>
                            <h3>9. Which of the following is a reserved keyword in Java?</h3>
                            <input type="radio" name="q9" value="A"> array<br>
                            <input type="radio" name="q9" value="B"> goto<br>
                            <input type="radio" name="q9" value="C"> null<br>
                            <input type="radio" name="q9" value="D"> boolean<br>
                        </div>

                        <div>
                            <h3>10. Which exception is thrown when a null object is accessed?</h3>
                            <input type="radio" name="q10" value="A"> NullPointerException<br>
                            <input type="radio" name="q10" value="B"> ArithmeticException<br>
                            <input type="radio" name="q10" value="C"> ArrayIndexOutOfBoundsException<br>
                            <input type="radio" name="q10" value="D"> ClassNotFoundException<br>
                        </div>

                        <button type="button" onclick="checkAnswers()">Submit</button>
                    </form>

                    <script>
                        function checkAnswers() {
                            var correctAnswers = ['B', 'B', 'B', 'B', 'B', 'C', 'B', 'D', 'B', 'A'];
                            var form = document.getElementById('quizForm');
                            var answers = form.elements;
                            var score = 0;

                            for (var i = 0; i < correctAnswers.length; i++) {
                                var questionName = 'q' + (i + 1);
                                var userAnswer = answers[questionName].value;

                                if (userAnswer === correctAnswers[i]) {
                                    score++;
                                }
                            }

                            alert('Your score is: ' + score + '/' + correctAnswers.length);
                        }
                    </script>
                </body>
                </html>
                """;
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
