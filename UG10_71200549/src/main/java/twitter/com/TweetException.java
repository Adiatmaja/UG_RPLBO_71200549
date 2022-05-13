package twitter.com;

public class TweetException extends Exception{
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

    public TweetException (int errCode){
        super();
        this.errCode = errCode;

        if (errCode == 1){
            this.errMessage = "Tweet tidak boleh kosong!";
        } else if (errCode == 2){
            this.errMessage = "Tweet minimal 8 karakter dan maksimal 140 karakter!";
        }
    }
}
