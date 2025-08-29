package org.example.Interface_Segregation_Principle;

// Problematic approach that violates ISP
//(fat interface)
interface Machine {
  void print();
  void scan();
  void fax();
}

class AllInOnePrinter implements Machine {
  @Override public void print() {
    // Printing functionality
  }
  @Override public void scan() {
    // Scanning functionality
  }
  @Override public void fax() {
    // Fax functionality
  }
}

class BasicPrinter implements Machine {
  @Override public void print() {
    // Printing functionality
  }
  @Override public void scan() {
    // Problem: Basic printer can't scan!
    throw new UnsupportedOperationException("Cannot scan");
  }
  @Override public void fax() {
    // Problem: Basic printer can't fax!
    throw new UnsupportedOperationException("Cannot fax");
  }
}