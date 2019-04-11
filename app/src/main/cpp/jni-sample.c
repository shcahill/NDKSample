#include <string.h>
#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_shcahill_ndksample_MainActivity_stringFromJNI(JNIEnv *env, jobject thiz) {
    return (*env)->NewStringUTF(env,
                                "string from JNI!");
}
