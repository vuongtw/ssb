package io.github.vuongtw.ssb;

public class ContentOnlyMessage {
    private final String content;

    public ContentOnlyMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
