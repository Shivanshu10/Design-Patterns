package com.shivanshu.Structural.Facade;

public class VideoConversionFacade {
    public VideoFile convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitRateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitRateReader.convert(buffer, destinationCodec);
        System.out.println("VideoConversionFacade: conversion completed.");
        return intermediateResult;
    }

}
