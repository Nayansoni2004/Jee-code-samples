package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class TagHandler extends SimpleTagSupport {
    public void doTag() throws IOException, JspException {
        System.out.println("Hello Tag Handler Walon !!! " + this);
    }
}