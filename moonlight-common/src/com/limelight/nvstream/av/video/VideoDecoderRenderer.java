package com.limelight.nvstream.av.video;

import com.limelight.nvstream.av.DecodeUnit;

public interface VideoDecoderRenderer {
	public static final int FLAG_PREFER_QUALITY = 0x1;
	public static final int FLAG_FORCE_HARDWARE_DECODING = 0x2;
	public static final int FLAG_FORCE_SOFTWARE_DECODING = 0x4;

	public void setup(int width, int height, int redrawRate, Object renderTarget, int drFlags);
	
	public void start();
	
	public void stop();
	
	public void release();
	
	public boolean submitDecodeUnit(DecodeUnit decodeUnit);
}
