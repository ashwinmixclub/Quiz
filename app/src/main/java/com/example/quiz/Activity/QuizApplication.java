 
package com.example.quiz.Activity;

import com.example.quiz.TaskManager.QuizPlay;

import android.app.Application;

public class QuizApplication extends Application{
	private QuizPlay currentQuiz;

	public void setCurrentQuiz(QuizPlay currentQuiz) {
		this.currentQuiz = currentQuiz;
	}
	
	public QuizPlay getCurrentQuiz() {
		return currentQuiz;
	}
}
