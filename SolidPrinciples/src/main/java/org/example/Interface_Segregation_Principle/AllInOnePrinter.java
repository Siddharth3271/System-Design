package org.example.Interface_Segregation_Principle;

// Better approach following ISP
interface Printer {
  void print();
}

interface Scanner {
  void scan();
}

interface FaxMachine {
    void fax();
}

class BasicPrinter1 implements Printer {
  @Override
  public void print() {
    // Printing functionality
  }
}

public class AllInOnePrinter implements Printer, Scanner, FaxMachine {
  @Override
  public void print() {
    // Printing functionality
  }
  @Override
  public void scan() {
    // Scanning functionality
  }
  @Override
  public void fax() {
    // Fax functionality
  }
}
