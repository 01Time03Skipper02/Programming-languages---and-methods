cmake_minimum_required(VERSION 3.20)
project(8lab_patternClass)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(8lab_patternClass
        decloration.h
        implemention.cpp
        main.cpp)
