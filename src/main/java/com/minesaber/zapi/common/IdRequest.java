package com.minesaber.zapi.common;

import java.io.Serializable;
import lombok.Data;

@Data
public class IdRequest implements Serializable {
  /** id */
  private Long id;
}
