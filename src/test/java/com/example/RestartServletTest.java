package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class RestartServletTest {
    private RestartServlet servlet;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;

//    @Before
//    public void setUp() {
//        servlet = new RestartServlet();
//        request = mock(HttpServletRequest.class);
//        response = mock(HttpServletResponse.class);
//        session = mock(HttpSession.class);
//
//        when(request.getSession()).thenReturn(session);
//    }
//
//    @Test
//    public void testRestartGame() throws ServletException, IOException {
//        servlet.doPost(request, response);
//
//        verify(session).invalidate();
//        verify(response).sendRedirect("index.jsp");
//    }
}
