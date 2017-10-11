package com.company.file.iii;

import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) {
        PrintStream ps=new PrintStream(System.out);
        ps.println("你好啊 最近怎么样");
        ps.println(new PrintStreamTest());
        ps.close();

    }
}
