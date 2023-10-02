package com.ossez.discourse.common.exception;

import com.ossez.discourse.common.enums.WeChatErrorCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.ossez.discourse.common.enums.WxType;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * 微信错误码.
 * 请阅读：
 * 公众平台：<a href="https://developers.weixin.qq.com/doc/offiaccount/Getting_Started/Global_Return_Code.html">全局返回码说明</a>
 * 企业微信：<a href="https://work.weixin.qq.com/api/doc#10649">全局错误码</a>
 *
 * @author Daniel Qian & Binary Wang
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiscourseError implements Serializable {
  private static final long serialVersionUID = -2696724276555657960L;

  /**
   * 微信错误代码.
   */
  private int errorCode;

  /**
   * 微信错误信息.
   * （如果可以翻译为中文，就为中文）
   */
  private String errorMsg;

  /**
   * 微信接口返回的错误原始信息（英文）.
   */
  private String errorMsgEn;

  private String json;

  public DiscourseError(int errorCode, String errorMsg) {
    this.errorCode = errorCode;
    this.errorMsg = errorMsg;
  }



  @Override
  public String toString() {
    if (this.json == null) {
      return "错误代码：" + this.errorCode + ", 错误信息：" + this.errorMsg;
    }

    return "错误代码：" + this.errorCode + ", 错误信息：" + this.errorMsg + "，微信原始报文：" + this.json;
  }

}
