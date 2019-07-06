package com.obor.aircp.exception;

public class ServiceException extends RuntimeException {
    private String errorMsg ;//异常信息

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ServiceException(String message) {
        super(message);
        this.errorMsg = message;
    }

    public ServiceException(Throwable cause) {
        super(cause);
        this.errorMsg = cause.getMessage();
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
        this.errorMsg = message;
    }

    public ServiceException() {
        super();
    }
}
