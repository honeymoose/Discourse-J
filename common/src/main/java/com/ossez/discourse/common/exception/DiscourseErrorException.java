package com.ossez.discourse.common.exception;

/**
 * @author Daniel Qian
 */
public class DiscourseErrorException extends Exception {
  private static final long serialVersionUID = -6357149550353160810L;

  private final DiscourseError error;

  private static final int DEFAULT_ERROR_CODE = -99;

//  public WxErrorException(String message) {
//    this(DiscourseError.builder().errorCode(DEFAULT_ERROR_CODE).errorMsg(message).build());
//  }

  public DiscourseErrorException(DiscourseError error) {
    super(error.toString());
    this.error = error;
  }

  public DiscourseErrorException(DiscourseError error, Throwable cause) {
    super(error.toString(), cause);
    this.error = error;
  }

  public DiscourseErrorException(Throwable cause, DiscourseError error) {
    super(cause.getMessage(), cause);
//    this.error = DiscourseError.builder().errorCode(DEFAULT_ERROR_CODE).errorMsg(cause.getMessage()).build();
    this.error = error;
  }

  public DiscourseError getError() {
    return this.error;
  }
}
