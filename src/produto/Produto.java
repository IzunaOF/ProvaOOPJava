package produto;

import javax.swing.JOptionPane;

public class Produto {

    private String name;
    private Double value;
    private Integer qtd;
    private Integer reserved;

    public Produto(String name, Double value, Integer qtd) {
        this.name = name;
        this.value = value;
        this.qtd = qtd;
        this.reserved = 0;
    }

    public String showProductListParams() {
        String params = "";
        if (qtd <= 0) {
            params.concat("Produto Fora de Estoque");
        }
        return params += "Product Name: " + this.name + " -- Product Value: " + this.value + " -- Stock: " + this.qtd + " unt" + " -- Reserved Quantity: " + this.reserved + "\n";
    }

    public Boolean BUY(Integer many) {
        if ((qtd - many) < 0) {
            return false;
        }
        this.qtd -= many;

        return true;
    }

    public void reserve(Integer many) {
        if ((qtd - many) <= 0) {
            JOptionPane.showMessageDialog(null, "Produo fora de Estoque");
            return;
        }
        this.reserved += many;
        this.qtd -= many;
    }

    public void unReserve(Integer many) {
        if ((reserved - many) < 0) {
            JOptionPane.showMessageDialog(null, "Este Porduto não possui reservas");
            return;
        }
        this.reserved -= many;
        this.qtd += many;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void updateQtd(Integer value) {
        this.qtd = value;
    }

    public void updateValue(Double value) {
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public Double getValue() {
        return this.value;
    }

    public Integer getQtd() {
        return this.qtd;
    }

    public Boolean isAvailable() {
        return qtd > 0 ? true : false;
    }
}
