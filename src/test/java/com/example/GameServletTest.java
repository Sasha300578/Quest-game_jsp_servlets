package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GameServletTest {
    private GameServlet servlet;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;
    private RequestDispatcher dispatcher;

//    @Before
//    public void setUp() {
//        servlet = new GameServlet();
//        request = mock(HttpServletRequest.class);
//        response = mock(HttpServletResponse.class);
//        session = mock(HttpSession.class);
//        dispatcher = mock(RequestDispatcher.class);
//
//        when(request.getSession()).thenReturn(session);
//        when(request.getRequestDispatcher(anyString())).thenReturn(dispatcher);
//    }
//
//    @Test
//    public void testFirstStep() throws ServletException, IOException {
//        when(request.getParameter("playerName")).thenReturn("John");
//        when(session.getAttribute("step")).thenReturn(null);
//
//        servlet.doPost(request, response);
//
//        verify(session).setAttribute("step", 1);
//        verify(session).setAttribute("playerName", "John");
//        verify(request).getRequestDispatcher("game.jsp");
//        verify(dispatcher).forward(request, response);
//    }
//
//    @Test
//    public void testNextStep() throws ServletException, IOException {
//        when(session.getAttribute("step")).thenReturn(1);
//
//        servlet.doPost(request, response);
//
//        verify(session).setAttribute("step", 2);
//        verify(request).getRequestDispatcher("game.jsp");
//        verify(dispatcher).forward(request, response);
//    }
}
