public class NegativeRadius extends Exception{
    @Override
    public String toString(){
        return "Radius is negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}
