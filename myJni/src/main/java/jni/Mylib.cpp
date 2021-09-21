#include <com_example_myjni_MyLib.h>
#include <string>

JNIEXPORT void JNICALL Java_com_example_myjni_MyLib_Setcallback
(JNIEnv *, jclass, jobject){

}

JNIEXPORT jstring JNICALL Java_com_example_myjni_MyLib_GetDemoString
(JNIEnv* env,jclass){
    return env->NewStringUTF("17:00");
}