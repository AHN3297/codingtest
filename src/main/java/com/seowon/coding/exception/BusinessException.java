package com.seowon.coding.exception;

import lombock.Getter;

@Getter
public class BusinessException extends RuntimeException {
    private final ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode) {
        supper(errorCode.getMessage());
        this.errorCode = errorCode;
    }

        public BusinessException(ErrorCode errorCode, String message) {
        supper(message);
        this.errorCode = errorCode;
    }
}