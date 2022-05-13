package twitter.com;

public class UsernameException extends Exception{
    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private int errorCode;
    private String message;

    public UsernameException (int errorCode){
        super();
        this.errorCode = errorCode;
        if (errorCode == 1){
            this.message = "Username tidak boleh kosong!";
        } else if (errorCode == 2){
            this.message = "Username minimal harus terdiri dari 6 karakter!";
        } else if (errorCode == 3){
            this.message = "Username hanya boleh mengandung huruf, angka dan underscore";
        }
    }
    public UsernameException(String message){
        super();
    }
}
