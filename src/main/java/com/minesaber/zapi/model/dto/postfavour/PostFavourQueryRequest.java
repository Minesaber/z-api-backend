package com.minesaber.zapi.model.dto.postfavour;

import com.minesaber.zapi.common.PageRequest;
import com.minesaber.zapi.model.dto.post.PostQueryRequest;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/** 帖子收藏查询请求 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostFavourQueryRequest extends PageRequest implements Serializable {

  private static final long serialVersionUID = 1L;
  /** 帖子查询请求 */
  private PostQueryRequest postQueryRequest;
  /** 用户 id */
  private Long userId;
}
