package javacore.filter;



import java.io.IOException;



/**
 * 登录验证的过滤器
 */
/*@WebFilter("/*")//除了登录相关资源外（如login.jsp)
public class FilterTest4 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //1.强转
        HttpServletRequest request = (HttpServletRequest)req;
        //2.获取资源请求路径
        String uri = request.getRequestURI();
        //排除登录相关资源，css/js/fonts等
        if(uri.contains("/login.jsp")||uri.contains("/loginServlet")||uri.contains("/css/")||uri.contains("/js/")){
            //用户就是像登录，放行
            chain.doFilter(req, resp);
        }else{
            //不包含，需要验证用户是否登录
            //3.从获取session中获取user
            Object user = request.getSession().getAttribute("user");
            if(user!=null){
                //登录了，放行
                chain.doFilter(req, resp);
            }else{
                //没有登录，跳转到登录页面
                request.setAttribute("login_msg","你为登录，请先登录！");
                request.getRequestDispatcher("/login.jsp");
            }
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}*/


