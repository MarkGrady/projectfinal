package com.qf.projectfinal.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MsgResult {
    private Integer  statusCode;
    private String msg;
    private Object data;
}
