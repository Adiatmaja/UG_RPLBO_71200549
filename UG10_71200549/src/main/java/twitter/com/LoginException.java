package twitter.com;

public class LoginException extends Exception{
    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    private int errCode;
    private String errMessage;

    public LoginException (int errCode){
        super();
        this.errCode = errCode;

        if (errCode == 1){
            this.errMessage = "Username tidak boleh kosong!";
        } else if (errCode == 2){
            this.errMessage = "Password tidak boleh kosong!";
        } else if (errCode == 3){
            this.errMessage = "Username atau Password salah!";
        } else if (errCode == 4){
            this.errMessage = "Username dan Password tidak boleh kosong!";
        }
    }
}
