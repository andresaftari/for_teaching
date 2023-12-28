cmake_minimum_required(VERSION 3.6)
project(for_teaching)

# added -fopenmp
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11 -fopenmp")

set(SOURCE_FILES paralel_omp.c)
add_executable(for_teaching ${SOURCE_FILES})