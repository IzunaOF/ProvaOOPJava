package CRUD;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import produto.Produto;

public class SystemCRUD {

    ArrayList<Produto> products = new ArrayList<>();

    public SystemCRUD() {
        addProductsTest();

        mainMenu();
    }

    public void addProduct() {
        String name = JOptionPane.showInputDialog("Nome do Produto: ");
        Double value = Double.parseDouble(JOptionPane.showInputDialog("Valor do Produto: "));
        Integer qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do Produto para Estoque: "));
        products.add(new Produto(name, value, qtd));
    }

    public void removeProduct(String src) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(src)) {
                products.remove(i);
                JOptionPane.showMessageDialog(null, "Produto Removido");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Não Foi Possível remover este Produto");
    }

    public void searchProduct(String src) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(src)) {
                JOptionPane.showMessageDialog(null, "Pesquisa realizada com sucesso: \n" + products.get(i).showProductListParams());
            }
        }
    }

    public void updateProduct(String msg) {
        Integer prod = Integer.parseInt(JOptionPane.showInputDialog("Digite o Indice do Produto \n" + msg)) - 1;
        String name = JOptionPane.showInputDialog("Novo Nome do Produto: ");
        Double value = Double.parseDouble(JOptionPane.showInputDialog("Novo Valor do Produto: "));
        Integer qtd = Integer.parseInt(JOptionPane.showInputDialog("Nova Quantidade do Produto para Estoque: "));
        products.get(prod).updateName(name);
        products.get(prod).updateQtd(qtd);
        products.get(prod).updateValue(value);
    }

    public void addProductsTest() {
        String[] names = {"Brinco", "Anel", "Colar", "Bracelete", "Priercing"};
        Double[] values = {45.99, 12.99, 89.99, 50.00, 19.90};
        for (int i = 0; i < names.length; i++) {
            products.add(new Produto(names[i], values[i], i * 5));
        }
    }

    private void mainMenu() {
        JOptionPane.showMessageDialog(null, "Bem Vindos a Loja JôJoias" + " \n Escolha uma das opções");

        String allProducts = "";
        String minimenu = "";
        Integer prod = 0;

        Integer resp = 0;

        while (resp != 9) {

            minimenu += "1 - Comprar \n"
                    + "2 - Reservar \n"
                    + "3 - Cancelar Reserva  \n"
                    + "4 - Novo Produto  \n"
                    + "5 - Ver Produtos \n"
                    + "6 - Atualizar Produto \n"
                    + "7 - Consultar Produto \n"
                    + "8 - Remover Produto \n"
                    + "9 - Encerrar Compras  \n";

            resp = Integer.parseInt(JOptionPane.showInputDialog(minimenu));

            allProducts = "";
            minimenu = "";

            for (int i = 0; i < this.products.size(); i++) {
                allProducts += i + 1 + "º - " + this.products.get(i).getName()
                        + " valor: " + this.products.get(i).getValue()
                        + " QTD: " + this.products.get(i).getQtd() + " und(s) \n";
            }
            if (resp == 9) {
                JOptionPane.showMessageDialog(null, "A Loja Fechou, Volte Sempre.");

            } else {
                switch (resp) {
                    case 1:
                        prod = Integer.parseInt(JOptionPane.showInputDialog("Digite o Indice do Produto \n" + allProducts)) - 1;
                        products.get(prod).BUY(Integer.parseInt(JOptionPane.showInputDialog("Quantidade: ")));
                        JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
                        break;
                    case 2:
                        prod = Integer.parseInt(JOptionPane.showInputDialog("Digite o Indice do Produto \n" + allProducts)) - 1;
                        products.get(prod).reserve(Integer.parseInt(JOptionPane.showInputDialog("Quantidade: ")));
                        break;
                    case 3:
                        prod = Integer.parseInt(JOptionPane.showInputDialog("Digite o Indice do Produto \n" + allProducts)) - 1;
                        Integer prodQtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
                        products.get(prod).unReserve(prodQtd);
                        break;
                    case 4:
                        this.addProduct();
                        break;
                    case 5:
                        String msg = "";
                        for (int i = 0; i < products.size(); i++) {
                            msg += products.get(i).showProductListParams();
                        }
                        JOptionPane.showMessageDialog(null, msg);
                        break;
                    case 6:
                        this.updateProduct(allProducts);
                        break;
                    case 7:
                        String src = JOptionPane.showInputDialog("Pesquise por nome: ");
                        this.searchProduct(src);
                        break;
                    case 8:
                        String remove = JOptionPane.showInputDialog("Remover por nome: ");
                        this.removeProduct(remove);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                        break;

                }
            }
        }
    }
}
