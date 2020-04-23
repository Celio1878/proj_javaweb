import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
	@WebServlet("/hello")
	public class Hello extends HttpServlet {
		private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			out.println("Hello from Servlet");
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		}

	}
*/

/**
 * @author Celio-Vieira
*/

@WebServlet("/calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String _name = request.getParameter("name");
		String _cpf = request.getParameter("name");
		Integer _credit = request.getParameter("credit");
		String _product = request.getParameter("product");
		Integer _quantity = request.getParameter("quantity");
		Integer _date = request.getParameter("date");
		Integer _payment = request.getParameter("payment");

		Double total = 0.0;
		Double discount = 0.0;
		Double impost = 0.0;
		Double totalPayment = 0.0;

		Double hd = 200.00;
		Double memory = 300.00;
		Double mouse = 50.00;
		Double keyboard = 600.00;

		switch (_product) {
			case "hd":
				total = _quantity * hd;
				impost = total * 40/100;
				totalPayment = total - discount;

				if (_payment.equals("billet")) {
					discount = total * 10/100;
					request.setAttribute("Discount Amount", discount);
					request.setAttribute("Total of Payment", total);
					request.setAttribute("Impost", impost);

					if (totalPayment > _credit) {
						totalPayment = 0.0;
					}
					request.setAttribute("Total of Payment", totalPayment);
				} else {
					request.setAttribute("Purchase Price", total);
					request.setAttribute("Impost", impost);
					if (totalPayment > _credit) {
						totalPayment = 0.0;
					}
					request.setAttribute("Total of Payment", totalPayment);
				}
				break;

				case "memory":
					total = _quantity * memory;
					impost = total * 40/100;
					totalPayment = total - discount;

					if (_payment.equals("billet")) {
						discount = total * 10/100;
						request.setAttribute("Discount Amount", discount);
						request.setAttribute("Total of Payment", total);
						request.setAttribute("Impost", impost);

						if (totalPayment > _credit) {
							totalPayment = 0.0;
						}
						request.setAttribute("Total of Payment", totalPayment);
					} else {
						request.setAttribute("Purchase Price", total);
						request.setAttribute("Impost", impost);
						if (totalPayment > _credit) {
							totalPayment = 0.0;
						}
						request.setAttribute("Total of Payment", totalPayment);
					}
				break;

				case "keyboard":
					total = _quantity * keyboard;
					impost = total * 40/100;
					totalPayment = total - discount;

					if (_payment.equals("billet")) {
						discount = total * 10/100;
						request.setAttribute("Discount Amount", discount);
						request.setAttribute("Total of Payment", total);
						request.setAttribute("Impost", impost);

						if (totalPayment > _credit) {
							totalPayment = 0.0;
						}
						request.setAttribute("Total of Payment", totalPayment);
					} else {
						request.setAttribute("Purchase Price", total);
						request.setAttribute("Impost", impost);
						if (totalPayment > _credit) {
							totalPayment = 0.0;
						}
						request.setAttribute("Total of Payment", totalPayment);
					}
				break;

				case "mouse":
					total = _quantity * mouse;
					impost = total * 40/100;
					totalPayment = total - discount;

					if (_payment.equals("billet")) {
						discount = total * 10/100;
						request.setAttribute("Discount Amount", discount);
						request.setAttribute("Total of Payment", total);
						request.setAttribute("Impost", impost);

						if (totalPayment > _credit) {
							totalPayment = 0.0;
						}
						request.setAttribute("Total of Payment", totalPayment);
					} else {
						request.setAttribute("Purchase Price", total);
						request.setAttribute("Impost", impost);
						if (totalPayment > _credit) {
							totalPayment = 0.0;
						}
						request.setAttribute("Total of Payment", totalPayment);
					}
				break;

			default:
				break;
		}
		request.setAttribute("Name", _name);
		request.setAttribute("CPF", _cpf);
		request.setAttribute("Credit", _credit);
		request.setAttribute("Date", _date);
		request.setAttribute("Product", _product);

		request.getRequestDispatcher("resposta.jsp").forward(request, response);
	}
}
