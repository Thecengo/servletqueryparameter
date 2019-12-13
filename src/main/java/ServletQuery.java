import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServletQuery implements Servlet {

   List<Person> personList = new ArrayList<>();
   Person person;

    @Override

    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println(servletConfig.getServletName() + " init oldu...");
        person = new Person();

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String kaydet = servletRequest.getParameter("tip");

        String listele = servletRequest.getParameter("tip");

        String ad = servletRequest.getParameter("ad");

        String soyad = servletRequest.getParameter("soyad");

        Person person = new Person(ad, soyad);

        PrintWriter pw = servletResponse.getWriter();
        String htmlString;

        if (kaydet.equals("kaydet")) {
           personList.add(person);
        }
        else if(listele.equals("listele")){
            for(Person person1 : personList){
                System.out.printf(" %s %s ",person1.getAd(), person1.getSoyad());
                htmlString = "<html>" +
                        "  <head></head>" +
                        "<body>" +
                        "    <table>\n" +
                        "      <tr>\n" +
                        "        <td>ad</td>\n" +
                        "        <td>soyad</td>\n" +
                        "      </tr>\n" +
                        "      <tr>\n" +
                        "        <td>"+person1.getAd()+"</td>\n" +
                        "        <td>"+person1.getSoyad()+"</td>\n" +
                        "      </tr>\n" +
                        "    </table>" +
                        " </body>" +
                        "  </html>";

                pw.write(htmlString);
            }
        }

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
