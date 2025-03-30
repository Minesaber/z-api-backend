package com.minesaber.zapi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.minesaber.zapi.common.ErrorCode;
import com.minesaber.zapi.exception.BusinessException;
import com.minesaber.zapi.mapper.InterfaceInfoMapper;
import com.minesaber.zapi.model.entity.InterfaceInfo;
import com.minesaber.zapi.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {
  @Override
  public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
    if (interfaceInfo == null) {
      throw new BusinessException(ErrorCode.PARAMS_ERROR);
    }
    String name = interfaceInfo.getName();
    // 创建时，所有参数必须非空
    if (add) {
      if (StringUtils.isAnyBlank(name)) {
        throw new BusinessException(ErrorCode.PARAMS_ERROR);
      }
    }
    if (StringUtils.isNotBlank(name) && name.length() > 50) {
      throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
    }
  }
}
