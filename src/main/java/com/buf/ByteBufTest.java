package com.buf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

public class ByteBufTest {
    public static void main(String args[]){
        // ���ڴ�������� ֱ���ڴ�
        ByteBuf directByteBuf = ByteBufAllocator.DEFAULT.directBuffer(1024);
        // ���ڴ�������� ���ڴ�
        ByteBuf heapByteBuf = ByteBufAllocator.DEFAULT.heapBuffer(1024);

    }
}
