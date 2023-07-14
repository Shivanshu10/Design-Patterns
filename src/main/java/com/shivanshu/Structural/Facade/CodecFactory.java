package com.shivanshu.Structural.Facade;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        System.out.println("CodecFactory: extracting ogg audio...");
        return new OggCompressionCodec();
    }
}
