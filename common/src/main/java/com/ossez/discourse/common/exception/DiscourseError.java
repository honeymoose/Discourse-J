package com.ossez.discourse.common.exception;

import java.io.Serializable;
import java.util.List;

public class DiscourseError implements Serializable {
  private static final long serialVersionUID = -2696724276555657960L;

  private String  action;
  private List<String> errors;

  public DiscourseError(String action, List<String> errors) {
    this.action = action;
    this.errors = errors;
  }

  public DiscourseError() {

  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }
}
