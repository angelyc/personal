package com.mario.designPatterns.simplify.facade;

import java.io.IOException;
import java.io.Writer;

class HtmlWriter {
    private Writer writer;
    HtmlWriter(Writer writer){
        this.writer = writer;
    }
    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }
    void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>");
    }
    void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }
    void mailto(String mailaddr, String username) throws IOException {
        link("mailto:" + mailaddr, username);
    }
    void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
