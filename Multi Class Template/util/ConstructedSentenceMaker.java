package util;

public class ConstructedSentenceMaker{
    private String message;
    public ConstructedSentenceMaker(){
        message = "Default Message";
    }
}
public ConstructedSentenceMaker(String _message){
        message = _message;

    }
    
    public String getMessage(){
        return "Beans that are cool.";
    }