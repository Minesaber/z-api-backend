package com.minesaber.zapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.minesaber.zapi.model.entity.InterfaceInfo;

public interface InterfaceInfoService extends IService<InterfaceInfo> {
  void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
