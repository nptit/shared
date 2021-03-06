package com.tinacg;

import static com.tinacg.util.Shortcuts.print;

import java.io.*;
import java.util.*;

public class MyMainMan {
    // in directory c:\Users\Heitor\Desktop\emacs-24.3\bin\shared\java\cookbook
    // > gradle build
    
    // If jar is activated in build.gradle
    // > java -ea -jar build/libs/cookbook-0.1.jar

    // otherwise
    // run.bat
    
    // shorter:
    // compile.bat then run.bat
    
    // p.36 1.12 Buggy
    /*
    static String name;
    */
    
    public static void main(String[] args) {
        // PROGRESS: p. 114

        String s = "The rain in Spain is mainly in the plain";

        StringTokenizer st = new StringTokenizer(s);
        String token;
        while ((token = st.nextToken()) != null) {
            print(token);
        }

        /* p. 82
        try {
            print(System.getProperty("user.dir"));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("cookbookunicode.html"), "UTF-8"));
            pw.write("<html><head><meta charset=\"utf-8\"></head><body>");
            pw.write("\u00a5\u01fc\u0391\u03a9");
            pw.close();
        }
        catch (Exception e) { }
        */
        
        /* p. 56
        System.out.println(System.getProperty("java.specification.version"));
        print(File.separator);
        print(File.pathSeparatorChar);
        */
        
        // p. 35 1.11 AssertDemo
        /*
        int i = 4;
        if (args.length == 1) {
            i = Integer.parseInt(args[0]);
        }
        assert i > 0 : "i is non-positive";
        print("Hello after assertion");
        */

        // p. 36 1.12 Buggy
        /* // use jdb
        int n = name.length();
        print(n);

        name += "; the end.";
        print(name);
        */
    }
}
