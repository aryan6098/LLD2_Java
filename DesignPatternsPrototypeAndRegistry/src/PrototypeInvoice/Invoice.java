package PrototypeInvoice;

public class Invoice implements ClonableObject<Invoice>{

    private Long invoiceId;
    private String customerName;
    private Double amount;
    private String paymentMethod;
    private InvoiceType type;

    public Invoice(Long invoiceId,String customerName,  Double amount, String paymentMethod, InvoiceType type) {
        this.invoiceId = invoiceId;
        this.amount = amount;
        this.customerName = customerName;
        this.paymentMethod = paymentMethod;
        this.type = type;
    }

    public Long getInvoideId() {
        return invoiceId;
    }

    public void setInvoideId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public InvoiceType getType() {
        return type;
    }

    public void setType(InvoiceType type) {
        this.type = type;
    }

    @Override
    public Invoice cloneObject() {
        return new Invoice(this.invoiceId, this.customerName,  this.amount, this.paymentMethod, this.type);
    }
}
