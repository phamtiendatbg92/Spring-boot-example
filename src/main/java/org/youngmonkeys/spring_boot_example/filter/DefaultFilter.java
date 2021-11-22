package org.youngmonkeys.spring_boot_example.filter;

import javax.servlet.*;
import java.io.IOException;

public class DefaultFilter implements Filter {
    @Override
    public void doFilter(
        ServletRequest servletRequest,
        ServletResponse servletResponse,
        FilterChain filterChain
    ) throws IOException, ServletException {

    }
}
