/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author 9518588
 */
public class RepeatedGoal extends Goal{
    String step;
    
    RepeatedGoal(String title, Date goalStart, Date goalEnd){
        this.title = title;
        this.goalStart = goalStart;
        this.goalEnd = goalEnd;
    }
    
    RepeatedGoal(String title, Date goalStart, Date goalEnd, boolean autoDoc){
        this.title = title;
        this.goalStart = goalStart;
        this.goalEnd = goalEnd;
        this.autoDoc = autoDoc;
    }
    
    @Override
    String getSteps(){
        return step;
    }
    
    @Override
    void documentGoal(String reflection, String steps, String[] learningOutcomes, float creativeHours, float activeHours, float serviceHours){
        this.reflection = reflection;
        this.steps = steps;
        for(String outcome : learningOutcomes){
            this.learningOutcomes.add(outcome);
        }
        hoursCAS.put("Creative Hours", creativeHours);
        hoursCAS.put("Active Hours", activeHours);
        hoursCAS.put("Service Hours", serviceHours);
    }
}
