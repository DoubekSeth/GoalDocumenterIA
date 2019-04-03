/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.util.HashMap;
import java.util.HashSet;
import java.lang.Float;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author 9518588
 */
public class Goal implements GoalComparable{
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    HashSet<String> learningOutcomes = new HashSet<String>();//Check
    HashMap<String, Float> hoursCAS = new HashMap<>();//Check
    String title;//Check
    String reflection;//Check
    String steps;//Check
    Date goalStart;//Check
    Date goalEnd;
    boolean project;
    boolean autoDoc;
    
    public String getTitle(){
        return title;
    }
    
    public Date getStartDate(){
        return goalStart;
    }
    public Date getEndDate(){
        return goalEnd;
    }
    HashSet<String> getLearningOutcomes(){
        return learningOutcomes;
    }
    HashMap<String, Float> getHoursCAS() {
        return hoursCAS;
    }
    String getSteps(){
        return steps;
    }
    String getReflection(){
        return reflection;
    }
    boolean getProject(){
        return project;
    }
    
    boolean getAutoDoc(){
        return autoDoc;
    }
    
    void documentGoal(String reflection, String steps, String[] learningOutcomes, float creativeHours, float activeHours, float serviceHours){
        this.reflection = reflection;
        this.steps = steps;
        for(String outcome : learningOutcomes){
            this.learningOutcomes.add(outcome);
        }
        hoursCAS.put("Creative Hours", creativeHours);
        hoursCAS.put("Active Hours", activeHours);
        hoursCAS.put("Service Hours", serviceHours);
        goalEnd = new Date();
    }
    
}
