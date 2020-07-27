package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/que")
public class QuestionControlller 
{
	
	@Autowired
	private QueRepository repo;
	
	@Autowired
	private AddRepository repo1;
	
	@RequestMapping("/")
	public String check()
	{
		return "Welcome To Application";
	}
	
	@GetMapping("/save")
	public String save()
	{
		//Step 1
//		Answer answer=new Answer();
//	    answer.setAnswer("hii");
//		repo1.save(answer);
//		System.out.println((repo1.save(answer)).toString());
//		Question question=new Question();
//		question.setQuestion("what?");
//		question.setAddress(answer);
//		repo.save(question);
//		String message="Record Save Successfully"+question.getQuestionId();
//		return message;
		
		//Sterp 2
		
		Question question=new Question();
		question.setQuestion("when?");
		repo.save(question);
		Answer answer=new Answer();
	    answer.setAnswer("hellow");
	    answer.setQuestion(question);
		repo1.save(answer);
		
		String message="Record Save Successfully"+answer.getAnswerId();
		return message;
		
	}

}
