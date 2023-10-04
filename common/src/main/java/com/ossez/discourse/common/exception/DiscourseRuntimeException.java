package com.ossez.discourse.common.exception;

/**
 * WxJava专用的runtime exception.
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 * created on  2020-09-26
 */
public class DiscourseRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 4881698471192264412L;

    public DiscourseRuntimeException(Throwable e) {
        super(e);
    }

  public DiscourseRuntimeException(String msg) {
    super(msg);
  }
    public DiscourseRuntimeException(DiscourseError discourseError) {
        super(discourseError.getErrors().get(0));
    }



    public DiscourseRuntimeException(String msg, Throwable e) {
        super(msg, e);
    }
}
