package com.magang.core.web.tag;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Created by magang on 2017/9/12.
 */
public class LazyEgg extends TagSupport {

    protected Logger logger = LoggerFactory.getLogger(LazyEgg.class);
    private String href;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out=pageContext.getOut();
        try{
            out.println(getOutput());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return super.doStartTag();
    }

    private String getOutput() throws Exception
    {
        HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();
        logger.info(request.getRequestURI());
        StringBuffer content = new StringBuffer("<link title=\"index\" name=\"styleTag\" rel=\"stylesheet\" type=\"text/css\" href=\"");
        content.append(request.getContextPath());
        content.append("/styles/");
        //String styleName=ContextUtil.getCurrentUserSkin(request);
        String styleName = "media";
        content.append(styleName+"/css");
        content.append("/");
        content.append(href);
        content.append("\"></link>");
        return content.toString();
    }
}
