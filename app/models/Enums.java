package models;
///////////////////////////////////////////////////////////////////////////////
//
//Author: Jiri Fryc
//
//Licence: AGPL v3
//
//This file is part of template-api-rest-java-playframework, which is part of Prosecutor. 
///////////////////////////////////////////////////////////////////////////////


public class Enums {

    public enum TrialCategory
    {
        sourcecode,text;
    }
    public enum TrialName
    {
        Java(TrialCategory.sourcecode);
        public TrialCategory category;
        private TrialName(TrialCategory category)
        {
            this.category=category;
        }
    }
    public enum TrialMode
    {
        tokenCompare(TrialCategory.sourcecode),textCompare(TrialCategory.sourcecode);
        public TrialCategory category;
        private TrialMode(TrialCategory category)
        {
            this.category=category;
        }
    }
}
