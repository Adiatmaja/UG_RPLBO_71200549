package twitter.com;

public class BioException extends Exception{
    private int errCode;
    private String errMessage;

    public BioException (int errCode){
        super();
        this.errCode = errCode;

        if (errCode == 1){
            this.errMessage = "Bio tidak boleh kosong";
        } else if (errCode == 2){
            this.errMessage = "Bio minimal terdiri dari 5 karakter";
        } else if (errCode == 3){
            this.errMessage = "Bio tidak boleh mengandung karakter spesial selain titik, @ dan spasi";
        }
    }

    public int getErrCode(){
        return errCode;
    }

    public String getErrMessage(){
        return errMessage;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
