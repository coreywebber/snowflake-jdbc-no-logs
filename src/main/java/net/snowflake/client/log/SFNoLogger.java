/*
 * Copyright (c) 2012-2019 Snowflake Computing Inc. All rights reserved.
 */
package net.snowflake.client.log;

import net.snowflake.client.util.SecretDetector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;
import org.slf4j.spi.LocationAwareLogger;

/** Created by hyu on 11/17/16. */
public class SFNoLogger implements SFLogger {
  
  private boolean isLocationAwareLogger = false;

  private static final String FQCN = SFNoLogger.class.getName();

  public SFNoLogger(Class<?> clazz) {
    /* Do Nothing*/
  }

  public SFNoLogger(String name) {
    /* Do Nothing*/
  }

  public boolean isDebugEnabled() {
    return false;
  }

  public boolean isErrorEnabled() {
    return false;
  }

  public boolean isInfoEnabled() {
    return false;
  }

  public boolean isTraceEnabled() {
    return false;
  }

  public boolean isWarnEnabled() {
    return false;
  }

  public void debug(String msg, boolean isMasked) {
	  /* Do Nothing*/
  }

  // This function is used to display unmasked, potentially sensitive log information for internal
  // regression testing purposes. Do not use otherwise
  public void debugNoMask(String msg) {
	  /* Do Nothing*/
  }

  public void debug(String msg, Object... arguments) {
	  /* Do Nothing*/
  }

  public void debug(String msg, Throwable t) {
	  /* Do Nothing*/
  }

  public void error(String msg, boolean isMasked) {
	  /* Do Nothing*/
  }

  public void error(String msg, Object... arguments) {
	  /* Do Nothing*/
  }

  public void error(String msg, Throwable t) {
	  /* Do Nothing*/
  }

  public void info(String msg, boolean isMasked) {
	  /* Do Nothing*/
  }

  public void info(String msg, Object... arguments) {
	  /* Do Nothing*/
  }

  public void info(String msg, Throwable t) {
	  /* Do Nothing*/
  }

  public void trace(String msg, boolean isMasked) {
	  /* Do Nothing*/
  }

  public void trace(String msg, Object... arguments) {
	  /* Do Nothing*/
  }

  public void trace(String msg, Throwable t) {
	  /* Do Nothing*/
  }

  public void warn(String msg, boolean isMasked) {
	  /* Do Nothing*/
  }

  public void warn(String msg, Object... arguments) {
	  /* Do Nothing*/
  }

  public void warn(String msg, Throwable t) {
	  /* Do Nothing*/
  }

  private static Object[] evaluateLambdaArgs(Object... args) {
    final Object[] result = new Object[args.length];

    for (int i = 0; i < args.length; i++) {
      result[i] = args[i] instanceof ArgSupplier ? ((ArgSupplier) args[i]).get() : args[i];
    }

    return result;
  }
}
