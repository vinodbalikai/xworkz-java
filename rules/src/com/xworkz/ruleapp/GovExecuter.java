package com.xworkz.ruleapp;

import com.xworkz.ruleapp.impl.GoaGov;
import com.xworkz.ruleapp.impl.KarnatakaGov;

public class GovExecuter {
    public static void main(String[] args) {

        CentralGovRules centralGovRules=new KarnatakaGov();

        centralGovRules.banAlcohol();
        centralGovRules.makeRoads();

        CentralGovRules centralGovRules1=new GoaGov();

        centralGovRules1.banAlcohol();
        centralGovRules1.makeRoads();
        }
}
