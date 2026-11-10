package datastructure;

import model.Product;

public class InventoryNode {

    Product product;
    InventoryNode next;

    // Constructor
    public InventoryNode(Product product) {
        this.product = product;
        this.next = null;
    }
}