package com.xworkz.ruleapp.impl;

import com.xworkz.ruleapp.CentralGovRules;

public class KarnatakaGov implements CentralGovRules {

    @Override
    public boolean banAlcohol(){
        System.out.println("Thats the main income for us");
        return true;
    }
    public void makeRoads(){
        System.out.println("there is no budget for it");
    }

}
