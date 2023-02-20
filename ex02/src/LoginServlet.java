import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginUser loginUser = new LoginUser();
        loginUser.setUsername(req.getParameter("username"));
        loginUser.setPassword(req.getParameter("password"));

        String username = req.getParameter("username"); //  username에 일치하는 request parameter를 반환
        String password = req.getParameter("password"); //  password에 일치하는 request parameter를 반환
        PrintWriter out = resp.getWriter(); // 생성자 주입, 바이트스트림 받고 문자 출력함, flush, 예외처리
        resp.setContentType("application/json; application/json"); //
        Gson gson = new Gson();

        if(loginUser.getUsername().equals(req.getParameter("username")) && (loginUser.getPassword().equals(req.getParameter("password")))) {
            ResponseMsg responseMsg1 = new ResponseMsg(0,"로그인 성공");
            String json = gson.toJson(responseMsg1); // gson이용해서 json으로 변경
            System.out.println(json);
        } else {ResponseMsg responseMsg2 = new ResponseMsg(1,"로그인 실패");
            String json = gson.toJson(responseMsg2); // gson이용해서 json으로 변경
            System.out.println(json);
        }
    }
}
