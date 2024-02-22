public class CustomException extends Exception{

    private
    String message;

    CustomException(String mes)
    {
        message=mes;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
