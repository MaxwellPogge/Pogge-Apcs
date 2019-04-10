package util;

public class StaticSentenceMaker{
    private String[] subjects = {"I ", "You ", "He ","They ","We " "The little boy "}; 
    private String[] verbs = {"killed ", "beat up ","took a picture of ","said hi to ","consoled ","shed a tear for",  }; 
    private String[] objects = {"Bob","the fish.", "the creature living in the trashcan outside.","the president.", "Dwayne Johnson.", "a really big bird."}; 

    public String getSentence();{

    }
    private String getRandomSubject();{
    (int)(Math.random() * subjects.length)
    return subjects
    }

    private String getRandomVerb();{
    (int)(Math.random() * verbs.length)
    return verbs
    }

    private String getRandomObject();{
    (int)(Math.random() * objects.length)
    return objects
    }
    
