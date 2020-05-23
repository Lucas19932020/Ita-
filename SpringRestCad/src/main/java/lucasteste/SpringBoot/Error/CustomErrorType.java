package lucasteste.SpringBoot.Error;

public class CustomErrorType {
    private String errorMessage;

    public CustomErrorType(String errorMessage){
        this.errorMessage = errorMessage;
    }
    // Crie apenas o método Get
    public String getErrorMessage() {
        return errorMessage;
    }
}
