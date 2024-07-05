public class AgeException extends Exception{
    @Override
    public String toString(){
        return "Invalid Age";
    }
 @Override
 public String getMessage(){
     return "Age should be between 0-120";
 }
}
