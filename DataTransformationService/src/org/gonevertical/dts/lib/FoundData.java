package org.gonevertical.dts.lib;

import java.io.File;

public class FoundData {

  private File file;
  
  private String found;
  
  public FoundData(File file, String found) {
    this.file = file;
    this.found = found;
  }
  
  public File getFile() {
    return file;
  }

  public String getFound() {
    return found;
  }
  
}
