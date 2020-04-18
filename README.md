# SpinalTemplateMill
A simple SpinalHDL demo project based on the [Mill](https://www.lihaoyi.com/mill/) build tool.

## Setup

1. Ensure some reasonable version of Java is installed, e.g. OpenJDK. Works with 1.8.0, tested with 13.0.2.8 also.

1. Install the Mill helper script according to the [official documentation steps](https://www.lihaoyi.com/mill/#installation) somewhere into your path, typically ``/usr/bin/mill`` or ``/usr/local/bin/mill``.

1. Ensure a recent version of Verilator is installed if you want to run simulations. Also install gtkwave for inspecting simulation waveforms.

1. Clone the repository and change into the project top-level directory.
```sh
$ git clone https://github.com/typingArtist/SpinalTemplateMill.git
$ cd SpinalTemplateMill
```

1. Choose target to run or build:
  - With Verilator installed, run the simulation as the default target:
  ```sh
  $ mill mylib.run
  ```
  You can inspect the Verilog output afterwords in ``./simWorkspace/MyTopLevel/rtl/MyTopLevel.v``. Run ``gtkwave ./simWorkspace/test.vcd`` to inspect the waveforms.
  - Or just generate Verilog output:
  ```sh
  $ mill mylib.runMain mylib.MyTopLevelVerilog
  ```
  The generated Verilog output is written to ``./MyTopLevel.v``.
  - Or just generate VHDL output:
  ```sh
  $ mill mylib.runMain mylib.myTopLevelVhdl
  ```
  The generated VHDL output is written to ``./MyTopLevel.vhd``.
