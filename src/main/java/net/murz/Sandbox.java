package net.murz;

import java.io.File;

import ncsa.hdf.hdf5lib.exceptions.HDF5Exception;
import ncsa.hdf.object.HObject;
import ncsa.hdf.object.Datatype;
import ncsa.hdf.object.Dataset;
import ncsa.hdf.object.h5.*;

class Sandbox {

  public static void main(String[] args) throws Exception {
      System.out.println("###########################");

      File folder = new File("data/MillionSongSubset/data/A/A/A");
      File[] files = folder.listFiles();
      for (File f : files) {
        H5File h5 = HDF5Util.hdf5_open_readonly(f.getPath());
        System.out.println("artist name: " + HDF5Util.get_artist_name(h5));
      }


      System.out.println("###########################");
  }

  Sandbox() {
  }
}
