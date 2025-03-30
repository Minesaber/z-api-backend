package com.minesaber.zapi.model.vo;

import com.minesaber.zapi.model.entity.InterfaceInfo;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/** 接口信息封装视图 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo implements Serializable {
  /** 调用次数 */
  private Integer totalNum;
}
