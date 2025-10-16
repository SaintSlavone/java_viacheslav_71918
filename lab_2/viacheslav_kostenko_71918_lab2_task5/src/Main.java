void main() {
    double product = 9.99;

    double vat_price = product / 100 * 23 + product;

    System.out.println("Product price without VAT: " + product);
    System.out.println("Product price with VAT: " + vat_price);
    System.out.println("Price for 10,000 peace without VAT: " + (product * 10_000));
    System.out.println("Price for 10,000 peace with VAT: " + (vat_price * 10_000));
}
