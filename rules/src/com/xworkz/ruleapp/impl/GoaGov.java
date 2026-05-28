package com.xworkz.ruleapp.impl;

import com.xworkz.ruleapp.CentralGovRules;

public class GoaGov implements CentralGovRules {
    @Override
    public boolean banAlcohol() {
        System.out.println("Simply Impossible");
        return false;
    }

    @Override
    public void makeRoads() {
        System.out.println("We have best Roads");

    }
}
