package com.ossez.discourse.common.exception;

/**
 * @author Daniel Qian
 */
public class DataStructureException extends WxErrorException {
  private static final long serialVersionUID = -6357149550353160810L;

  private final DiscourseError error;

  private static final int DEFAULT_ERROR_CODE = -99;

  public DataStructureException(String message) {
    this(DiscourseError.builder().errorCode(DEFAULT_ERROR_CODE).errorMsg(message).build());
  }

  public DataStructureException(DiscourseError error) {
    super(error.toString());
    this.error = error;
  }


  public DiscourseError getError() {
    return this.error;
  }
}
