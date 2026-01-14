package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/PasswordChangeServlet")
public class PasswordChangeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        String currentPassword = request.getParameter("current-password");
        String newPassword = request.getParameter("new-password");
        String confirmPassword = request.getParameter("confirm-password");

        boolean hasError = false;

        // 8文字以上
        if (newPassword == null || newPassword.length() < 8) {
        	hasError = true;
        }

        // 英字・数字・記号を含むか
        if (!newPassword.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).+$")) {
        	hasError = true;
        }

        if (hasError) {
        	request.setAttribute("showPasswordError", true);
        	request.getRequestDispatcher("passwordChange.jsp")
                	.forward(request, response);
        	return;
        }


        // TODO: 現在のパスワード確認とデータベース更新
        // 例: if(UserDao.checkPassword(userId, currentPassword)){
        //         UserDao.updatePassword(userId, newPassword);
        //      } else {
        //         request.setAttribute("error", "現在のパスワードが間違っています。");
        //         request.getRequestDispatcher("passwordChange.jsp").forward(request, response);
        //         return;
        //      }

        response.sendRedirect("profile.jsp");
    }
}
