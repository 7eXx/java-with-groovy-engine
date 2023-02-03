package org.test.with.groovy;

public class PmClient {

  public Object getVarialeValue(final int plcAddress, final int tableIndex, final int variableIndex) {
    return plcAddress + tableIndex * variableIndex;
  }
}
