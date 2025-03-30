package com.minesaber.zapi.model.dto.interfaceinfo;

import java.io.Serializable;
import lombok.Data;

/** 接口调用请求 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {

  /** 主键 */
  private Long id;

  /** 用户请求参数 */
  private String userRequestParams;
}
