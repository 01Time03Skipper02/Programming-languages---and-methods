# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.20

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "C:\Program Files\JetBrains\CLion 2021.2.2\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "C:\Program Files\JetBrains\CLion 2021.2.2\bin\cmake\win\bin\cmake.exe" -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = C:\Users\1\Desktop\GitHub\Programming-languages---and-methods\C++\labs\9labCircBuf

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = C:\Users\1\Desktop\GitHub\Programming-languages---and-methods\C++\labs\9labCircBuf\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/9labCircBuf.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/9labCircBuf.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/9labCircBuf.dir/flags.make

CMakeFiles/9labCircBuf.dir/main.cpp.obj: CMakeFiles/9labCircBuf.dir/flags.make
CMakeFiles/9labCircBuf.dir/main.cpp.obj: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=C:\Users\1\Desktop\GitHub\Programming-languages---and-methods\C++\labs\9labCircBuf\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/9labCircBuf.dir/main.cpp.obj"
	C:\PROGRA~2\MINGW-~1\I686-8~1.0-P\mingw32\bin\G__~1.EXE $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\9labCircBuf.dir\main.cpp.obj -c C:\Users\1\Desktop\GitHub\Programming-languages---and-methods\C++\labs\9labCircBuf\main.cpp

CMakeFiles/9labCircBuf.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/9labCircBuf.dir/main.cpp.i"
	C:\PROGRA~2\MINGW-~1\I686-8~1.0-P\mingw32\bin\G__~1.EXE $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\Users\1\Desktop\GitHub\Programming-languages---and-methods\C++\labs\9labCircBuf\main.cpp > CMakeFiles\9labCircBuf.dir\main.cpp.i

CMakeFiles/9labCircBuf.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/9labCircBuf.dir/main.cpp.s"
	C:\PROGRA~2\MINGW-~1\I686-8~1.0-P\mingw32\bin\G__~1.EXE $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\Users\1\Desktop\GitHub\Programming-languages---and-methods\C++\labs\9labCircBuf\main.cpp -o CMakeFiles\9labCircBuf.dir\main.cpp.s

# Object files for target 9labCircBuf
9labCircBuf_OBJECTS = \
"CMakeFiles/9labCircBuf.dir/main.cpp.obj"

# External object files for target 9labCircBuf
9labCircBuf_EXTERNAL_OBJECTS =

9labCircBuf.exe: CMakeFiles/9labCircBuf.dir/main.cpp.obj
9labCircBuf.exe: CMakeFiles/9labCircBuf.dir/build.make
9labCircBuf.exe: CMakeFiles/9labCircBuf.dir/linklibs.rsp
9labCircBuf.exe: CMakeFiles/9labCircBuf.dir/objects1.rsp
9labCircBuf.exe: CMakeFiles/9labCircBuf.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=C:\Users\1\Desktop\GitHub\Programming-languages---and-methods\C++\labs\9labCircBuf\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable 9labCircBuf.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\9labCircBuf.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/9labCircBuf.dir/build: 9labCircBuf.exe
.PHONY : CMakeFiles/9labCircBuf.dir/build

CMakeFiles/9labCircBuf.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\9labCircBuf.dir\cmake_clean.cmake
.PHONY : CMakeFiles/9labCircBuf.dir/clean

CMakeFiles/9labCircBuf.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" C:\Users\1\Desktop\GitHub\Programming-languages---and-methods\C++\labs\9labCircBuf C:\Users\1\Desktop\GitHub\Programming-languages---and-methods\C++\labs\9labCircBuf C:\Users\1\Desktop\GitHub\Programming-languages---and-methods\C++\labs\9labCircBuf\cmake-build-debug C:\Users\1\Desktop\GitHub\Programming-languages---and-methods\C++\labs\9labCircBuf\cmake-build-debug C:\Users\1\Desktop\GitHub\Programming-languages---and-methods\C++\labs\9labCircBuf\cmake-build-debug\CMakeFiles\9labCircBuf.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/9labCircBuf.dir/depend

