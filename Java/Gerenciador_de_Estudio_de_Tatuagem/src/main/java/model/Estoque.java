/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Thiago
 */
public class Estoque {
    private int codProduto;
    private String nomeItem;
    private int quantidadeItem;
    private String categoriaItem;
    
    public Estoque(int codProduto, String nomeItem, int quantidadeItem, String categoriaItem) {
        this.codProduto = codProduto;
        this.nomeItem = nomeItem;
        this.quantidadeItem = quantidadeItem;
        this.categoriaItem = categoriaItem;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public String getCategoriaItem() {
        return categoriaItem;
    }

    public void setCategoriaItem(String categoriaItem) {
        this.categoriaItem = categoriaItem;
    }

    
    
}
