

ContextBindRootScript {
	param RsScript sampler
	}

ContextBindProgramFragmentStore {
	param RsProgramFragmentStore pgm
	}

ContextBindProgramFragment {
	param RsProgramFragment pgm
	}

ContextBindProgramVertex {
	param RsProgramVertex pgm
	}

ContextBindProgramRaster {
	param RsProgramRaster pgm
	}

ContextSetDefineF {
    param const char* name
    param float value
    }

ContextSetDefineI32 {
    param const char* name
    param int32_t value
    }

ContextPause {
	}

ContextResume {
	}

AssignName {
	param void *obj
	param const char *name
	param size_t len
	}

ObjDestroy {
	param void *obj
	}

ElementBegin {
}

ElementAdd {
	param RsDataKind dataKind
	param RsDataType dataType
	param bool isNormalized
	param size_t bits
	param const char * name
	}

ElementCreate {
	ret RsElement
	}

TypeBegin {
	param RsElement type
	}

TypeAdd {
	param RsDimension dim
	param size_t value
	}

TypeCreate {
	ret RsType
	}

AllocationCreateTyped {
	param RsType type
	ret RsAllocation
	}

AllocationCreateSized {
	param RsElement e
	param size_t count
	ret RsAllocation
	}

AllocationCreateFromBitmap {
	param uint32_t width
	param uint32_t height
	param RsElement dstFmt
	param RsElement srcFmt
	param bool genMips
	param const void * data
	ret RsAllocation
	}

AllocationCreateFromBitmapBoxed {
	param uint32_t width
	param uint32_t height
	param RsElement dstFmt
	param RsElement srcFmt
	param bool genMips
	param const void * data
	ret RsAllocation
	}


AllocationUploadToTexture {
	param RsAllocation alloc
	param uint32_t baseMipLevel
	}

AllocationUploadToBufferObject {
	param RsAllocation alloc
	}


AllocationData {
	param RsAllocation va
	param const void * data
	param uint32_t bytes
	handcodeApi
	togglePlay
	}

Allocation1DSubData {
	param RsAllocation va
	param uint32_t xoff
	param uint32_t count
	param const void *data
	param uint32_t bytes
	handcodeApi
	togglePlay
	}

Allocation2DSubData {
	param RsAllocation va
	param uint32_t xoff
	param uint32_t yoff
	param uint32_t w
	param uint32_t h
	param const void *data
	param uint32_t bytes
	}

AllocationRead {
	param RsAllocation va
	param void * data
	}

Adapter1DCreate {
	ret RsAdapter1D
	}

Adapter1DBindAllocation {
	param RsAdapter1D adapt
	param RsAllocation alloc
	}

Adapter1DSetConstraint {
	param RsAdapter1D adapter
	param RsDimension dim
	param uint32_t value
	}

Adapter1DData {
	param RsAdapter1D adapter
	param const void * data
	}

Adapter1DSubData {
	param RsAdapter1D adapter
	param uint32_t xoff
	param uint32_t count
	param const void *data
	}

Adapter2DCreate {
	ret RsAdapter2D
	}

Adapter2DBindAllocation {
	param RsAdapter2D adapt
	param RsAllocation alloc
	}

Adapter2DSetConstraint {
	param RsAdapter2D adapter
	param RsDimension dim
	param uint32_t value
	}

Adapter2DData {
	param RsAdapter2D adapter
	param const void *data
	}

Adapter2DSubData {
	param RsAdapter2D adapter
	param uint32_t xoff
	param uint32_t yoff
	param uint32_t w
	param uint32_t h
	param const void *data
	}

SamplerBegin {
	}

SamplerSet {
	param RsSamplerParam p
	param RsSamplerValue value
	}

SamplerCreate {
	ret RsSampler
	}



ScriptBindAllocation {
	param RsScript vtm
	param RsAllocation va
	param uint32_t slot
	}


ScriptCBegin {
	}

ScriptSetClearColor {
	param RsScript s
	param float r
	param float g
	param float b
	param float a
	}

