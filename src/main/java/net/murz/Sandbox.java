package net.murz;

import java.io.File;

import ncsa.hdf.hdf5lib.exceptions.HDF5Exception;
import ncsa.hdf.object.HObject;
import ncsa.hdf.object.Datatype;
import ncsa.hdf.object.Dataset;
import ncsa.hdf.object.h5.*;

class Sandbox {

  public static void main(String[] args) {
      System.out.println("###########################");

      File folder = new File("data/MillionSongSubset/data/A/A/A");
      File[] files = folder.listFiles();
      for (File f : files) {
        H5File h5File = new H5File(f.getName());
      }


      System.out.println("###########################");
  }

  Sandbox() {
  }
}
