package com.test.authentication;

import com.test.authentication.domain.Invoice;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class Invoices {

    @ResponseStatus(OK)
    @RequestMapping(value = "/invoice/{id}", method = GET)
    public Invoice readInvoice(@PathVariable("id") String invoiceId) {
        return new Invoice();
    }

    @ResponseStatus(CREATED)
    @RequestMapping(value = "/invoice", method = POST)
    public Invoice createInvoice(@RequestBody CreateOrUpdateInvoiceRequest createCustomerRequest) {
        return new Invoice();
    }

    @ResponseStatus(OK)
    @RequestMapping(value = "/invoice/{id}", method = PUT)
    public Invoice updateInvoice(@RequestBody CreateOrUpdateInvoiceRequest createOrUpdateInvoiceRequest) {
        return new Invoice();
    }

    @ResponseStatus(OK)
    @RequestMapping(value = "/invoice/{id}", method = DELETE)
    public void deleteInvoice() {
    }

}