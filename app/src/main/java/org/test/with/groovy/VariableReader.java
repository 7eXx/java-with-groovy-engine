package org.test.with.groovy;

public class VariableReader {

  private final PmClient pmClient;
  private final int plcAddress;

  public VariableReader(PmClient pmClient, int plcAddress) {
    this.pmClient = pmClient;
    this.plcAddress = plcAddress;
  }

  public Object r(final int tableIndex, final int variableIndex) {
    // simulate a read variable contex
    return pmClient.getVarialeValue(plcAddress, tableIndex, variableIndex);
  }
}
