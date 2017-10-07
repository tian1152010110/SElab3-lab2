package DBJavaBean;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class encodingfilter implements Filter {

 private FilterConfig config;
 private String encoding="gb2312";
 
 public void destroy() {
  config=null;

 }

 public void doFilter(ServletRequest request, ServletResponse response,
   FilterChain chain) throws IOException, ServletException {
  request.setCharacterEncoding(encoding);
  chain.doFilter(request, response);
 }

 public void init(FilterConfig config) throws ServletException {
  this.config=config;
  String s =config.getInitParameter("encoding");
  if(s!=null){
   this.encoding=s;
  }
 }

}
