# 号为注释
#定义必须以LOCAL_PATH为开始，my-dir 则由Build System提供，固定写法
LOCAL_PATH := $(call my-dir)
#CLEAR_VARS 变量由Build System提供。并指向一个指定的GNU Makefile，负责清理工作
include $(CLEAR_VARS)
#LOCAL_MODULE模块必须定义，以表示Android.mk中的每一个模块。名字必须唯一且不包含空格
LOCAL_MODULE := MyLib-jni
#LOCAL_SRC_FILES变量必须包含将要打包如模块的C/C++ 源码。
LOCAL_SRC_FILES := Mylib.cpp \
				LoginCtrl.cpp
$(warning $(LOCAL_SRC_FILES))
# 注明是动态编译，静态编译为BUILD_STATIC_LIBRARY
include $(BUILD_SHARED_LIBRARY)