/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lernprogrammentwurf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import lernprogrammentwurf.model.Question;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import lernprogrammentwurf.util.QuestionHelper;

/**
 *
 * @author aviva
 */
public class FXMLDocumentController implements Initializable
{

    @FXML
    private Label label;

    @FXML
    private ComboBox<String> categoriesComboBox;
    
    @FXML
    private ComboBox<String> chooseCategoryComboBox;
    
    @FXML
    private ComboBox<Integer> chooseLevelComboBox;

    @FXML
    private TextArea questionField;

    @FXML
    private TextArea answerField;
    
    @FXML
    private TextArea questionLearnField;
        
    @FXML
    private TextArea answerLearnField;
    
    @FXML
    private TextArea notesField;

    @FXML
    private Slider levelSlider;
    
    private Question newQuestion = null;

    @FXML
    private void handleBtnAddQuestionAction(ActionEvent event)
    {
        Question toAdd = new Question();

        toAdd.setCategory(categoriesComboBox.getValue());
        toAdd.setCorrectAnswer(answerField.getText());

        toAdd.setLevel((int) (Math.round(levelSlider.getValue())));
        toAdd.setQuestion(questionField.getText());

        toAdd.addNewQuestion();

        questionField.clear();
        answerField.clear();
    }
    
    @FXML
    private void handleBtnNewQuestionAction(ActionEvent event)
    {
        newQuestion = QuestionHelper.getRandomQuestion(chooseCategoryComboBox.getValue(), chooseLevelComboBox.getValue());
        questionLearnField.setText(newQuestion.getQuestion());
        
        answerLearnField.clear();
        notesField.clear();
    }
    
    @FXML
    private void handleBtnDiscoverAnswerAction(ActionEvent event)
    {
        
        if (newQuestion != null)
        {
            answerLearnField.setText(newQuestion.getCorrectAnswer());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        Arrays.sort(Question.categories);
        categoriesComboBox.getItems().addAll(Question.categories);
        chooseCategoryComboBox.getItems().addAll(Question.categories);
        chooseLevelComboBox.getItems().addAll(1, 2, 3, 4, 5);

    }


}
