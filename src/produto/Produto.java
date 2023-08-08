package produto;

import javax.swing.JOptionPane;

public class Produto {

    private String name;
    private Double value;
    private Integer qtd;
    private Integer reserved;
    private Integer comprados;

    public Produto(String name, Double value, Integer qtd) {
        this.name = name;
        this.value = value;
        this.qtd = qtd;
        this.reserved = 0;
        this.comprados = 0;
    }

    public String showProductListParams() {
        String params = "";
        if (qtd <= 0) {
            params.concat("Produto Fora de Estoque");
        }
        return params += "Product Name: " + this.name + " -- Product Value: " + this.value + " -- Stock: " + this.qtd + " unt" + " -- Reserved Quantity: " + this.reserved + "\n";
    }

    public void BUY(Integer value) {
        if ((qtd - value) < 0) {
            JOptionPane.showMessageDialog(null, "Produo fora de Estoque");
            return;
        }
        comprados += value;
        this.qtd -= value;

        return;
    }

    public void reserve(Integer value) {
        if ((qtd - value) < 0) {
            JOptionPane.showMessageDialog(null, "Produo fora de Estoque");
            return;
        }
        this.reserved += value;
        this.qtd -= value;
    }

    public void unReserve(Integer value) {
        if ((reserved - value) < 0) {
            JOptionPane.showMessageDialog(null, "Este Porduto não possui reservas");
            return;
        }
        this.reserved -= value;
        this.qtd += value;
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

    public int getComprados(){
        return this.comprados;
    }
    public int getReservados() {
        return this.reserved;
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
