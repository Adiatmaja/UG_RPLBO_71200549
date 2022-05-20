package com.ug11.channelsahamukdw;

public class EmailException extends Exception{
    public String getErrorMessage() {
        return ErrorMessage;
    }

    String ErrorMessage;
    Integer ErrorCode;

    public EmailException (Integer ErrorCode){
        super();
        this.ErrorCode = ErrorCode;

        if (ErrorCode == 1){
            this.ErrorMessage = "Login Gagal! Email Anda tidak terdaftar dalam UKDW";
        } else if (ErrorCode == 2){
            this.ErrorMessage = "Login Gagal! Email UKDW anda tidak valid";
        }
    }
}
