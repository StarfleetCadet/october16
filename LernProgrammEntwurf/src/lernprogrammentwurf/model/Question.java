/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lernprogrammentwurf.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author aviva
 */
public class Question implements IDBModel
{
    
    private int id;
    private String category = "";
    private String question ="";
    private String correctAnswer = "";
    private int level;
    public static String[] categories = {"Sozialkunde", "Java", "AWL", "LAN", 
                                        "PC-Grundlagen", "SWL", "KLR", "Datenbanken",
                                        "SQL", "E-Tech", "Linux", "HTML/CSS", "HAPCS"};
  
    
    
    
    public void add() 
    {
        DBConnectionBuilder myBuilder = new DBConnectionBuilder();        
        Connection conn = myBuilder.getConnection();
        
        if(conn != null)
        {
            try 
            {
          
            String sql = "INSERT INTO questions(category, question, correct_answer, level) " +
                         "VALUES(?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
          
            preparedStatement.setString(1, category);
            
            preparedStatement.setString(2, question);
            
            preparedStatement.setString(3, correctAnswer);
             
            preparedStatement.setInt(4, level);
          
            preparedStatement.executeUpdate();

           
          } 
            catch (SQLException e)
          {
            e.printStackTrace();
          }
        }
        
        myBuilder.close();
        
    }

    @Override
    public void delete() 
    {
       
    }

    @Override
    public void update() 
    {
        
    }

    @Override
    public void find() 
    {
        
    }

    /**
     * @return the id
     */
    public int getId() 
    {
        return id;
    }

    /**
     * @return the category
     */
    public String getCategory() 
    {
        return category;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    /**
     * @return the question
     */
    public String getQuestion() 
    {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) 
    {
        this.question = question;
    }

    /**
     * @return the correctAnswer
     */
    public String getCorrectAnswer() 
    {
        return correctAnswer;
    }

    /**
     * @param correctAnswer the correctAnswer to set
     */
    public void setCorrectAnswer(String correctAnswer) 
    {
        this.correctAnswer = correctAnswer;
    }

    /**
     * @return the level
     */
    public int getLevel() 
    {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) 
    {
        this.level = level;
    }

}
