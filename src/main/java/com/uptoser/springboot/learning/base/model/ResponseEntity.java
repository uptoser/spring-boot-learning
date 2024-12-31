//package com.uptoser.springboot.learning.base.model;
//
//import io.swagger.annotations.ApiModelProperty;
//
//public class ResponseEntity<T> {
//    @ApiModelProperty(value = "状态码")
//    private int code;
//    @ApiModelProperty(value = "消息")
//    private String message;
//    @ApiModelProperty(value = "结果")
//    private T result;
//
//    public ResponseEntity(int code, String message, T result) {
//        this.code = code;
//        this.message = message;
//        this.result = result;
//    }
//
//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public T getResult() {
//        return result;
//    }
//
//    public void setResult(T result) {
//        this.result = result;
//    }
//
//    @Override
//    public String toString() {
//        return "ResponseEntity{" +
//                "code=" + code +
//                ", message='" + message + '\'' +
//                ", result=" + result +
//                '}';
//    }
//}