ScriptSetTimeZone {
	param RsScript s
	param const char * timeZone
	param uint32_t length
	}

ScriptSetClearDepth {
	param RsScript s
	param float depth
	}

ScriptSetClearStencil {
	param RsScript s
	param uint32_t stencil
	}

ScriptSetType {
	param RsType type
	param uint32_t slot
	param bool isWritable
	param const char * name
	}

ScriptSetInvoke {
	param const char * name
	param uint32_t slot
	}

ScriptInvoke {
	param RsScript s
	param uint32_t slot
	}

ScriptSetRoot {
	param bool isRoot
	}



ScriptCSetScript {
	param void * codePtr
	}

ScriptCSetText {
	param const char * text
	param uint32_t length
	}

ScriptCCreate {
	ret RsScript
	}

ScriptCSetDefineF {
    param const char* name
    param float value
    }

ScriptCSetDefineI32 {
    param const char* name
    param int32_t value
    }

ProgramFragmentStoreBegin {
	param RsElement in
	param RsElement out
	}

ProgramFragmentStoreColorMask {
	param bool r
	param bool g
	param bool b
	param bool a
	}

ProgramFragmentStoreBlendFunc {
	param RsBlendSrcFunc srcFunc
	param RsBlendDstFunc destFunc
	}

ProgramFragmentStoreDepthMask {
	param bool enable
}

ProgramFragmentStoreDither {
	param bool enable
}

ProgramFragmentStoreDepthFunc {
	param RsDepthFunc func
}

ProgramFragmentStoreCreate {
	ret RsProgramFragmentStore
	}

ProgramRasterCreate {
	param RsElement in
	param RsElement out
	param bool pointSmooth
	param bool lineSmooth
	param bool pointSprite
	ret RsProgramRaster
}

ProgramRasterSetLineWidth {
	param RsProgramRaster pr
	param float lw
}

ProgramRasterSetPointSize{
	param RsProgramRaster pr
	param float ps
}


ProgramFragmentBegin {
	param RsElement in
	param RsElement out
	param bool pointSpriteEnable
	}

ProgramFragmentBindTexture {
	param RsProgramFragment pf
	param uint32_t slot
	param RsAllocation a
	}

ProgramFragmentBindSampler {
	param RsProgramFragment pf
	param uint32_t slot
	param RsSampler s
	}

ProgramFragmentSetSlot {
	param uint32_t slot
	param bool enable
	param RsTexEnvMode env
	param RsType t
	}

ProgramFragmentCreate {
	ret RsProgramFragment
	}


ProgramVertexBegin {
	param RsElement in
	param RsElement out
	}

ProgramVertexCreate {
	ret RsProgramVertex
	}

ProgramVertexBindAllocation {
	param RsProgramVertex vpgm
	param RsAllocation constants
	}

ProgramVertexSetTextureMatrixEnable {
	param bool enable
	}

ProgramVertexAddLight {
	param RsLight light
	}

LightBegin {
	}

LightSetLocal {
	param bool isLocal
	}

LightSetMonochromatic {
	param bool isMono
	}

LightCreate {
	ret RsLight light
	}


LightSetPosition {
	param RsLight light
	param float x
	param float y
	param float z
	}

LightSetColor {
	param RsLight light
	param float r
	param float g
	param float b
	}

FileOpen {
	ret RsFile
	param const char *name
	param size_t len
	}


SimpleMeshCreate {
	ret RsSimpleMesh
	param RsAllocation prim
	param RsAllocation index
	param RsAllocation *vtx
	param uint32_t vtxCount
	param uint32_t primType
	}


SimpleMeshBindIndex {
	param RsSimpleMesh mesh
	param RsAllocation idx
	}

SimpleMeshBindPrimitive {
	param RsSimpleMesh mesh
	param RsAllocation prim
	}

SimpleMeshBindVertex {
	param RsSimpleMesh mesh
	param RsAllocation vtx
	param uint32_t slot
	}

