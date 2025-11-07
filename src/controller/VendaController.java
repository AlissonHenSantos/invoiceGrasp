package controller;

import model.Venda;
import model.data.Mock;

public class VendaController {

	public Venda getVenda(int id) {
		return Mock.getVenda(id);
	}
}
