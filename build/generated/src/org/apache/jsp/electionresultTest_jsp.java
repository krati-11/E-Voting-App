package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.String;
import java.util.Map;
import java.util.Iterator;
import java.util.LinkedHashMap;
import evoting.dao.VoterDao;

public final class electionresultTest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Election Result</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.onload = function () {\n");
      out.write("\n");
      out.write("            var options = {\n");
      out.write("            title: {\n");
      out.write("            text: \"Voting Result by Evoting\"\n");
      out.write("            },\n");
      out.write("                    data: [{\n");
      out.write("                    type: \"pie\",\n");
      out.write("                            startAngle: 45,\n");
      out.write("                            showInLegend: \"true\",\n");
      out.write("                            legendText: \"{label}\",\n");
      out.write("                            indexLabel: \"{label} ({y})\",\n");
      out.write("                            yValueFormatString: \"#,##0.#\" % \"\",\n");
      out.write("                            dataPoints: [\n");
      out.write("            ");

                        LinkedHashMap<String, Integer> rs = VoterDao.getResult();
                        Iterator it = rs.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<String, Integer> en = (Map.Entry<String, Integer>) it.next();
                            if (it.hasNext() == false) {
            
      out.write("\n");
      out.write("                            {label: ");
      out.print( en.getKey());
      out.write(", y: ");
      out.print( en.getValue());
      out.write("}\n");
      out.write("            ");

                               } else {
            
      out.write("\n");
      out.write("                            {label: ");
      out.print( en.getKey());
      out.write(", y: ");
      out.print( en.getValue());
      out.write("},\n");
      out.write("            ");

                                       }

                                   }

//                                {label: "Organic", y: 36},
//                                {label: "Email Marketing", y: 31},
//                                {label: "Referrals", y: 7},
//                                {label: "Twitter", y: 7},
//                                {label: "Facebook", y: 6},
//                                {label: "Google", y: 10},
//                                {label: "Others", y: 3}

      out.write("\n");
      out.write("                            ]\n");
      out.write("                    }]\n");
      out.write("            };\n");
      out.write("                    $(\"#chartContainer\").CanvasJSChart(options);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"chartContainer\" style=\"height: 300px; width: 100%;\"></div>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://canvasjs.com/assets/script/jquery-1.11.1.min.js\"></script>  \n");
      out.write("        <script type=\"text/javascript\" src=\"https://canvasjs.com/assets/script/jquery.canvasjs.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
