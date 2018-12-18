package com.citydata.exception;

import com.citydata.constant.ResponseCode;
import com.citydata.response.ReturnData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author: yjgithub
 * @create: 2018-05-29
 * @desc:   异常处理
 **/
@ControllerAdvice
@ResponseBody
public class ExceptionController {

    private String NullPointerExceptionStr="空指针异常";
    private String ArrayIndexOutOfBoundsStr="数组越界异常";
    private String ClassCastExceptionStr="类型转换异常";
    private int ERROR_CODE = 400;

    private static final String logExceptionFormat = "Capture Exception By GlobalExceptionHandler: Code: %s Detail: %s";

    //空指针异常
    @ExceptionHandler(NullPointerException.class)
    public ReturnData nullPointerExceptionHandler(NullPointerException ex) {
        System.out.println("空指针异常");
        return resultFormat(ERROR_CODE, new Exception(NullPointerExceptionStr));
    }

    //类型转换异常
    @ExceptionHandler(ClassCastException.class)
    public ReturnData classCastExceptionHandler(ClassCastException ex) {
        System.out.println("类型转换异常");
        return resultFormat(ERROR_CODE,  new Exception(ClassCastExceptionStr));
    }


    //数组越界异常
    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ReturnData ArrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException ex) {
        System.out.println("数组越界异常");
        return resultFormat(ERROR_CODE, new Exception(ArrayIndexOutOfBoundsStr));
    }

    //其他错误
    @ExceptionHandler({Exception.class})
    public ReturnData exception(Exception ex) {
        System.out.println("未知");
        return resultFormat(ERROR_CODE, new Exception(ResponseCode.SYSTEMBUSY.getMsg()));
    }

    private <T extends Throwable> ReturnData resultFormat(Integer code, T ex) {
        ex.printStackTrace();
        return ReturnData.build(code, ex.getMessage());
    }


}
