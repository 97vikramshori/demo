package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question 
{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int questionId;
   
   private String question;
   
   @OneToOne
   @JoinColumn(name="address_id")
   private Answer answers;
   
   public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public Answer getAnswers() {
	return answers;
}
public void setAnswers(Answer answers) {
	this.answers = answers;
}
public Question(int questionId, String question, Answer answers) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answers = answers;
}
public Question() {
	super();
	// TODO Auto-generated constructor stub
}
   
   
}
