LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES:= \
	Camera.cpp \
	CameraParameters.cpp \
	EGLUtils.cpp \
	EventHub.cpp \
	EventRecurrence.cpp \
	FramebufferNativeWindow.cpp \
	GraphicBuffer.cpp \
	GraphicBufferAllocator.cpp \
	GraphicBufferMapper.cpp \
	KeyLayoutMap.cpp \
	KeyCharacterMap.cpp \
	ICamera.cpp \
	ICameraClient.cpp \
	ICameraService.cpp \
	IOverlay.cpp \
	ISurfaceComposer.cpp \
	ISurface.cpp \
	ISurfaceFlingerClient.cpp \
	LayerState.cpp \
	Overlay.cpp \
	PixelFormat.cpp \
	Rect.cpp \
	Region.cpp \
	SharedBufferStack.cpp \
	Surface.cpp \
	SurfaceComposerClient.cpp

LOCAL_SHARED_LIBRARIES := \
	libcutils \
	libutils \
	libEGL \
	libbinder \
	libpixelflinger \
	libhardware \
	libhardware_legacy

LOCAL_MODULE:= libui

ifeq ($(TARGET_SIMULATOR),true)
    LOCAL_LDLIBS += -lpthread
endif

include $(BUILD_SHARED_LIBRARY)
