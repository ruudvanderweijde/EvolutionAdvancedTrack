package android.opengl;
public class GLSurfaceView
  extends android.view.SurfaceView
  implements android.view.SurfaceHolder.Callback
{
public static interface GLWrapper
{
public abstract  javax.microedition.khronos.opengles.GL wrap(javax.microedition.khronos.opengles.GL gl);
}
public static interface Renderer
{
public abstract  void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl, javax.microedition.khronos.egl.EGLConfig config);
public abstract  void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl, int width, int height);
public abstract  void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl);
}
public static interface EGLContextFactory
{
public abstract  javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 egl, javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLConfig eglConfig);
public abstract  void destroyContext(javax.microedition.khronos.egl.EGL10 egl, javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLContext context);
}
public static interface EGLWindowSurfaceFactory
{
public abstract  javax.microedition.khronos.egl.EGLSurface createWindowSurface(javax.microedition.khronos.egl.EGL10 egl, javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLConfig config, java.lang.Object nativeWindow);
public abstract  void destroySurface(javax.microedition.khronos.egl.EGL10 egl, javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLSurface surface);
}
public static interface EGLConfigChooser
{
public abstract  javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 egl, javax.microedition.khronos.egl.EGLDisplay display);
}
public  GLSurfaceView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  GLSurfaceView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0); throw new RuntimeException("Stub!"); }
public  void setGLWrapper(android.opengl.GLSurfaceView.GLWrapper glWrapper) { throw new RuntimeException("Stub!"); }
public  void setDebugFlags(int debugFlags) { throw new RuntimeException("Stub!"); }
public  int getDebugFlags() { throw new RuntimeException("Stub!"); }
public  void setRenderer(android.opengl.GLSurfaceView.Renderer renderer) { throw new RuntimeException("Stub!"); }
public  void setEGLContextFactory(android.opengl.GLSurfaceView.EGLContextFactory factory) { throw new RuntimeException("Stub!"); }
public  void setEGLWindowSurfaceFactory(android.opengl.GLSurfaceView.EGLWindowSurfaceFactory factory) { throw new RuntimeException("Stub!"); }
public  void setEGLConfigChooser(android.opengl.GLSurfaceView.EGLConfigChooser configChooser) { throw new RuntimeException("Stub!"); }
public  void setEGLConfigChooser(boolean needDepth) { throw new RuntimeException("Stub!"); }
public  void setEGLConfigChooser(int redSize, int greenSize, int blueSize, int alphaSize, int depthSize, int stencilSize) { throw new RuntimeException("Stub!"); }
public  void setEGLContextClientVersion(int version) { throw new RuntimeException("Stub!"); }
public  void setRenderMode(int renderMode) { throw new RuntimeException("Stub!"); }
public  int getRenderMode() { throw new RuntimeException("Stub!"); }
public  void requestRender() { throw new RuntimeException("Stub!"); }
public  void surfaceCreated(android.view.SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
public  void surfaceDestroyed(android.view.SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
public  void surfaceChanged(android.view.SurfaceHolder holder, int format, int w, int h) { throw new RuntimeException("Stub!"); }
public  void onPause() { throw new RuntimeException("Stub!"); }
public  void onResume() { throw new RuntimeException("Stub!"); }
public  void queueEvent(java.lang.Runnable r) { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public static final int RENDERMODE_WHEN_DIRTY = 0;
public static final int RENDERMODE_CONTINUOUSLY = 1;
public static final int DEBUG_CHECK_GL_ERROR = 1;
public static final int DEBUG_LOG_GL_CALLS = 2;
}
