package org.fasttrackit.web;

import org.fasttrackit.service.TopWinnerService;
import org.fasttrackit.transfer.TopWinnerListResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/top-winners")
public class TopWinnerServlet extends HttpServlet {

    private TopWinnerService topWinnerService = new TopWinnerService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            TopWinnerListResponse topWinners = topWinnerService.getTopWinners();


        } catch (Exception e) {
            resp.sendError(500, "There was an error processing your request. " +
                    e.getMessage());
        }
    }
}
